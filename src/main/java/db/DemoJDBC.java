package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoJDBC {

    public static void main(String[] args) {
        DemoJDBC demoJDBC = new DemoJDBC();
        demoJDBC.countDataFromDatabase();

    }

    private int countDataFromDatabase() {
        int result = -1;
        try {
            // 1. Load DB driver class
            Class.forName("xx.xxx.mysql");
            // 2. Create connection
            Connection connection = DriverManager.getConnection("url", "user", "password");
            // 3. Prepare statement :: SQL
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(1) AS C from USER");
            // 4. Result of data from DB (SQL)
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                result = resultSet.getInt("C");
            }

            // 5. Released resources
            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
