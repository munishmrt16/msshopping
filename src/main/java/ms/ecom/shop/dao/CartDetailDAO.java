package ms.ecom.shop.dao;

import java.util.List;

import ms.ecom.shop.model.CartDetailModel;


	public interface CartDetailDAO {
	public List<CartDetailModel> getAll();
	void insert(CartDetailModel  c);
	CartDetailModel get(int cid);
	void update(CartDetailModel c);
	public void delete(int cid);

}
