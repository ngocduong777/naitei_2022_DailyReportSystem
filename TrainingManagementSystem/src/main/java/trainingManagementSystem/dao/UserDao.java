package trainingManagementSystem.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import trainingManagementSystem.model.User;

@Component
public class UserDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	@Autowired
	private SessionFactory sessionFactory;

	// save user
	@Transactional
	public void saveUser(User user) {
		hibernateTemplate.save(user);
	}

	// get all User
	public List<User> getAllUser() {
		return hibernateTemplate.loadAll(User.class);
	}

	// get user by id
	public User getById(int id, Boolean isLock) {
		return hibernateTemplate.get(User.class, id);
	}

	// update user
	@Transactional
	public void updateUser(User user) {
		hibernateTemplate.update(user);
	}

	// delete user
	@Transactional
	public void deleteUser(Long id)

	{
		hibernateTemplate.delete(hibernateTemplate.get(User.class, id));
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> loadUsersNotinManagerID() {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Query query = (Query) session.createSQLQuery("select u.id FROM Users u WHERE u.id NOT IN (SELECT d.managerId FROM Divisions d)");
		List<Object[]> results = query.list();
		return results;
	}

	

	

}
