import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
