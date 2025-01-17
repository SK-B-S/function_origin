package tool;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class CommonServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			get(req, resp);
		} catch (Exception e) {
			// エラーメッセージをブラウザに表示（開発用）
			PrintWriter out = resp.getWriter();
			e.printStackTrace(out);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			post(req, resp);
		} catch (Exception e) {
			// エラーメッセージをブラウザに表示（開発用）
			PrintWriter out = resp.getWriter();
			e.printStackTrace(out);
		}
	}

	public abstract void get(HttpServletRequest req, HttpServletResponse resp) throws Exception;

	public abstract void post(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
