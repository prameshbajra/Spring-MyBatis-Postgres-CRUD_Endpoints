package in.py.SimpleMyBatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import in.py.SimpleMyBatis.model.User;

@Component
public interface DataDao {

	public String selectAllUsers = "SELECT name, pwd, id FROM users";

	@Select(selectAllUsers)
	public List<User> getAllUsers();

	public String selectUserById = "Select name from users where id= #{id}";

	@Select(selectUserById)
	public User getUserById(@Param("id") Integer id);

	public String selectUserIdByName = "Select id from users where name= #{name}";

	@Select(selectUserIdByName)
	public int getUserIdByName(@Param("name") String name);

	public String postUser = "INSERT INTO users (name , pwd, id) VALUES( #{name}, #{pwd}, #{id})";

	@Insert(postUser)
	public int postUserDetails(@Param("name") String name, @Param("pwd") String pwd, @Param("id") int id);

	public String deleteUser = "DELETE FROM users WHERE id = #{id}";

	@Delete(deleteUser)
	public int deleteUser(@Param("id") int id);

	public String updateUserDetails = "UPDATE users SET name = #{name} WHERE id = #{paramId} ";

	@Update(updateUserDetails)
	public int updateUserDetails(@Param("name") String name, @Param("pwd") String pwd, @Param("id") int id,
			@Param("paramId") int paramId);

}
