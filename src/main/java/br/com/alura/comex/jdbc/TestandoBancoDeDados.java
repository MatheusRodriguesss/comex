package br.com.alura.comex.jdbc;

import br.com.alura.comex.modelo.Cliente;
import br.com.alura.comex.service.ClienteService;

import java.sql.Connection;
import java.sql.SQLException;

public class TestandoBancoDeDados {

    public static void main(String[] args) throws SQLException {

        Cliente novoCliente = new Cliente(2L, "Nadia", "555.555.555-55", "alura@alura.com.br", "09070-100", 55l);

        ClienteService clienteService = new ClienteService();
        clienteService.cadastra(novoCliente);
    }
}
