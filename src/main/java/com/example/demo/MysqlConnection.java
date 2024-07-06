package com.example.demo;

import org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionCreator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {

    public String driver = "com.mysql.jdbc.Driver";

    public String database = "basedemo";

    public String hostname = "localhost";

    public String port = "3306";

    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    public String username = "root";

    public String password = "optimusprime0113";

    public Connection connectMysql() {

        Connection conn = null;

        try {

            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();

        }

        return conn;

    }

}