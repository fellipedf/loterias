package br.com.dev4j.loterias;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoteriaController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }


    @RequestMapping("listasorteados")
    public String listaSorteados() {
        return "listasorteados";
    }
}
