package ms.ecom.shop.dao;

import java.util.List;

import ms.ecom.shop.model.CartItemModel;

public interface CartItemDAO {
		public List<CartItemModel> getAllCI();
		void insertCI(CartItemModel  p);
		CartItemModel getCI(int pid);
		void updateCI(CartItemModel p);
		public void deleteCI(int pid);
}

