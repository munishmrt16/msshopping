package ms.ecom.shop.cont;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView dispmenu()
	{
		ModelAndView mv = new ModelAndView("main");
		return mv;		
	}
	
	
	@RequestMapping("/signup")
	public ModelAndView dispsignup()
	{
		ModelAndView mv = new ModelAndView("signup");
		return mv;		
	}
	
	@RequestMapping("/signin")
	public ModelAndView dispsignin()
	{
		ModelAndView mv = new ModelAndView("signin");
		return mv;		
	}
	
	@RequestMapping("/supplier")
	public ModelAndView dispsupplier()
	{
		ModelAndView mv = new ModelAndView("supplier");
		return mv;		
	}
	
	@RequestMapping("/product")
	public ModelAndView dispproduct()
	{
		ModelAndView mv = new ModelAndView("product");
		return mv;		
	}
	
	@RequestMapping("/about")
	public ModelAndView dispabout()
	{
		ModelAndView mv = new ModelAndView("about");
		return mv;		
	}
	
}


