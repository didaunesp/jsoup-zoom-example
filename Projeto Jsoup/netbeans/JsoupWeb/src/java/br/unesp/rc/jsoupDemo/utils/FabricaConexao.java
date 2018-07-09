package br.unesp.rc.jsoupDemo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FabricaConexao implements IMySQL {

    private FabricaConexao() {

    }

    public static Connection getConexao() {
        Connection con = null;

        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            String msg = ex.getMessage();
            msg = msg;
        }

        return con;
    }

    public static void close(Connection con) {

    }

    public static void close(Connection con, PreparedStatement pstm) {

    }

    public static void close(Connection con, PreparedStatement pstm, ResultSet res) {

    }

}
