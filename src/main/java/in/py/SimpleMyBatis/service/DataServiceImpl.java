package in.py.SimpleMyBatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.py.SimpleMyBatis.dao.DataDao;
import in.py.SimpleMyBatis.model.User;

@Service("dataService")
public class DataServiceImpl implements DataService {

	@Autowired
	private DataDao dataDao;

	@Override
	public List<User> getAllUsers() {
		return dataDao.getAllUsers();
	}

	@Override
	public User getUserById(int id) {
		return dataDao.getUserById(id);
	}

	@Override
	public int getUserIdByName(String name) {
		return dataDao.getUserIdByName(name);
	}

	@Override
	public int postUserDetails(User newUser) {
		return dataDao.postUserDetails(newUser.getName(), newUser.getPwd(), newUser.getId());
	}

	@Override
	public int deleteUser(int id) {
		return dataDao.deleteUser(id);
	}

	@Override
	public int updateUserDetails(User updatedUser, int paramId) {
		return dataDao.updateUserDetails(updatedUser.getName(), updatedUser.getPwd(), updatedUser.getId(), paramId);
	}

}






