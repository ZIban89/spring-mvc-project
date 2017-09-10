package by.htp.nikonov.task02.command;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.htp.nikonov.task02.entity.Country;
import by.htp.nikonov.task02.entity.User;
import by.htp.nikonov.task02.entity.UserForm;
import by.htp.nikonov.task02.service.CountryService;
import by.htp.nikonov.task02.service.UserService;

@Controller
public class PageController {

	@Autowired
	UserService userService;

	@Autowired
	CountryService countryService;

	@RequestMapping("/main-page")
	public String modifyUser(Model model) {

		List<User> users = userService.getAll();
		model.addAttribute("users", users);
		return "main-page";
	}

	@RequestMapping("/edit-user-{id}")
	public String editPage(@PathVariable Integer id, Model model) {
		
		UserForm userForm = null;
		if (id < 0) {
			userForm = new UserForm();
		} else {
			userForm = new UserForm(userService.getByID(id));			
		}
		List<Country> countries = countryService.findAll();
		model.addAttribute("user", userForm);
		model.addAttribute("countries", countries);

		return "edit";
	}

	@RequestMapping("/save")
	public String saveUser(@Valid @ModelAttribute("user") UserForm userForm, 
			BindingResult theBindingResult, Model model) {
				
		if(theBindingResult.hasErrors()) {
			List<Country> countries = countryService.findAll();
			model.addAttribute("countries", countries);
			return "edit";
		}		
		userService.save(getUserByForm(userForm));	

		return "redirect:main-page";
	}

	@RequestMapping("/delete")
	public String deleteUser(Model model, @RequestParam("id") Integer[] o) {
		for (Integer e : o) {
			userService.deleteUser(e);
		}
		return "redirect:main-page";

	}
	
	
	//стоит ли вынести в отдельный класс-утилиту?
	private User getUserByForm(UserForm userForm) {
		User user=new User();
		System.out.println(userForm.getCountry());
		Country country;
		if((userForm.getCountry()==null)||(userForm.getCountry().equals(""))){
			country=null;
		}else{country=countryService.findByName(userForm.getCountry());}
		
		user.setCountry(country);
		user.setAge(userForm.getAge());
		user.setFirstName(userForm.getFirstName());
		user.setLastName(userForm.getLastName());
		user.setId(userForm.getId());
		user.setSex(userForm.getSex());
		user.setLogin(userForm.getLogin());
		user.setPassword(userForm.getPassword());
		return user;
	}
}
