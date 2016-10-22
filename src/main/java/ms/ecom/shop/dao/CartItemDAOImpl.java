package ms.ecom.shop.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

import ms.ecom.shop.model.CartDetailModel;
import ms.ecom.shop.model.CartItemModel;



@Transactional
public class CartItemDAOImpl implements CartItemDAO
{

	@Autowired
	private SessionFactory sessionFactory;
		
	@Override
	public List<CartItemModel> getAllCI() {
		return sessionFactory.getCurrentSession().createQuery("from CartItemModel").list();
	}

	@Override
	public void insertCI(CartItemModel ci) {
		sessionFactory.getCurrentSession().persist(ci);		
	}

	@Override
	public CartItemModel getCI(int ci) {
				return sessionFactory.getCurrentSession().get(CartItemModel.class, ci);
	}
	@Override
	public void updateCI(CartItemModel ci) {
		sessionFactory.getCurrentSession().update(ci);		
	}

	@Override
	public void deleteCI(int ci) {
		sessionFactory.getCurrentSession().remove(getCI(ci));
	}
	
}



