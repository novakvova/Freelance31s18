package frilance.controllers.nikita;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class RegisterController {
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String  registerPage() {
		System.out.println("register");
		ModelAndView m = new ModelAndView();
		m.setViewName("register");
		return "register";
	}
}
