package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import db.Db;
import model.entities.Funcionario;

public class ConnectionProgram {

	public static void connection(Connection conn, Statement st, ResultSet rs, PreparedStatement pst, boolean check) {
		
		try {
			conn = Db.getConnection();
			st = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		do {
			String login = JOptionPane.showInputDialog("Login:");
			String senha = JOptionPane.showInputDialog("Senha:");

			Funcionario func = new Funcionario(login, senha);
			try {
				pst = conn.prepareStatement("SELECT * FROM funcionario WHERE login = ? AND senha = ?");
				pst.setString(1, func.getLogin());
				pst.setString(2, func.getSenha());
				rs = pst.executeQuery();

				if (rs.next()) {
					check = true;
					JOptionPane.showMessageDialog(null,"Login Válido", "Message", 1);
				} else {
					JOptionPane.showMessageDialog(null, "Login inválido", "Message", 0);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		try {
			pst = conn.prepareStatement("SELECT cargo FROM funcionario WHERE login = ?");
			pst.setString(1, func.getLogin());
			rs = pst.executeQuery();
			while (rs.next()) {
				if(rs.getString("cargo").equals("Gerente")) {
					JOptionPane.showMessageDialog(null, "Resultado do gerente certo!!", "Message", 1);
				}
				if(rs.getString("cargo").equals("Financeiro")) {
					JOptionPane.showMessageDialog(null, "Resultado do financeiro certo!!", "Message", 1);
				}
				if(rs.getString("cargo").equals("Mecanico")) {
					JOptionPane.showMessageDialog(null, "Resultado do mecanico certo!!", "Message", 1);
				}
				if(rs.getString("cargo").equals("Caixa")) {
					JOptionPane.showMessageDialog(null, "Resultado do caixa certo!!", "Message", 1);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}while (check != true);
	}
	
	public static void caixa() {
		
		
		
	}
}

