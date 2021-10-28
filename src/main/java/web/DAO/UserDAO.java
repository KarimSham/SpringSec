package web.DAO;

import web.model.User;
import java.util.List;

public interface UserDAO {

    List<User>getAllUsers ();
    User getUserById(long id);
    User addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
    User getUserByLogin(String username);
}
