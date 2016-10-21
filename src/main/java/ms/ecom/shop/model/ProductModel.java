package ms.ecom.shop.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class ProductModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int pid;
	String pcat;
	@NotEmpty
	String pname;
	String purl;
	@NotNull
	int pprice;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPcat() {
		return pcat;
	}

	public void setPcat(String pcat) {
		this.pcat = pcat;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPurl() {
		return purl;
	}

	public void setPurl(String purl) {
		this.purl = purl;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "ProductModel [pid=" + pid + ", pcat=" + pcat + ",pname=" + pname + ", purl=" + purl + ",pprice="
				+ pprice + "]";
	}
}

