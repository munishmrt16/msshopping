package ms.ecom.shop.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ms.ecom.shop.model.VisModel;

@Transactional
public class VisDAOImpl implements VisDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertvis(VisModel v) {
		sessionFactory.getCurrentSession().persist(v);
		// TODO Auto-generated method stub
	}

}
