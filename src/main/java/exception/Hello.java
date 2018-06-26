package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Hello {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.start();
    }

    private void start() {
//        UserDatabase userDatabase = new UserDatabase();
//        try {
//            userDatabase.getName(1);
//        } catch (UserNotFoundException | InternalException | DatabaseProblemException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        try {
            div(1,0);
        } catch (InputCannotZeroException e) {
            System.out.println("Error");
        }
    }

    private double div(int a, int b) {
        if (b != 0)
        {
            return a/b;
        }
        throw new InputCannotZeroException();
    }
}

class UserDatabase {
    public String getName(int id) throws UserNotFoundException, InternalException, DatabaseProblemException {
        try {
            Class.forName("mysql.xxxx");
            Connection connection = DriverManager.getConnection("url");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM TABLE");
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                return resultSet.getString("NAME");
            }
            throw new UserNotFoundException();
        } catch (ClassNotFoundException e) {
            throw new InternalException();
        } catch (SQLException e) {
            throw new DatabaseProblemException();
        }
    }
}