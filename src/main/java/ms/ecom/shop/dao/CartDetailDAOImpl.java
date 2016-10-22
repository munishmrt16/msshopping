package ms.ecom.shop.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ms.ecom.shop.model.CartDetailModel;

@Transactional
public class CartDetailDAOImpl implements CartDetailDAO {

	@Autowired
	private SessionFactory sessionFactory;
		
	@Override
	public List<CartDetailModel> getAllCD() {
		return sessionFactory.getCurrentSession().createQuery("from CartDetailModel").list();
	}

	@Override
	public void insertCD(CartDetailModel cdm) {
		sessionFactory.getCurrentSession().persist(cdm);		

	}
	@Override
	public CartDetailModel getCD(int cid) {
				return sessionFactory.getCurrentSession().get(CartDetailModel.class, cid);
	}
	@Override
	public void updateCD(CartDetailModel cdm) {
		sessionFactory.getCurrentSession().update(cdm);		
	}

	@Override
	public void deleteCD(int cid) {
		sessionFactory.getCurrentSession().remove(getCD(cid));
	}
}
