package frilance.controllers.nikita;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyAdminComtroller {
	@RequestMapping(value="/myadmin", method = RequestMethod.GET)
	public String  adminPage() {
		System.out.println("Admnin");
		ModelAndView m = new ModelAndView();
		m.setViewName("myadmin");
		return "myadmin";
	}
}
 