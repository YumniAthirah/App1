package lesson10.Q13WeatherApp.WeatherApp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WeatherService {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3307/weatherapp";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "#Yum0228";

    public WeatherService(){}

    public void insert(Location data) {
        String INSERT_SQL = "insert into weatherlocation (favlocation, date) values(?, ?);";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {

            preparedStatement.setString(1, data.getfavlocation());
            preparedStatement.setDate(2, data.getDate());

            System.out.println(preparedStatement);
            preparedStatement.execute();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getlatestLocation() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            System.out.println("Connected to the database.");

            // Creating a PreparedStatement
            String query = "SELECT * FROM weatherlocation ORDER BY id DESC LIMIT 1;";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Processing the result set
                    if (resultSet.next()) {
                        String fav = resultSet.getString("favlocation");
                        return fav;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
