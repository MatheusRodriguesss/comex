package br.com.alura.comex.modelo;

import br.com.alura.comex.integracao.ViaCepResponse;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

    private String bairro;
    private String cidade;
    private String complemento;
    private String estado;
    private String rua;
    private Long numero;

    public Endereco(String bairro, String cidade, String estado, String rua, Long numero) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco(ViaCepResponse response, Long numero) {
        this.bairro = response.getBairro();
        this.cidade = response.getLocalidade();
        this.estado = response.getUf();
        this.rua = response.getLogradouro();
        this.numero = numero;
    }

    public Endereco() {
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                ", estado='" + estado + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                '}';
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }
}
