package db.aplication;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Transação {public static void main(String[] args) {

    Connection conn = null;
    Statement st = null;
    Scanner sc = new Scanner(System.in);


    try{
        conn = DB.getConnection();
        conn.setAutoCommit(false); // só pode ser feita alteração quando confirmada

        st = conn.createStatement();

        int linhas1 = st.executeUpdate(
                "UPDATE seller " +
                        "SET BaseSalary = 2090 " +
                        "WHERE DepartmentId = 1");

//        int y = 1;

//        if (y < 2) throw new SQLException("erro falso");

        int linhas2 = st.executeUpdate(
                "UPDATE seller " +
                        "SET BaseSalary = 3030 " +
                        "WHERE DepartmentId = 2");

        conn.commit(); // confirmação feita

        System.out.println(linhas1);
        System.out.println(linhas2);

    }catch (SQLException e){
        try {
            conn.rollback();
            throw new DbException("transação rolled back" + e.getMessage());
        } catch (SQLException ex) {
            throw new DbException("erro no rollback" + e.getMessage());
        }
    }finally {
        DB.closeStatement(st);
        DB.closeConnection();

    }

}

}
