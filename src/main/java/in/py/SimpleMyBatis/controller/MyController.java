package in.py.SimpleMyBatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.py.SimpleMyBatis.service.DataService;
import in.py.SimpleMyBatis.model.*;

@RestController
@RequestMapping("/")
public class MyController {

	@Autowired
	public DataService dataService;

	@RequestMapping(value = "showAll", method = RequestMethod.GET)
	public List<User> showAll() {
		return dataService.getAllUsers();
	}

	@RequestMapping(value = "show/{id}", method = RequestMethod.GET)
	public User getUserBy(@PathVariable("id") int id) {
		return dataService.getUserById(id);
	}

	@RequestMapping(value = "show/name/{name}", method = RequestMethod.GET)
	public int getUserIdByName(@PathVariable String name) {
		return dataService.getUserIdByName(name);
	}

	@RequestMapping(value = "postUserDetails", method = RequestMethod.POST)
	public int postUserDetails(@RequestBody User newUser) {
		return dataService.postUserDetails(newUser);
	}

	@RequestMapping(value = "updateUserDetails/{paramId}", method = RequestMethod.PUT)
	public int updateUserDetails(@RequestBody User updatedUser, @PathVariable int paramId){
		return dataService.updateUserDetails(updatedUser, paramId);
	}
	
	@RequestMapping(value = "deleteUser/{id}", method = RequestMethod.DELETE)
	public int deleteUser(@PathVariable int id) {
		return dataService.deleteUser(id);
	}
}
