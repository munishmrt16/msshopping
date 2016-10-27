package ms.ecom.shop.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ms.ecom.shop.model.CategoryModel;

@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
		
	@Override
	public List<CategoryModel> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from CategoryModel").list();
	}

	@Override
	public void insert(CategoryModel c) {
		sessionFactory.getCurrentSession().persist(c);		

	}

	@Override
	public CategoryModel get(int cateid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(CategoryModel.class, cateid);

	}

	@Override
	public void update(CategoryModel c) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(c);		
	}

	@Override
	public void delete(int cateid) {
		sessionFactory.getCurrentSession().remove(get(cateid));

	}

	
}
