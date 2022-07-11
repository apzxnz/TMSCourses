package com.tms.jdbc.service;

import com.tms.jdbc.entity.Role;
import com.tms.jdbc.entity.Sex;
import com.tms.jdbc.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private final Connection connection;

    public UserService(Connection connection) {
        this.connection = connection;
    }

    public void save(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "insert into users (login, password, description, sex, role) values (?, ?, ?, ?, ?)"
            );
            mapUserToPreparedStatement(preparedStatement, user);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public User findOneById(Long id) {
        User user = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where user_id = ?");
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = resultSetMapToUser(resultSet);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return user;
    }

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                users.add(resultSetMapToUser(resultSet));
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return users;
    }

    public void delete(Long id) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("delete from users where user_id = " + id);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public void update(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "update users set login = ?, password = ?, description = ?, sex = ?, role = ?"
            );
            mapUserToPreparedStatement(preparedStatement, user);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private User resultSetMapToUser(ResultSet resultSet) throws SQLException {
        return new User(
                resultSet.getLong(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getString(4),
                Sex.valueOf(resultSet.getString(5)),
                Role.valueOf(resultSet.getString(6))
            );
    }

    private void mapUserToPreparedStatement(PreparedStatement preparedStatement, User user) throws SQLException {
        preparedStatement.setString(1, user.getLogin());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.getDescription());
        preparedStatement.setString(4, user.getSex().name());
        preparedStatement.setString(5, user.getRole().name());
    }
}
