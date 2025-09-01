package dev.project.persistence.config;


import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        var connection = DriverManager.getConnection("jdbc:mysql://localhost/board", "root", "root");
        connection.setAutoCommit(false);
        return connection;
    }
}
