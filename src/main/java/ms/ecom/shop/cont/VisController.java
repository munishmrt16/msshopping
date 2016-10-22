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
@RequestMapping("/visitor")
public class VisController 
{
	@Autowired
	VisDAO  v;
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView visProduct()
	{
		ModelAndView mv = new ModelAndView("regis");
		mv.addObject("vis", new VisModel());
		return mv;		
	}
	
	@RequestMapping("/save")
	public String editUser(@ModelAttribute("vis") VisModel vis)
	{
		
			v.insertvis(vis);
			 return "redirect:/";
	}
	
}
