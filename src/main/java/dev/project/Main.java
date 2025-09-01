package dev.project;

import dev.project.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

import static dev.project.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) {
        try (var connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        }catch (Exception e){
            System.err.println("ERROS DA APLICAÇÃO: " + e.getClass().getName() + " - " + e.getMessage());
        }
    }
}
