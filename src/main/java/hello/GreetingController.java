package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    final int SLEEP_TIME = 20000;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        int b = 0;
        try {
            System.out.print("Strart sleep " + SLEEP_TIME/1000 + " seconds...");
            Thread.sleep(SLEEP_TIME);
        } catch (Exception e) {

            System.out.print(e.getMessage());
        }
        return "greeting";
    }

}
