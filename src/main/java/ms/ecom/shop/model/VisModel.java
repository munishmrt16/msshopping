package ms.ecom.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VisModel {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int visid;
		String visname;
		String viscontact;
		String visemailid;
		String viscomm;
		
		
		public int getVisid() {
			return visid;
		}
		public void setVisid(int visid) {
			this.visid = visid;
		}
		public String getVisname() {
			return visname;
		}
		public void setVisname(String visname) {
			this.visname = visname;
		}
		public String getViscontact() {
			return viscontact;
		}
		public void setViscontact(String viscontact) {
			this.viscontact = viscontact;
		}
		public String getVisemailid() {
			return visemailid;
		}
		public void setVisemailid(String visemailid) {
			this.visemailid = visemailid;
		}
		public String getViscomm() {
			return viscomm;
		}
		public void setViscomm(String viscomm) {
			this.viscomm = viscomm;
		}
	}

