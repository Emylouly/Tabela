package br.edu.ifba.demo.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/relatorios")
public class RelatorioController {
    
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("relatorios/index");
        mv.addObject("data", new int[]{9, 9, 8, 7, 9, 9, 8, 10, 7, 7, 7, 9, 9, 9, 7});
        return mv;
    }
}
