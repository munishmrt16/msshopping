package ms.ecom.shop.dao;

import ms.ecom.shop.model.*;

public interface UserDetDAO {

	public void insertUser(UserDetModel user);
	public UserDetModel getUserDetails(String email);
	
}
