package ms.ecom.shop.cont;

import org.hibernate.usertype.UserType;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class ProductErrorController implements Validator  {

	   public boolean supports(Class ProductModel) {
	       return UserType.class.isAssignableFrom(ProductModel);
	   }
	   @Override
	   public void validate(Object obj, Errors errors) {
	       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pname", "pprice", "Field is required.");
	    	     }
}
