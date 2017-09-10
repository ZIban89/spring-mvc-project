package by.htp.nikonov.task02.command;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageCommand {
	
	@RequestMapping("/")
	public String showForm(Model theModel) {
		
		return "redirect:main-page";
	}

}
