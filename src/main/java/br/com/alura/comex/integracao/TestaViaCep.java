package br.com.alura.comex.integracao;

import br.com.alura.comex.modelo.Cliente;

public class TestaViaCep {

    public static void main(String[] args) {

        ViaCepService viaCepService = new ViaCepService();
        ViaCepResponse response = viaCepService.buscaCep("09070100");
        System.out.println(response);

        Cliente testeDoCliente = new Cliente("Fabricio", "000.000.000-55", "alura@alura.com", "09890450", 10l);
        System.out.println(testeDoCliente);
    }
}
