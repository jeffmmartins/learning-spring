package io.github.jeffmmartins.Arquitetura.spring.montadora;

import java.awt.*;

public class Carro {
    private String modelo;
    private Color cor;
    private Motor motor;
    private Montadora montador;

    // quando for instanciar tem que passar o motor; carro depende do motor e o motor é uma dependêcia do carro
    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Montadora getMontador() {
        return montador;
    }

    public void setMontador(Montadora montador) {
        this.montador = montador;
    }

    public CarroStatus darIngniçao(Chave chave) {
        if (chave.getMontadora() != this.montador){
            return new CarroStatus("Não é possivel iniciar o carro com essa chave");
        }
        return new CarroStatus("Carro ligado rodando com o motor: " + motor);
    }
}
