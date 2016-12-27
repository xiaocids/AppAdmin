package com.starter.Administrator.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rosid on 12/27/2016.
 */
@Controller
@RequestMapping("/Administrator")
public class AdministratorController {
    @RequestMapping(value = {"/","Index"})
    String Index(){
        return "Administrator/Index";
    }
}
