package frilance.controllers.nikita;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import frilance.entities.User;
import frilance.dto.UserDTO;
import frilance.sevices.RegistrationService;
import frilance.validation.EmailExistsException;

@Controller
public class RegisterCtrl {
	//@Resource(name = "registrationService")
	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegistrationForm(WebRequest request, Model model) {
	    UserDTO userDto = new UserDTO();
	    model.addAttribute("user", userDto);
	    return "register";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView registerUserAccount
	      (@ModelAttribute("user")  UserDTO accountDto, 
	      BindingResult result, WebRequest request, Errors errors) {    
	    User registered = new User();
		System.out.println(accountDto.toString());
		registered = createUserAccount(accountDto, result);

	        return new ModelAndView("successRegister", "user", accountDto);

	}
	private User createUserAccount(UserDTO accountDto, BindingResult result) {
	    User registered = null;
	    try {
	        registered = registrationService.registerNewUserAccount(accountDto);
	    } catch (EmailExistsException e) {
	        return null;
	    }    
	    return registered;
	}
	
}