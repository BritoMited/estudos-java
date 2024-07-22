package db.aplication;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Atualizar {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;
        Scanner sc = new Scanner(System.in);


        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                   "UPDATE seller " +
                           "SET BaseSalary = BaseSalary + ? " +
                           "WHERE (DepartmentId = ?)"
            );

            System.out.println("vai querer dar quanto? (rs)");
            Double dinero = sc.nextDouble();

            st.setDouble(1, dinero);
            st.setInt(2, 2);

            int linhasAfetadas = st.executeUpdate();

            System.out.println(linhasAfetadas);

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DB.closeStatement(st);
            DB.closeConnection();

        }

    }
}
