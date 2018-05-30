package in.py.SimpleMyBatis.service;

import java.util.List;

import in.py.SimpleMyBatis.model.User;

public interface DataService {
	
	public List<User> getAllUsers();
	
	public User getUserById(int id);
	
	public int getUserIdByName(String name);

	public int postUserDetails(User newUser);

	public int deleteUser(int id);

	public int updateUserDetails(User updatedUser, int paramId);
}
