package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
		/** M�dulo de Conex�o **/
	private String driver ="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://127.0.0.1:3306/DB_AGENDA?useTimezone=true&serverTimezone=UTC";
	private String user ="root";
	private String password = "External123#";
			
		/**M�TODO DE CONEX�O **/
	private Connection conectar() {
		Connection con = null;
		
		try {
			Class.forName(driver);
			con= DriverManager.getConnection(url,user,password);
			return con;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
//	//TESTE DE CONEX�O
//	public void testeConexao() {
//		try {
//			Connection con = conectar();
//			System.out.println(con);
//		}catch (Exception  e ) {
//			System.out.println(e);
//		}
//	}
}
