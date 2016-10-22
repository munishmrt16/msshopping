package ms.ecom.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class CartDetailModel{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cartid;
	String usrid;
	int noofprod;
	int grandtot;
	
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public String getUsrid() {
		return usrid;
	}
	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}
	public int getNoofprod() {
		return noofprod;
	}
	public void setNoofprod(int noofprod) {
		this.noofprod = noofprod;
	}
	public int getGrandtot() {
		return grandtot;
	}
	public void setGrandtot(int grandtot) {
		this.grandtot = grandtot;
	}
	
}
