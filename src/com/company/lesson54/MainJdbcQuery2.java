package com.company.lesson54;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainJdbcQuery2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/mydb";
        Connection connection = DriverManager.getConnection(url, "postgres", "postgre123");
        Scanner sc= new Scanner(System.in);
        System.out.println("Ad");
        String name =sc.next();
        System.out.println("Yeni Ad");
        String surname =sc.next();
        String sql = "update myschema.teacher3 set name=?  where name=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, surname);
        preparedStatement.setString(2,name);

//        System.out.println(statement.executeUpdate(sql));

        int count = preparedStatement.executeUpdate();
        System.out.println("Update olan rowlar" + count);

        preparedStatement.close();
        connection.close();
    }
}
