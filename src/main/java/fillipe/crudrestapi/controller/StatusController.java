package fillipe.crudrestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StatusController {

//    @GetMapping(path = "/api/status")
//    public String teste()
//    {
//        return "passou aqui";
//    }
    @RequestMapping(method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }

}
