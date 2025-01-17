package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Vege;

public class VegeDAO extends DAO {

    // 野菜データを取得するメソッド
    public List<Vege> getAllVeges() throws Exception {
        List<Vege> veges = new ArrayList<>();
        String sql = "SELECT * FROM VEGE";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int vegeId = rs.getInt("vege_id");
                String vegeName = rs.getString("vege_name");
                veges.add(new Vege(vegeId, vegeName));
            }
        }
        return veges;
    }
}
