package ms.ecom.shop.cont;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import ms.ecom.shop.dao.*;
import ms.ecom.shop.model.*;


@Controller
@RequestMapping("/cartjoin")
public class JoinController {

	@Autowired
	CartDetailDAO cartdet;
	CategoryDAO cartcatdao;
	ProductDAO cartprodao;
	SupplierDAO cartsupdao;
	UserDetDAO cartuserdetdao;
	
	@RequestMapping(value = "/cartview1", method = RequestMethod.GET)
	public ModelAndView cart() 
	{
		ModelAndView mv = new ModelAndView("cartview1");
		mv.addObject("carts", cartdet.getAll());
		mv.addObject("cart", new CartDetailModel());
		return mv;
	}
	
	
	
	
	
	

}
