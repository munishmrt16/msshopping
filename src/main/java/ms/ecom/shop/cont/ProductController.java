package ms.ecom.shop.cont;

import java.io.BufferedOutputStream;
import java.io.File;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.*;

import ms.ecom.shop.dao.*;
import ms.ecom.shop.model.*;

@Controller
@RequestMapping("/pro")

public class ProductController {
	@Autowired
	ProductDAO p;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView adminProduct() {
		ModelAndView mv = new ModelAndView("productview");
		// ProductModel product = new ProductModel();
		mv.addObject("products", p.getAll());
		mv.addObject("product", new ProductModel());
		return mv;
	}

	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
	public ModelAndView getProduct(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("productview");
		mv.addObject("product", p.get(id));
		mv.addObject("products", p.getAll());
		return mv;
	}

	@RequestMapping(value = "/delete/{pro}")
	public String deleteProduct(@PathVariable("pro") Integer id) {
		p.delete(id);
		return "redirect:/pro/view";
	}

	@PostMapping("/save")
	public String editProduct(@ModelAttribute("product") ProductModel prod, HttpServletRequest request)
	{
		if (prod.getPid() == 0)
		{
			p.insert(prod);
			// need to have a transient field of type MultipartFile in Product
			// model class
			MultipartFile productImage = prod.getFile();
			// first get the root directory and then append the directory where
			// you want to store
			String directoryPath = request.getSession().getServletContext().getRealPath("/")
					+ "/resources/images/product/";

			// append the file name
			String filePath = directoryPath + prod.getPid() + ".jpg";

			// ========================================================
			// If directory does not exist create the directory
				if (!Files.exists(Paths.get(directoryPath))) 
				{
					try {
					// create the directories recursively
						Files.createDirectories(Paths.get(directoryPath));
				    }
					catch (IOException ex)  
				   {
					ex.printStackTrace();
				   }
				}
				// transfer the file

				try {
				productImage.transferTo(new File(filePath));
				}
				catch(Exception ex) {
				ex.printStackTrace();
				}

		   }	
			else
			{
				p.update(prod);
			}
		return "redirect:/pro/view";
		}
	}			

	/*
	 * 
	 * // need to have a transient field of type MultipartFile in Product model
	 * class MultipartFile productImage = product.getFile(); // first get the
	 * root directory and then append the directory where you want to store
	 * String directoryPath =
	 * request.getSession().getServletContext().getRealPath("/") +
	 * "/resources/images/product/";
	 * 
	 * // append the file name String filePath = directoryPath +
	 * product.getProductId() + ".png";
	 * 
	 * //======================================================== // If
	 * directory does not exist create the directory
	 * if(!Files.exists(Paths.get(directoryPath))){ try{ // create the
	 * directories recursively
	 * Files.createDirectories(Paths.get(directoryPath)); } catch(IOException
	 * ex){ ex.printStackTrace(); } }
	 */

	/*
	 * @RequestMapping("/save")
	 */
	/*
	 * public String editProduct(@ModelAttribute("product") ProductModel
	 * prod,HttpServletRequest request) { if (prod.getPid() == 0) {
	 * p.insert(prod); MultipartFile file = prod.getFile(); String
	 * of=file.getOriginalFilename(); String filepath =
	 * request.getSession().getServletContext().getRealPath(
	 * "/resources/images/productimages/"); System.out.println("Path of file "
	 * +filepath); String filename = filepath + "\\" + prod.getPid() + ".jpg";
	 * System.out.println("File Path File "+filepath); System.out.println(
	 * "File Path File "+filename); try { byte imagebyte[] =
	 * prod.getFile().getBytes(); BufferedOutputStream fos = new
	 * BufferedOutputStream(new FileOutputStream(filename));
	 * fos.write(imagebyte); fos.close(); } catch (IOException e) {
	 * e.printStackTrace(); } catch (Exception e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } } else { p.update(prod); } return
	 * "redirect:/pro/view"; } }
	 */

