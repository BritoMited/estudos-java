package db.aplication;

import db.DB;
import db.DBIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletar {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;
        Scanner sc = new Scanner(System.in);


        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM department " +
                            "WHERE (Id = ?)"
            );

            st.setInt(1, 2);

            int linhasAfetadas = st.executeUpdate();

            System.out.println(linhasAfetadas);

        } catch (SQLException e) {
            throw new DBIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();

        }

    }
}
