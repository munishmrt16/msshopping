package ms.ecom.shop.dao;

import java.util.List;

import ms.ecom.shop.model.UserModel;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<UserModel> getalluser() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from UserModel").list();
	}

	@Override
	public void insertuser(UserModel u) {
		sessionFactory.getCurrentSession().persist(u);

	}

	@Override
	public UserModel getuser(int userid) {
		return sessionFactory.getCurrentSession().get(UserModel.class, userid);
	}

	@Override
	public void updateuser(UserModel u) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(u);
	}

	@Override
	public void deleteuser(int uid) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().remove(getuser(uid));
	}

}
