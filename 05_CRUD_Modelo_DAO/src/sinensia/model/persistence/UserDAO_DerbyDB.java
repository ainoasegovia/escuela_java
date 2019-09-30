package sinensia.model.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sinensia.model.User;

/**
 * @author Ainoa
 */
public class UserDAO_DerbyDB implements IUserDAO {
	
	private static final String CONEX_DB = "jdbc:derby://localhost:1527/db_users";
	private static final String USER_DB = "root";
	private static final String PSSWD_DB = "1234";

	public UserDAO_DerbyDB(){
		try {
			// Cargamos el driver de Derby DB. Esta basado en JDBC,
			// Una implementacion de ODBC para Java

			Class.forName("org.apache.derby.jdbc.ClientDriver");
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

		} catch (Exception ex) {
			Logger.getLogger(UserDAO_DerbyDB.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	@Override
	public User create(User user) throws SQLException {
		Connection con = null;
		
		con = DriverManager.getConnection(CONEX_DB, USER_DB, PSSWD_DB);
		/*String sqlQuery = "INSERT INTO users(email,password,name,age) VALUES ("
				+ " '" + user.getEmail() + "', '" + user.getPassword() + "', '" + user.getName() + "', " + user.getAge() + ")";
		
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sqlQuery); */
		
		//Los ? son los parametros de la sentencia SQL. Evitamos SQL Injection
		
		String sqlQuery = "INSERT INTO users(email,password,name,age) VALUES (?, ?, ?, ?)"; 
		
		PreparedStatement prepStmt = con.prepareCall(sqlQuery);
			
		prepStmt.setString(1, user.getEmail());
		prepStmt.setString(2, user.getPassword());
		prepStmt.setString(3, user.getName());
		prepStmt.setInt(4, user.getAge());

		prepStmt.executeUpdate();
		
		// Buscamos el id a traves del email
		
		String sqlQuery1 = "SELECT id FROM users WHERE email = ? ";
		
		PreparedStatement prepStmt1 = con.prepareCall(sqlQuery1);
		prepStmt1.setString(1, user.getEmail());
		
		ResultSet res = prepStmt1.executeQuery();
		
		while(res.next()){
			int id = res.getInt("id");
			user.setId(id);
		}
		
		con.close();
			
		return user;
	}
	
	@Override
	public List<User> getAll() throws SQLException {
		try(Connection con = DriverManager.getConnection(CONEX_DB, USER_DB, PSSWD_DB)){ // Objeto gestionado por el try
			
			ArrayList<User> usersList = new ArrayList<>();
			
			String sqlQuery = "SELECT id, email, password, name, age FROM users";
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(sqlQuery);
			
			while(res.next()){
				int id = res.getInt("id");
				String email = res.getString("email");
				String password = res.getString("password");
				String name = res.getString("name");
				int age = res.getInt("age");
				
				User newUser = new User(email,password,name,age);
				
				newUser.setId(id);
				usersList.add(newUser);
			}
			
			return usersList;
			
		}
	}

	@Override
	public boolean remove(int id) throws SQLException {
		try (Connection con = DriverManager.getConnection(CONEX_DB, USER_DB, PSSWD_DB)) {
			
			String sqlQuery = "DELETE FROM users WHERE id = ? ";
			
			PreparedStatement prepStmt = con.prepareCall(sqlQuery);
			prepStmt.setInt(1, id);
			
			prepStmt.executeQuery();
		}
		
		return true;
	}	

}