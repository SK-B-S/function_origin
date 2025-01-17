package tool;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// "*.action
@WebServlet(urlPatterns={"*.action"})
public class FrontController extends HttpServlet {

	public void doPost(
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
//			Servletのあつ場所を取得
			String path=request.getServletPath().substring(1);

//			実際に実行するアクションを呼ぶ準備
			String name=path.replace(".a", "A").replace('/', '.');
			Action action=(Action)Class.forName(name).
				getDeclaredConstructor().newInstance();

//			抽象クラスを呼び出し　<=　アクション（javaクラス）の実行
			String url=action.execute(request, response);
			request.getRequestDispatcher(url).
				forward(request, response);
		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}

	public void doGet(
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		doPost(request, response);
	}
}
