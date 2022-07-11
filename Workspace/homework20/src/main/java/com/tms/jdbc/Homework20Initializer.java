package com.tms.jdbc;

import com.tms.jdbc.entity.Role;
import com.tms.jdbc.entity.Sex;
import com.tms.jdbc.entity.User;
import com.tms.jdbc.service.DbService;
import com.tms.jdbc.service.UserService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Homework20Initializer {
    public static void main(String[] args) throws SQLException {
        DbService dbService = new DbService();
        UserService userService = new UserService(dbService.getConnection());
        User user = new User("testuser1", "password1", "vasya", Sex.MALE, Role.USER);
        userService.save(user);
        System.out.println(userService.findAll());
        user.setLogin("testuser1newlogin");
        userService.update(user);
        System.out.println(userService.findAll());
        //System.out.println(userService.findOneById(3L));
        //userService.delete(3L);
    }
}
