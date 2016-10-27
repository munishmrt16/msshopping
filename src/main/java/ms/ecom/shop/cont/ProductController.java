package ms.ecom.shop.cont;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
	
	@RequestMapping(value = "/displayone/{id}", method = RequestMethod.GET)
	public ModelAndView getoneProduct(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("displayone");
		mv.addObject("product", p.get(id));
		return mv;
	}

	@RequestMapping(value = "/delete/{pro}")
	public String deleteProduct(@PathVariable("pro") Integer id) {
		p.delete(id);
		return "redirect:/pro/view";
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String editProduct(@Valid @ModelAttribute("product") ProductModel prod, BindingResult results,HttpServletRequest request,Model model)
	{
		
		if (results.hasErrors()) {
			model.addAttribute("product", prod);
			model.addAttribute("products", p.getAll());
			return ("productview");
		}
		
		if (prod.getPid() == 0)
		{
			p.insert(prod); 
			// need to have a transient field of type MultipartFile in Product
			// model class
			MultipartFile productImage = prod.getFile();
			// first get the root directory and then append the directory where
			// you want to store
			if(productImage!=null && productImage.getSize() > 0) {
				// first get the root directory and then append the directory where
				// you want to store
				String rootPath = request.getSession().getServletContext().getRealPath("/");
				String directoryPath = rootPath + "resources\\images\\product";
				System.out.println(" Directory Path"+directoryPath);
				
				// append the file name
				String filePath = directoryPath + File.separator + prod.getPid() + ".jpg";
				System.out.println(" File Path"+filePath);
				// ========================================================
				// If directory does not exist create the directory
				if (!Files.exists(Paths.get(directoryPath))) {
					try {
						// create the directories recursively
						Files.createDirectories(Paths.get(directoryPath));
						System.out.println(" Directory Created "+Paths.get(directoryPath));
											}

					catch (IOException ex) {
						ex.printStackTrace();
						System.out.println("Error ____________________"+ex);
					}
				}
				// =======================================================
				// transfer the file

				try {
					productImage.transferTo(new File(filePath));
					System.out.println(" File transferred successfully ");
				} catch (Exception ex) {
					System.out.println(" Problem in tranferring file "+ex);
					ex.printStackTrace();
				}
			}
     			// ................................... ends
				// here..................................
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

