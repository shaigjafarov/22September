package com.company.lesson54;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class MainCallFunctionExpText {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/mydb";
        Connection connection = DriverManager.getConnection(url, "postgres", "postgre123");
        connection.setAutoCommit(false);
//        CallableStatement callableStatement = connection.prepareCall("{?= call myschema.transferfun(?)}");
        CallableStatement callableStatement = connection.prepareCall("{?= call myschema.cursorret()}");
        callableStatement.registerOutParameter(1, Types.OTHER );
        callableStatement.execute();

        ResultSet resultSet = (ResultSet) callableStatement.getObject(1);
//        ResultSet resultSet = (ResultSet) callableStatement.getObject(1);
        while (resultSet.next()){
            System.out.println( resultSet.getInt(1));
            System.out.println(resultSet.getBigDecimal("balance"));
            System.out.println(resultSet.getString("name"));

        }


//        System.out.println(callableStatement.getString(1));
        callableStatement.close();

//        connection.commit();

        connection.close();

    }
}
