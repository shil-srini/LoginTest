package spring.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.beans.Customer;
import spring.beans.LoginBean;
import spring.service.CustomerService;

@Controller
public class LoginController {
	
	@Autowired
	private HttpSession httpSession;
	
	@Autowired
	private CustomerService customerService;
	
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("message", "Please Enter Your Login Details");
		return "Login";
	}
	        
	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("LoginBean") LoginBean loginBean) {
		httpSession.setAttribute("name", loginBean.getUserName());
		ArrayList<Customer> customerList = customerService.getAllCustomers();
		if (loginBean != null && loginBean.getUserName() != "" && loginBean.getPassword() != "") {
			for (Customer customer : customerList) {
				if (customer.getName().contains(loginBean.getUserName())
						&& loginBean.getPassword().equals(loginBean.getUserName() + "123")) {
					logger.info("Login Success");
			        model.addAttribute("message", "Welcome ");
			        model.addAttribute("customer", customer);
					return "Success";
				}
			}
			model.addAttribute("error", "Invalid Details");
			logger.error("Wrong UserName/Password");
			return "Login";
		} else {
			model.addAttribute("error", "Please enter Details");
			return "Login";
		}
	}
}
