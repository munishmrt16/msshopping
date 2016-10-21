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
@RequestMapping("/admin")

public class AdminController {

	@Autowired
	ProductDAO  p;
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView adminProduct()
	{
		ModelAndView mv = new ModelAndView("admin");
		//ProductModel product = new ProductModel();
		mv.addObject("products", p.getAll());
		mv.addObject("product", new ProductModel());
		return mv;		
	}
	
	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
	public ModelAndView getProduct(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("admin");
    	mv.addObject("product", p.get(id));
    	mv.addObject("products", p.getAll());
	    return mv;		
		}
	
	@RequestMapping(value = "/delete/{pro}")
	public String deleteProduct(@PathVariable("pro") Integer id) {
	   	p.delete(id);
		return "redirect:/admin/view";		
		}
	
	@RequestMapping("/save")
	public String editProduct(@ModelAttribute("product") ProductModel prod)
	{
		if (prod.getPid()==0)
		{
			p.insert(prod);
		}
		else
		{
			p.update(prod);
		}
		return "redirect:/admin/view";
	}
}
