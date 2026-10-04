import java.sql.*;

public class mysql {
    Connection c;
    Statement s;

    public mysql() {
        try {
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/atm?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                "root",
                "root"
            );
            s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
