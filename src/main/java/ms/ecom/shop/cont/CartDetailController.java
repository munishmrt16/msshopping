package ms.ecom.shop.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ms.ecom.shop.dao.*;
import ms.ecom.shop.model.*;

 
@Controller
@RequestMapping("/cartdetail")
public class CartDetailController {
	@Autowired
	CartDetailDAO   cddao;
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView adminCD()
	{
		ModelAndView mv = new ModelAndView("cartdetailview");
		mv.addObject("cd", new CartDetailModel());
		return mv;		
	}
	
	@RequestMapping("/save")
	public String editcd(@ModelAttribute("cd") CartDetailModel cd)
	{
		if (cd.getCartid()==0)
		{
					cddao.insertCD(cd);
				}
		else
		{
			cddao.updateCD(cd);
			}
		return "redirect:/cartdetail/view";
	}
}

 