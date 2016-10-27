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
@RequestMapping("/supplier")

public class SupplierController {

	@Autowired
	SupplierDAO s;

	@RequestMapping(value = "/suppview", method = RequestMethod.GET)
	public ModelAndView adminsuppliery() {
		ModelAndView mv = new ModelAndView("supplier");
		mv.addObject("supp", s.getAll());
		mv.addObject("supps", new SupplierModel());
		return mv;
	}

	@RequestMapping(value = "/suppview/{id}", method = RequestMethod.GET)
	public ModelAndView getsupp(@PathVariable("id") int cid) {
		ModelAndView mv = new ModelAndView("supplier");
		mv.addObject("supp", s.getAll());
		mv.addObject("supps", s.get(cid));
		return mv;
	}

	@RequestMapping(value = "/suppdel/{sid}")
	public String deletecatec(@PathVariable("sid") Integer sid) {
		s.delete(sid);
		return "redirect:/supplier/suppview";
	}

	@PostMapping("/suppsave")
	public String editcatec(@ModelAttribute("sup") SupplierModel sup, HttpServletRequest request)
	{
		if (sup.getSid() == 0)
		{
			s.insert(sup);
			// need to have a transient field of type MultipartFile in Product
			// model class
			  }	
			else
			{
				s.update(sup);
			}
		return "redirect:/supplier/suppview";
		}
	
}
