package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Base {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/ql_furama";
    private String username = "root";
    private String password = "123456";
    private Connection connection;

    public Base(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcUrl, username,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
