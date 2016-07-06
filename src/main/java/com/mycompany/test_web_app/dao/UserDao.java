
package com.mycompany.test_web_app.dao;

import com.mycompany.test_web_app.models.User;
import java.util.List;

/**
 *
 * @author eguseynov
 * базовые методы
 */
public interface UserDao {
    
    public User createUser(User user);
    public User getUserById(Integer id);
    public List<User> getListUsers();
    public void updateUserById(Integer id, User user);
    public void deleteUser(User user);
    
}
