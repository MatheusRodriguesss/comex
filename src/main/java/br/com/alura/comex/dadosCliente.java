package br.com.alura.comex;

public class dadosCliente {
    public static void main(String[] args) {

        Cliente client1 = new Cliente();
        client1.setNome("Matheus Rodrigues");
        client1.setCpf("366.024.448-16");
        client1.setEmail("contato.matheusrodrigues3008@gmail.com");
        client1.setProfissao("Dev BackEnd Jr.");
        client1.setTelefone("(11) 97175-2896");

        Endereco adress1 = new Endereco();
        adress1.setBairro("Itaquera");
        adress1.setCidade("São Paulo");
        adress1.setComplemento("Ao lado da adega do batata");
        adress1.setEstado("SP");
        adress1.setRua("Avenida Pires do Rio, 3102");
        adress1.setNumero(3102);


            System.out.println(client1.toString());
            System.out.println(adress1.toString());
    }
}