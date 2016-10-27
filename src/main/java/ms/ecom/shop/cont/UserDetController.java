package ms.ecom.shop.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ms.ecom.shop.dao.UserDetDAO;
import ms.ecom.shop.model.UserDetModel;


@Controller
public class UserDetController {
	
	@Autowired
	UserDetDAO r ;
	
	@RequestMapping(value = "/login")
	public String gotreg(Model model){
		model.addAttribute("user", new UserDetModel());
		return "/login";
	}

	@RequestMapping(value = "/userdatasave")
	public String go(@ModelAttribute ("user") UserDetModel user1,BindingResult bindingResult, Model model){
				
		r.insertUser(user1);	
		return "/login";
	}
	
	@RequestMapping("/403")
	public String acces() {

		return "403";
	}
	
}
