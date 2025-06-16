package io.github.jeffmmartins.Arquitetura.spring.montadora;

public class Motor {
    private String modelo;
    private Integer cavalos;
    private Double cilindros;
    private Double litragem;
    private TipoMotor tipo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Double getCilindros() {
        return cilindros;
    }

    public void setCilindros(Double cilindros) {
        this.cilindros = cilindros;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
