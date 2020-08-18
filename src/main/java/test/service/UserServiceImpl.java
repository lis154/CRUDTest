package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.DAO.UserDAO;
import test.model.User;
import test.config.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl {


    private final UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    public List<User> allUser(int page) {
        return userDAO.allUser(page);
    }

    @Transactional
    public void add(User user) {
        userDAO.add(user);
    }


    @Transactional
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Transactional
    public void edit(User user) {
        userDAO.edit(user);
    }

    @Transactional
    public User getById(int id) {
        return userDAO.getById(id);
    }

    @Transactional
    public int userCount(){
        return userDAO.userCount();
    }
}
