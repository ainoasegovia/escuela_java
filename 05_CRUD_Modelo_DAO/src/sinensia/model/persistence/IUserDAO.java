package sinensia.model.persistence;

import java.sql.SQLException;
import java.util.List;
import sinensia.model.User;

/** Interfaz DAO para gestion de usuarios. Todas las sentencias
 * pueden lanzar SQLException
 * 
 * @author Ainoa
 */
public interface IUserDAO {

	User create(User user) throws SQLException;
	List<User> getAll() throws SQLException;
	boolean remove(int id) throws SQLException;
	//boolean remove(User user) throws SQLException;
	User update(User user) throws SQLException;
	
}
