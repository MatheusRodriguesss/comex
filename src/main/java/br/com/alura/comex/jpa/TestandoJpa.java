package br.com.alura.comex.jpa;

import br.com.alura.comex.modelo.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestandoJpa {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
        EntityManager em = factory.createEntityManager();

        System.out.println("Conectou com JPA");

        Cliente novoCliente = new Cliente("Nadia", "555.555.555-55", "alura@alura.com.br", "09070-100", 55l);

        em.getTransaction().begin();
        em.persist(novoCliente);
        em.getTransaction().commit();

    }
}
