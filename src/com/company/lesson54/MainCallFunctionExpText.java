package com.company.lesson54;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class MainCallFunctionExpText {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/mydb";
        Connection connection = DriverManager.getConnection(url, "postgres", "postgre123");
        CallableStatement callableStatement = connection.prepareCall("{?= call myschema.transferfun(?)}");
        callableStatement.registerOutParameter(1, Types.VARCHAR );
        callableStatement.setInt(2,1);
        callableStatement.execute();
        System.out.println(callableStatement.getString(1));
        callableStatement.close();
        connection.close();

    }
}
