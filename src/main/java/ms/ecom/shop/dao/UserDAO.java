package ms.ecom.shop.dao;

import ms.ecom.shop.model.UserModel;


import java.util.List;

public interface UserDAO {
	void insertusr(UserModel  u);
	UserModel get(int usrid);
}



