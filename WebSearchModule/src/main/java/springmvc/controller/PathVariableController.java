package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

	@RequestMapping("/hit/{userId}/{userName}")
	public String handler(@PathVariable("userId") int userId,@PathVariable("userName") String userName) {
		System.out.println(userId);
		Integer.parseInt(userName);
        System.out.println(userName);
		return "home";
	}
	
	
}
