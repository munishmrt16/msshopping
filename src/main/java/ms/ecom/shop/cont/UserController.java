package ms.ecom.shop.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ms.ecom.shop.dao.*;
import ms.ecom.shop.model.*;


@Controller
@RequestMapping("/user")

public class UserController {
	@Autowired
	UserDAO  v;
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView usrProduct()
	{
		ModelAndView mv = new ModelAndView("signin");
		mv.addObject("usr", new UserModel());
		return mv;		
	}
	
	@RequestMapping("/save")
	public String editUser(@ModelAttribute("user") UserModel usr)
	{
		if(usr.getUsrid()==0)
		{
			v.insertusr(usr);
		}
		else
		{
		 }
		return "redirect:/user/signin";
			
	}	
	
}
