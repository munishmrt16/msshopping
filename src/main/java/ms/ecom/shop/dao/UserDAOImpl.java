package ms.ecom.shop.dao;

import java.util.List;

import ms.ecom.shop.model.ProductModel;
import ms.ecom.shop.model.UserModel;
import ms.ecom.shop.model.VisModel;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertusr(UserModel v) {
		sessionFactory.getCurrentSession().persist(v);
		// TODO Auto-generated method stub
	}
	
	@Override
	public UserModel get(int usrid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(UserModel.class, usrid);

	}
}
