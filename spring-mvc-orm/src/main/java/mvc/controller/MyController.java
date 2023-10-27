package mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mvc.entity.User;
import mvc.service.UserService;

@Controller
public class MyController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public void processData(@ModelAttribute User user) {
		
		this.userService.createData(user);
	}
	
	@RequestMapping("/get")
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("success.jsp");
		List<User> list = userService.get();
		mav.addObject("users",list);
		return mav;
	}
}
