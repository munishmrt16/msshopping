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
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryDAO c;

	@RequestMapping(value = "/cateview", method = RequestMethod.GET)
	public ModelAndView admincategory() {
		ModelAndView mv = new ModelAndView("category");
		mv.addObject("cat", c.getAll());
		mv.addObject("cats", new CategoryModel());
		return mv;
	}

	@RequestMapping(value = "/cateview/{id}", method = RequestMethod.GET)
	public ModelAndView getcatec(@PathVariable("id") int cid) {
		ModelAndView mv = new ModelAndView("category");
		mv.addObject("cat", c.getAll());
		mv.addObject("cats", c.get(cid));
		return mv;
	}

	@RequestMapping(value = "/deletecate/{cid}")
	public String deletecatec(@PathVariable("cid") Integer cid) {
		c.delete(cid);
		return "redirect:/category/cateview";
	}

	@PostMapping("/catesave")
	public String editcatec(@ModelAttribute("cat") CategoryModel cat, HttpServletRequest request)
	{
		if (cat.getCid() == 0)
		{
			c.insert(cat);
			// need to have a transient field of type MultipartFile in Product
			// model class
			  }	
			else
			{
				c.update(cat);
			}
		return "redirect:/category/cateview";
		}
	}			

	
	
