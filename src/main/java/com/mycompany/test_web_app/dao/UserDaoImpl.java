
package com.mycompany.test_web_app.dao;

import com.mycompany.test_web_app.models.User;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author eguseynov
 */
@Transactional
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    
    private final Log log = LogFactory.getLog(UserDaoImpl.class);
    
    private SessionFactory sessionFactory;

    @Resource(name = "sessionFactory")// связываем с бином
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    /*
    этот метод используя внутри себя sessionFactory.getCurrentSession()
    сначала получает текущую сессию в виде Session,
    после вызывает метод для работы с объектом user,
    конечно записываем в лог
    */
    @Override
    public User createUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
        log.info("User created by + " + user.getId());
        return user;
    }

    @Override
    public User getUserById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getListUsers() {
        String sql = "FROM User as u";
        return sessionFactory.getCurrentSession().createQuery(sql).list();
    }

    @Override
    public void updateUserById(Integer id, User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
