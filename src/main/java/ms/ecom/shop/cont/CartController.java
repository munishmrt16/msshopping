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
@RequestMapping("/cart")

public class CartController {
	@Autowired
	CartDetailDAO cartdet;
	ProductDAO pro1;
	ProductModel prom;
	

	@RequestMapping(value = "/cartview", method = RequestMethod.GET)
	public ModelAndView adminsuppliery() {
		ModelAndView mv = new ModelAndView("cartdetailview");
		mv.addObject("carts", cartdet.getAll());
		mv.addObject("cart", new CartDetailModel());
		return mv;
	}

	@RequestMapping(value = "/cartview/{id}", method = RequestMethod.GET)
	public ModelAndView getsupp(@PathVariable("id") int cid) {
		ModelAndView mv = new ModelAndView("cartdetailview");
		mv.addObject("carts", cartdet.getAll());
		mv.addObject("cart", cartdet.get(cid));
		return mv;
	}
	
	@RequestMapping(value = "/cartview1/{id}", method = RequestMethod.GET)
	public ModelAndView getprod1(@PathVariable("id") int cid) {
		ModelAndView mv = new ModelAndView("cartdetailview");
		mv.addObject("carts", cartdet.getAll());
		prom=pro1.get(cid);
		prom.setPcat(prom.getPname());
		prom.setPid(prom.getPid());
		prom.setPcat(prom.getPcat());
		prom.setPprice(prom.getPprice());
		mv.addObject("cart", prom);
		return mv;
	}
	
	@RequestMapping(value = "/cartdel/{sid}")
	public String cartdelete(@PathVariable("sid") Integer sid) {
		cartdet.delete(sid);
		return "redirect:/cart/cartview";
	}

	@PostMapping("/cartsave")
	public String cartedit(@ModelAttribute("cart") CartDetailModel cart, HttpServletRequest request)
	{
		if (cart.getCartid() == 0)
		{
			cartdet.insert(cart);
			// need to have a transient field of type MultipartFile in Product
			// model class
			  }	
			else
			{
				cartdet.update(cart);
			}
		return "redirect:/cart/cartview";
		}
	
	
}
