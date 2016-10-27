package ms.ecom.shop.dao;

import java.util.List;

import ms.ecom.shop.model.CategoryModel;

public interface CategoryDAO {
	public List<CategoryModel> getAll();
	void insert(CategoryModel  c);
	CategoryModel get(int cid);
	void update(CategoryModel c);
	public void delete(int cid);
}

