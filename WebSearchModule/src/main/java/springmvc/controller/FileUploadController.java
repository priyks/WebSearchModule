package springmvc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String  uploadFile() {
		
		return "fileform";
	}
	
	@RequestMapping(value="/uploadimg",method=RequestMethod.POST )
	public String uploadProfileImage(@RequestParam("img") CommonsMultipartFile file,HttpSession s,Model m) {
		System.out.println("file uploaded handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		byte[] data = file.getBytes();
		// we have to save file at server
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resource"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		try {
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
			System.out.println("file uploaded ..");
			m.addAttribute("filename",file.getOriginalFilename());
			m.addAttribute("msg", "File Uploaded Seccussfully...");
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			m.addAttribute("msg", "File Uploaded Error...!");
			e.printStackTrace();
		}
		
	
		return "filesuccess";
	}
}
