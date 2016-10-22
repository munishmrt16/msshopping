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
@RequestMapping("/user")

public class UserController {
	@Autowired
	UserDAO  u;
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView adminProduct()
	{
		ModelAndView mv = new ModelAndView("userview");
		//ProductModel product = new ProductModel();
		mv.addObject("user", new UserModel());
		return mv;		
	}
	
	@RequestMapping("/save")
	public String editUser(@ModelAttribute("user") UserModel usr)
	{
		if (usr.getUserid()==0)
		{
			u.insertuser(usr);
		}
		else
		{
			u.updateuser(usr);
		}
		return "redirect:/user/view";
	}
		
		/*
		@RequestMapping(value = "/view", method = RequestMethod.GET)
		public ModelAndView dispalldetail()
		{
			ModelAndView mv = new ModelAndView("userview");
			//ProductModel product = new ProductModel();
			mv.addObject("users", u.getalluser());
			mv.addObject("user", new UserModel());
			return mv;		
		}
		
		@RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
		public ModelAndView getUser(@PathVariable("id") int id) {
			ModelAndView mv = new ModelAndView("userview");
	    	mv.addObject("user", u.getuser(id));
	    	mv.addObject("users", u.getalluser());
		    return mv;		
			}
		
	@RequestMapping(value = "/delete/{usr}")		 
		public String deleteProduct(@PathVariable("usr") Integer id) {
		   	u.deleteuser(id);
			return "redirect:/user/view";		
			}
		*/
}
