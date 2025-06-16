package io.github.jeffmmartins.Arquitetura.spring.montadora;

public class Chave {
    private Montadora montadora;
    private TipoMotor tipo;

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
