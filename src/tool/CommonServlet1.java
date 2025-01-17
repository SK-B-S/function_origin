package tool;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * CoomonServlet extends HttpServlet 全サーブレット共通の処理を表す抽象クラス
 *
 */
//　Commn　＝　共通　＝＞　共通の処理を記憶
//　必ず実行される　doget　or　dopost　を共通で定義（共通処理でまとめるため）
public abstract class CommonServlet1  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		dogetメソッドが実行されると例外処理を共通
//		で行いながら、getメソッドを実行
//		getメソッドは各サーブレットで記述（オーバーライド）する
		try {
			get(req, resp);
		} catch (Exception e) {
			// 開発用エラー表示
			PrintWriter out = resp.getWriter();
			e.printStackTrace(out);

			// 本番用エラー表示
			// e.printStackTrace();
			// resp.sendRedirect("/shop/error");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			post(req, resp);
		} catch (Exception e) {
			// 開発用エラー表示
			PrintWriter out = resp.getWriter();
			e.printStackTrace(out);

			// 本番用エラー表示
			// e.printStackTrace();
			// resp.sendRedirect("/shop/error");
		}
	}

	/**
	 * ページごとのGETの処理を記述
	 *
	 * @param req
	 * @param resp
	 * @throws Exception
	 */
	protected abstract void get(HttpServletRequest req, HttpServletResponse resp) throws Exception;

	/**
	 * ページごとのPOSTの処理を記述
	 *
	 * @param req
	 * @param resp
	 * @throws Exception
	 */
	protected abstract void post(HttpServletRequest req, HttpServletResponse resp) throws Exception;

}
