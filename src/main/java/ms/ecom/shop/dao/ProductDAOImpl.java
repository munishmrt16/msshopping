package ms.ecom.shop.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ms.ecom.shop.model.ProductModel;


@Transactional
public class ProductDAOImpl implements ProductDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
		
	@Override
	public List<ProductModel> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from ProductModel").list();
	}

	@Override
	public void insert(ProductModel p) {
		sessionFactory.getCurrentSession().persist(p);		

	}

	@Override
	public ProductModel get(int pid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(ProductModel.class, pid);

	}

	@Override
	public void update(ProductModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);		
	}

	@Override
	public void delete(int pid) {
		sessionFactory.getCurrentSession().remove(get(pid));

	}

}
