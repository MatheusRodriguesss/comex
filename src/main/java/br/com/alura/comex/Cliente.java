package br.com.alura.comex;

public class Cliente {
    String nome;
    String cpf;
    String email;
    String profissao;
    String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "---------------------CLIENTE---------------------" +
                "\n|Nome: " + nome + "                        |" +
                "\n|CPF: " + cpf + "                            |" +
                "\n|E-mail: " + email + " |" +
                "\n|Profissao: " + profissao + "                     |" +
                "\n|Telefone: " + telefone + "                      |" +
                "\n-------------------------------------------------";
    }
}
