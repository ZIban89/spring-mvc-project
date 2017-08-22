package by.htp.nikonov.task02.command;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import by.htp.nikonov.task02.Entity.User;


@Controller
public class PageController {
	
	@RequestMapping("/signup")
	public String showSignupPage(Model model) {
		User user= new User();
		model.addAttribute("user", user);
		return "signup";
	}
	
	@RequestMapping("/processUser")
	public String showUserInfo(@ModelAttribute("user") User user) {
		
		
		return "process-user";
	}
	
	@RequestMapping("/processNewUser")
	public String showNewUserInfo(@ModelAttribute("user") User user) {
		
		
		return "process-user";
	}
	
	
	@RequestMapping("/start")
	public String showStartPage(Model model) {
		User user= new User();
		model.addAttribute("user", user);
		return "start";
	}
	
	
	

		

}
