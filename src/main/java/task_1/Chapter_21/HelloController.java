package task_1.Chapter_21;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	/*@RequestMapping("*")
	public String hello() {
		return "Hello Spring";
	}

	@RequestMapping("/index")
	public String helloIndex() {
		return "This is the main page";
	}

	@RequestMapping("/contact")
	public String helloContact() {
		return "This is the contact page";
	}
	*/
	//GET request from URL
	//Model object used to access view

	@RequestMapping(value="/hello")
	public String helloRequest(@RequestParam(value="name")String name,
		@RequestParam(value="age")int age, Model model){
		model.addAttribute("name",name );
		model.addAttribute("age",age );
		
		return "hello" ;
		
	}
}
