package co.grandcircus.lab22;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.lab22.dao.ProductRepo;
import co.grandcircus.lab22.model.Product;



@Controller
public class MainController {
	
	@Autowired
	ProductRepo dao;
	
	@RequestMapping("/")
	public ModelAndView makeHomePage() {
		return new ModelAndView("index", "productList", dao.findAll());
	}
	
	@RequestMapping("/regForm")
	public ModelAndView makeRegForm(){
		return new ModelAndView("regForm");
	}
	
	@RequestMapping("/addOne")
	public ModelAndView addOne(int id) {
		System.out.println("printed");
		Product p = dao.findById(id).orElse(null);
		
		p.setQuantity(p.getQuantity() + 1);
		
		dao.save(p);
		
		return new ModelAndView("redirect:/");
	}
	
}
