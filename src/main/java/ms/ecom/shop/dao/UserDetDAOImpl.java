package ms.ecom.shop.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ms.ecom.shop.model.UserDetModel;


@Transactional
public class UserDetDAOImpl implements UserDetDAO {

	@Autowired
	private SessionFactory session;

	@Override
	public void insertUser(UserDetModel user) {
		session.getCurrentSession().persist(user);

	}

	@Override
	public UserDetModel getUserDetails(String userid) {

		UserDetModel user = session.getCurrentSession().get(UserDetModel.class, new String(userid));
		return user;

	}

}




