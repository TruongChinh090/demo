package application.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AdminController {
    @GetMapping("/scan")
    String scan() {
        return "scan";
    }

    @GetMapping("/setting")
    String setting() {
        return "setting";
    }
}
