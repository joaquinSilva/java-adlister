import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
        List<Ad> allAds = new ArrayList<>();
        try {
            String selectQuery = "SELECT * FROM ads;";
            Statement statement = connection.createStatement();
            ResultSet rs =  statement.executeQuery(selectQuery);

            while (rs.next()) {
                Ad result = new Ad(
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                allAds.add(result);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allAds;
    }

    @Override
    public Long insert(Ad ad) {
        long lastInsertedID = 0;
        String title = ad.getTitle();
        String description = ad.getDescription();
        Long userId = ad.getUserId();
        String insertQuery = String.format("INSERT INTO ads(user_id, title, description)" +
                "VALUES (%d, '%s', '%s')", userId, title, description);
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedID = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lastInsertedID;
    }

}
