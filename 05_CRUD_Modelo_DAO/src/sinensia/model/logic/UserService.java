package sinensia.model.logic;

import java.sql.SQLException;
import java.util.List;
import sinensia.model.persistence.IUserDAO;
import sinensia.model.User;

/**
 * @author Ainoa
 */
public class UserService {
	
	IUserDAO daoUsers;
	
	public UserService(IUserDAO daoUsers){
		this.daoUsers = daoUsers;
	}
	
	public User create(String email, String password, String name, int age) throws SQLException {
		User u = null;
		
		if(email != null && password != null && name != null){
			if(email.length() > 3 
					&& ! password.equals("") 
					&& ! name.equals("")
					&& age > 0){

				//TODO: Crear objeto usuario y añadir a BBDD
				u = new User(email,password,name,age);
				u = daoUsers.create(u);
			}
		}	
		return u;
	}
	
	public List<User> getAll() throws SQLException {
		return daoUsers.getAll();
	}
	
	public void delete(int id) throws SQLException {
		daoUsers.remove(id);
	}
}
