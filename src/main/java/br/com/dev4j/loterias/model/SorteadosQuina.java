package br.com.dev4j.loterias.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="SORTEADOS_QUINA")
public class SorteadosQuina {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "DATA_SORTEIO")
    private Date dtSorteio;

    @Column(name = "CONCURSO")
    private Long concurso;

    @Column(name = "DEZENA_1")
    private Integer dez1;

    @Column(name = "DEZENA_2")
    private Integer dez2;

    @Column(name = "DEZENA_3")
    private Integer dez3;
    
    @Column(name = "DEZENA_4")
    private Integer dez4;

    @Column(name = "DEZENA_5")
    private Integer dez5;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDtSorteio() {
        return dtSorteio;
    }

    public void setDtSorteio(Date dtSorteio) {
        this.dtSorteio = dtSorteio;
    }

    public Long getConcurso() {
        return concurso;
    }

    public void setConcurso(Long concurso) {
        this.concurso = concurso;
    }

    public Integer getDez1() {
        return dez1;
    }

    public void setDez1(Integer dez1) {
        this.dez1 = dez1;
    }

    public Integer getDez2() {
        return dez2;
    }

    public void setDez2(Integer dez2) {
        this.dez2 = dez2;
    }

    public Integer getDez3() {
        return dez3;
    }

    public void setDez3(Integer dez3) {
        this.dez3 = dez3;
    }

    public Integer getDez4() {
        return dez4;
    }

    public void setDez4(Integer dez4) {
        this.dez4 = dez4;
    }

    public Integer getDez5() {
        return dez5;
    }

    public void setDez5(Integer dez5) {
        this.dez5 = dez5;
    }
}
