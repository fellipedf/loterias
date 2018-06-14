package br.com.dev4j.loterias.model;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private List<Dezena> dezenas;

    public List<Dezena> getDezenas() {
        if (dezenas == null)
            dezenas = new ArrayList<>();
        return dezenas;
    }

    public void setDezenas(List<Dezena> dezenas) {
        this.dezenas = dezenas;
    }

}
