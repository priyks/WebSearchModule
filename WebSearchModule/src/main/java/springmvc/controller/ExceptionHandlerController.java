package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * This class will handle all Exceptions occurred by every controller
 * @author priyankaku
 *
 */
@ControllerAdvice
public class ExceptionHandlerController {

	// these exceptions are only applied on whole project
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
		}
}
