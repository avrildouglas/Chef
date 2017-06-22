package cheflist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CheffController {

    @GetMapping("/demo")
    
    
    public String chefForm(Model model) {
        model.addAttribute("chef", new Chef());
        return "ChefInput";
    }

    @PostMapping("/demo")
    public String chefSubmit(@ModelAttribute Chef chefInput) {
        return "ChefOutput";
    }

}