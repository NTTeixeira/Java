package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.Db;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
		boolean check = false;

		try {
			conn = Db.getConnection();
			st = conn.createStatement();

			/*
			 * rs = st.executeQuery("select * from funcionario");
			 * 
			 * while (rs.next()) { 
			 * System.out.println(rs.getString("nome") + ", " + rs.getString("cpf")); }
			 */
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ConnectionProgram.connection(conn, st, rs, pst, check);
		Db.closeConnection();
	}
}
