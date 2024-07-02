import java.sql.*;

public class UpdatePlainJdbcExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/test_db";
    static final String USER = "root";
    static final String PASS = "0000";
    static final String SQL = "DELETE  FROM students WHERE id = ?";

    public static void main(String[] args) {

        // 1. DB conn (username, pw, db_url)
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement ps = conn.prepareStatement(SQL)) {

            // 2. conn.statement (SQL)
            int id = 3;
            ps.setInt(1, id);

            int rowNum = ps.executeUpdate();

            // 3. 실행 결과 출력
            System.out.println("rowNum: " + rowNum);

        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
            System.out.println(e.getMessage());
        }
    }
}
