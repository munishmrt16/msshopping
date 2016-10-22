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
@RequestMapping("/cartitem")
public class CartItemController {

	@Autowired
	CartItemDAO   citem;
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView adminCI()
	{
		ModelAndView mv = new ModelAndView("cartitemview");
		mv.addObject("ci", new CartItemModel());
		return mv;		
	}
	
	@RequestMapping("/save")
	public String editcd(@ModelAttribute("ci") CartItemModel cd)
	{
		
		if (cd.getId()==0)
		{
					citem.insertCI(cd);
				}
		else
		{
			citem.updateCI(cd);
			}
		return "redirect:/cartitem/view";
	}
	
}
