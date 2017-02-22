package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.beans.LoginBean;

@Controller
public class LoginController {
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("message", "Please Enter Your Login Details");
		return "Login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("LoginBean") LoginBean loginBean) {
		if (loginBean != null && loginBean.getUserName() != "" && loginBean.getPassword() != "") {
			if (loginBean.getUserName().equals("bill") && loginBean.getPassword().equals("bill123")) {
				model.addAttribute("message", "Welcome " + loginBean.getUserName());
				return "Success";
			} else {
				model.addAttribute("error", "Invalid Details");
				return "Login";
			}
		} else {
			model.addAttribute("error", "Please enter Details");
			return "Login";
		}
	}
}
