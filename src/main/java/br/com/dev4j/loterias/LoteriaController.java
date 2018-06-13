package br.com.dev4j.loterias;

import br.com.dev4j.loterias.model.SorteadosQuina;
import br.com.dev4j.loterias.repository.SorteadosQuinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoteriaController {

    @Autowired
    private SorteadosQuinaRepository repository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }


    @RequestMapping("listasorteados")
    public String listaSorteados(Model model) {

        Iterable<SorteadosQuina> resultados = repository.findAll();
        model.addAttribute("resultados", resultados);

        return "listasorteados";
    }
}
