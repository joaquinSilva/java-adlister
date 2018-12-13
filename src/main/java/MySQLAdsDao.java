import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {

    DriverManager.registerDriver(new Driver());

    private Connection connection;

    private Config config = new Config;

    public MySQLAdsDao(Connection connection, Config config) {
        this.connection = connection;
        try {
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
