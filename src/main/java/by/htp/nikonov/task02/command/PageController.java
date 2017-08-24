package by.htp.nikonov.task02.command;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import by.htp.nikonov.task02.entity.User;


@Controller
public class PageController {
	
	@RequestMapping("/signup")
	public String showSignupPage(Model model) {
		User user= new User();
		model.addAttribute("user", user);
		return "signup";
	}
	
	@RequestMapping("/processUser")
	public String showUserInfo(@Valid @ModelAttribute("user") User user, BindingResult theBindingResult) {
		
		System.out.println((user.getUsername()==null)+ " " + (user.getPassword()==null));
		
		if(theBindingResult.hasErrors())
			return "signup";
		else
			return "process-user";
	}
	
		
	
	@RequestMapping("/start")
	public String showStartPage(Model model) {
		User user= new User();
		model.addAttribute("user", user);
		return "start";
	}
	
	
	

		

}
