package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	
	@RequestMapping("/home")
	public String homeView() {
		System.out.println("going to home view ..");
		String str=null;
		System.out.println(str.length());
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url="https://www.google.com/search?q="+query;
		RedirectView rv=new RedirectView();
		rv.setUrl(url);
	
		return rv;
	}
	/*// these exceptions are only applied on this controller 
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String excpetionHandlerNullPointer(Model m) {
		m.addAttribute("msg", "Null Pointer Exception Occured..");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String excpetionHandlerNumberFormat(Model m) {
		m.addAttribute("msg", "Number Format Exception Occured..");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String excpetionHandlerGeneric(Model m) {
		m.addAttribute("msg", "Generic Exception Occured..");
		return "null_page";
	}*/

}
