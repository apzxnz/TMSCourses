package com.tms.jdbc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbService {

    Connection connection;
    private static final String jdbcUrl = "jdbc:postgresql://localhost/tms?currentSchema=tms";
    private static final String password = "postgres";
    private static final String user = "postgres";

    public DbService() {
        init();
    }

    private void init() {
        try {
            createConnection();
            createDb(connection);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private void createConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(jdbcUrl, user, password);
        }
    }

    private void createDb(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("create table if not exists users " +
                    "(" +
                    "user_id bigserial constraint users_pk primary key, login varchar," +
                    " password varchar, description varchar, sex varchar, role varchar" +
                    ")"
            );
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
