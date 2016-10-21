package ms.ecom.shop.dao;


import java.util.List;

import ms.ecom.shop.model.ProductModel;

public interface ProductDAO {
	public List<ProductModel> getAll();
	void insert(ProductModel  p);
	ProductModel get(int pid);
	void update(ProductModel p);
	public void delete(int pid);
}
