package db.aplication;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Insercao {
    public static void main(String[] args) {

        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement ps = null;

        try{

            conn = DB.getConnection();

            ps = conn.prepareStatement(
                    "INSERT INTO seller " +
                            "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
                            "VALUES " +
                            "(?,?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS
            );

            ps.setString(1,"BritoMited");
            ps.setString(2,"brito@mited.com");
            ps.setDate(3, new java.sql.Date(sfd.parse("22/04/1956").getTime()));
            ps.setDouble(4,3000.0);
            ps.setInt(5, 4);

//            ps.setString(6,"BritoMited");
//            ps.setString(7,"brito@mited.com");
//            ps.setDate(8, new java.sql.Date(sfd.parse("22/04/1956").getTime()));
//            ps.setDouble(9,3000.0);
//            ps.setInt(10, 4); teste

            int linhasAfetadas = ps.executeUpdate();

            if(linhasAfetadas > 0){
                ResultSet rs = ps.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1); // selecionando a coluna ja que o resultset retorna uma table
                    System.out.println(id);
                }

            }else System.out.println("nem afetou nada");


        }catch (SQLException e){
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }finally {

            DB.closeStatement(ps);
            DB.closeConnection();
        }

    }
}
