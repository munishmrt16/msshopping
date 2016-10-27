package ms.ecom.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int usrid;
		
	String usrname;
	String usrcontact;
	String usremailid;
	String usrpasswd;
	String usrrole;
	
	public String getUsrpasswd() {
		return usrpasswd;
	}
	public void setUsrpasswd(String usrpasswd) {
		this.usrpasswd = usrpasswd;
	}
	public int getUsrid() {
		return usrid;
	}
	public void setUsrid(int usrid) {
		this.usrid = usrid;
	}
	public String getUsrname() {
		return usrname;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	public String getUsrcontact() {
		return usrcontact;
	}
	public void setUsrcontact(String usrcontact) {
		this.usrcontact = usrcontact;
	}
	public String getUsremailid() {
		return usremailid;
	}
	public void setUsremailid(String usremailid) {
		this.usremailid = usremailid;
	}
	
	public String getUsrrole() {
		return usrrole;
	}
	public void setUsrrole(String usrrole) {
		this.usrrole = usrrole;
	}
	
}
