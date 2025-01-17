package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    private static final String URL = "jdbc:h2:tcp://localhost/~/PJ"; // H2データベースのURL
    private static final String USER = "sa"; // デフォルトのユーザー名
    private static final String PASSWORD = ""; // デフォルトのパスワード（通常は空）

    static {
        try {
            // H2 JDBCドライバのロード
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // データベース接続を取得
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // データベース接続をクローズ
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
