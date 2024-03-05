package br.com.alura.comex.dao;

import br.com.alura.comex.modelo.Cliente;
import br.com.alura.comex.modelo.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    private Connection conexao;

    public ClienteDao(Connection con) {
        this.conexao = con;
    }

    public void salvar(Cliente cliente) {

        String sql = "INSERT INTO cliente (id, nome, cpf, email, profissao, telefone, rua, bairro, complemento, estado, numero) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps = null;
        try {
            ps = conexao.prepareStatement(sql);
            ps.setLong(1, cliente.getId());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getCpf());
            ps.setString(4, cliente.getEmail());
            ps.setString(5, cliente.getProfissao());
            ps.setString(6, cliente.getTelefone());
            ps.setString(7, cliente.getEndereco().getRua());
            ps.setString(8, cliente.getEndereco().getBairro());
            ps.setString(9, cliente.getEndereco().getComplemento());
            ps.setString(10, cliente.getEndereco().getEstado());
            ps.setLong(11, cliente.getEndereco().getNumero());

            ps.execute();
            ps.close();
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Cliente> listar() {

        String sql = "SELECT * FROM cliente";

        List<Cliente> clientes = new ArrayList<>();

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String cpf = resultSet.getString("cpf");
                String email = resultSet.getString("email");
                String profissao = resultSet.getString("profissao");
                String telefone = resultSet.getString("telefone");
                String bairro = resultSet.getString("bairro");
                String cidade = resultSet.getString("cidade");
                String complemento = resultSet.getString("complemento");
                String estado = resultSet.getString("estado");
                String rua = resultSet.getString("rua");
                Long numero = resultSet.getLong("numero");

                clientes.add(new Cliente(nome, cpf, email, telefone, new Endereco(bairro, cidade, estado, rua, numero)));
            }

            resultSet.close();
            ps.close();
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public void alterarEmail(Long id, String novoEmail) {

        String sql = "UPDATE cliente SET email = ? WHERE id = ?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, novoEmail);
            ps.setLong(2, id);

            ps.execute();
            ps.close();
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void excluir(Long id) {

        String sql = "DELETE FROM cliente WHERE id = ?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setLong(1, id);

            ps.execute();
            ps.close();
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
