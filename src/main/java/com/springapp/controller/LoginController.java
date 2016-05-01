package com.springapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springapp.model.User;
import com.springapp.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private SessionController sessionController;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ModelAndView test(Model model, @ModelAttribute("user") @Valid User user) {
		ModelAndView mav = new ModelAndView();
		if (userService.verifyLogin(user)) {
			mav.setViewName("test");
			mav.addObject("user", sessionController.getUser());
			return mav;
		}
		mav.setViewName("login");
		return mav;
	}

}
