package ms.ecom.shop.cont;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ms.ecom.shop.dao.*;
import ms.ecom.shop.model.*;

@Controller
public class ProductDetailController 
{

	@Autowired
	ProductDAO  prodao;
	@RequestMapping("/displayallproduct")
	public @ResponseBody List<ProductModel> getallproduct()
	{
		return prodao.getAll();
	}
	
}


/*
@RequestMapping(value="/displayone2/{pid}", method=RequestMethod.GET)
public @ResponseBody ProductModel getproducts1(@PathVariable("pid") int cid)
{
	 	return prodao.get(cid);
}
*/
