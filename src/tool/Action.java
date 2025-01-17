package tool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 抽象化クラス
//　処理（中身）がない
public abstract class Action {
	public abstract String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception;
}
