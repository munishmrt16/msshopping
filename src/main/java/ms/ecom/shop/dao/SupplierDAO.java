package ms.ecom.shop.dao;

import java.util.List;
import ms.ecom.shop.model.SupplierModel;

public interface SupplierDAO {

	public List<SupplierModel> getAll();
	void insert(SupplierModel  c);
	SupplierModel get(int cid);
	void update(SupplierModel c);
	public void delete(int cid);

	
}





