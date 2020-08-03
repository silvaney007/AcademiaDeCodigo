package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.presistence.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class JdbcUserService implements UserService {

    private final Connection dbConnection;

    public JdbcUserService() {
        dbConnection = ConnectionManager.getConnection();
    }

    @Override
    public boolean authenticate(String username, String password) {
        try {
            Statement statement = dbConnection.createStatement();

            String query = "SELECT userName, password FROM ac As u WHERE EXISTS" +
                    "(SELECT userName , password FROM ac As u WHERE" +
                    " u.userName = " + username + "and u.password == " + password + ")";

            statement.executeUpdate(query);

            if (statement != null) {
                statement.close();
            }

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }

        return false;
    }

    @Override
    public void add(User user) {

        try {
            Statement statement = dbConnection.createStatement();

            String query = "INSERT INTO user (username, password, email, firstName, lastName, phone)" + "("
                    + user.getUsername() + "," + user.getUsername() + "," + user.getUsername() + "," + user.getUsername()
                    + "," + user.getUsername() + "," + user.getUsername() + ");";

            statement.executeUpdate(query);
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public User findByName(String username) {

        User user = null;

        try {
            Statement statement = dbConnection.createStatement();
            String query = "SELECT user FROM user As u where u.userName == " + username + ")";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {

                String usernameValue = resultSet.getString("username");
                String passwordValue = resultSet.getString("password");
                String emailValue = resultSet.getString("email");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String phone = resultSet.getString("phone");

                user = new User(usernameValue, passwordValue, emailValue, firstName, lastName, phone);
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new LinkedList<>();
        try {

            Statement statement = dbConnection.createStatement();
            String query = "SELECT user FROM userDataBase";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                String usernameValue = resultSet.getString("username");
                String passwordValue = resultSet.getString("password");
                String emailValue = resultSet.getString("email");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String phone = resultSet.getString("phone");

                users.add(new User(usernameValue, passwordValue, emailValue, firstName, lastName, phone));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return users;
    }

    @Override
    public int count() {
        int result = 0;

        try {
            Statement statement = dbConnection.createStatement();
            String query = "SELECT COUNT(*) FROM user ";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                result = resultSet.getInt("username");
            }
        } catch (SQLException exception) {

        }
        return result;
    }
}

