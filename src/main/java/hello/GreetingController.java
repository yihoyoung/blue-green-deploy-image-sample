package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        try {
            System.out.print("Strart sleep 8 seconds...");
            Thread.sleep(8000);
        } catch (Exception e) {

            System.out.print(e.getMessage());
        }
        return "greeting";
    }

}
