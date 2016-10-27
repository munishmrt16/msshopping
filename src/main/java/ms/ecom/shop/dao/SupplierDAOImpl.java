package ms.ecom.shop.dao;

import java.util.List;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ms.ecom.shop.model.SupplierModel;



@Transactional
public class SupplierDAOImpl implements SupplierDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<SupplierModel> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from SupplierModel").list();
	}

	@Override
	public void insert(SupplierModel c) {
		sessionFactory.getCurrentSession().persist(c);		

	}

	@Override
	public SupplierModel get(int cateid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(SupplierModel.class, cateid);

	}

	@Override
	public void update(SupplierModel c) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(c);		
	}

	@Override
	public void delete(int cateid) {
		sessionFactory.getCurrentSession().remove(get(cateid));

	}
	
}
