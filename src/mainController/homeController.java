package mainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/")
public class homeController {
	@RequestMapping("admin")
	public String adminHome() {
		return "admin/adminHome";
	}
}
