package trainingManagementSystem.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import trainingManagementSystem.dao.UserDao;
import trainingManagementSystem.model.User;

@Component
@Service
public class UserServices {

	@Autowired
	UserDao userDao;

	// save user
	public void saveUser(User user) {
		try {
			userDao.saveUser(user);
		} catch (Exception e) {
			throw e;
		}
	}

	// get all user
	public List<User> getAllUser() {
		try {
			return userDao.getAllUser();
		} catch (Exception e) {
			throw e;
		}
	}

	// get by id
	public User getById(Long id, Boolean isLock) {
		try {
			return userDao.getById(id, isLock);
		} catch (Exception e) {
			throw e;
		}
	}

	// update user
	public void updateUser(User user) {
		try {
			userDao.updateUser(user);
		} catch (Exception e) {
			throw e;
		}
	}

	// delete User
	public void deleteUser(Long id) {
		try {
			userDao.deleteUser(id);
		} catch (Exception e) {
			throw e;
		}
	}

	public List<Object[]> loadUsersNotinManagerID() {
		try {
			return userDao.loadUsersNotinManagerID();
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}

}
