package ms.ecom.shop.dao;

import java.util.List;

import ms.ecom.shop.model.CartDetailModel;


public interface CartDetailDAO {
		public List<CartDetailModel> getAllCD();
		void insertCD(CartDetailModel  p);
		CartDetailModel getCD(int pid);
		void updateCD(CartDetailModel p);
		public void deleteCD(int pid);
}
