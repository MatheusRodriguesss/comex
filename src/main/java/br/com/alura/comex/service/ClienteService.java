package br.com.alura.comex.service;

import br.com.alura.comex.dao.ClienteDao;
import br.com.alura.comex.jdbc.ConnectionFactory;
import br.com.alura.comex.modelo.Cliente;

import java.sql.Connection;

public class ClienteService {

    private Connection conexao = new ConnectionFactory().getConnection();
    public void cadastra(Cliente novoCliente) {

        if(eEmailInvalido(novoCliente)){
            // devolve uma mensagem
            return;
        }

        ClienteDao clienteDao = new ClienteDao(conexao);
        clienteDao.salvar(novoCliente);
    }

    private boolean eEmailInvalido(Cliente novoCliente) {
        return true;
    }

    public void desativa(Long id){
        ClienteDao clienteDao = new ClienteDao(conexao);
        clienteDao.excluir(id);
    }
}
