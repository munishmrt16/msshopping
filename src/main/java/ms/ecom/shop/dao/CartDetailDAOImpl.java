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
	public List<CartDetailModel> getAll() {
		// TODO Auto-generated method stub
	return sessionFactory.getCurrentSession().createQuery("from CartDetailModel").list();
	}

	@Override
	public void insert(CartDetailModel c) {
		sessionFactory.getCurrentSession().persist(c);
				// TODO Auto-generated method stub

	}

	@Override
	public CartDetailModel get(int cid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(CartDetailModel.class, cid);
			}

	@Override
	public void update(CartDetailModel c) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(c);
	}

	@Override
	public void delete(int cid) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().remove(get(cid));
	}
}
