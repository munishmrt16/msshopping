package ms.ecom.shop.dao;

import ms.ecom.shop.model.UserModel;

import java.util.List;

public interface UserDAO {

	public List<UserModel> getalluser();
	void insertuser(UserModel  p);
	UserModel getuser(int pid);
	void updateuser(UserModel p);
	public void deleteuser(int pid);
	
}



