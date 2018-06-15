package br.com.dev4j.loterias;

import br.com.dev4j.loterias.model.Dezena;
import br.com.dev4j.loterias.model.Jogo;
import br.com.dev4j.loterias.repository.SorteadosQuinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class LoteriaController {

    @Autowired
    private SorteadosQuinaRepository repository;

    private List<Integer> possiveis;

    private int[] sorte = new int[10];

    private Jogo jogo;

    private List<Jogo> jogos;

    @RequestMapping("/")
    public String index() {
        return "index";
    }


    @RequestMapping("listasorteados")
    public String listaSorteados(Model model) {
        carregarNumeros();
        prepararJogos();
        model.addAttribute("jogos", jogos);
        return "listasorteados";
    }

    public void carregarNumeros() {
        possiveis = new ArrayList<>();
        //Inclui os 80 números possíveis
        for (int i = 1; i <= 80; i++) {
            possiveis.add(i);
        }
    }


    public void prepararJogos() {
        jogos = new ArrayList<>();
        while (possiveis.size() > 0) {
            jogo = new Jogo();
            int contPar = 0;
            int contImpar = 0;
            while (jogo.getDezenas().size() != 8) {
                Dezena dezena = new Dezena();
                int rand = new Random().nextInt(possiveis.size());

                if (possiveis.get(rand) % 2 == 0 && contPar < 4) {
                    dezena.setNumero(possiveis.get(rand));
                    jogo.getDezenas().add(dezena);
                    possiveis.remove(rand);
                    contPar++;
                } else if (possiveis.get(rand) % 2 == 1 && contImpar < 4) {
                    dezena.setNumero(possiveis.get(rand));
                    jogo.getDezenas().add(dezena);
                    possiveis.remove(rand);
                    contImpar++;
                }

            }
            jogos.add(jogo);
        }
    }
}
