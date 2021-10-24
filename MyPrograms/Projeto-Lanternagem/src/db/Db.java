package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {

	private static Connection conn = null;
	private static Statement st = null;

	public static Connection getConnection() {
		String servidor = "jdbc:mysql://localhost:3306/bancolanternagem";
		String usuario = "root";
		String senha = "chessus123";
		String driver = "com.mysql.cj.jdbc.Driver";
		if (conn == null) {
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(servidor, usuario, senha);
				setSt(conn.createStatement());
			} catch (Exception e) {
				throw new DbException(e.getMessage());
			}
		}

		return conn;
	}

	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	public static Statement getSt() {
		return st;
	}

	public static void setSt(Statement st) {
		Db.st = st;
	}
}
