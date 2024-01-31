package br.com.alura.comex;

public class Comparar {
    public static String testeCompara(double prod3, double prod4) {
        if (prod3 > prod4) {
            return ("Legal, o primeiro carro é + brabo!");
        } else if (prod3 < prod4) {
            return ("Legal, o segundo carro é menos brabo!");
        } else {
            return ("Legal, o zoado ta no mesmo nivel do brabao!");
        }
    }

    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.setNome("Peugeot 3008");
        prod1.setDescricao("Um carro de respeito!");
        prod1.setPreco(220000.53);
        prod1.setQuantidade(1);

        System.out.println(prod1.getNome());
        System.out.println(prod1.getQuantidade());
        System.out.println(prod1.getDescricao());
        System.out.println(prod1.getPreco());

        Produto prod2 = new Produto();
        prod2.setNome("Bmw 320");
        prod2.setDescricao("Um carro de boyzinho!");
        prod2.setPreco(150000.00);
        prod2.setQuantidade(2);

        System.out.println(prod2.getNome());
        System.out.println(prod2.getQuantidade());
        System.out.println(prod2.getDescricao());
        System.out.println(prod2.getPreco());

        System.out.println(testeCompara(prod1.getPreco(), prod2.getPreco()));
        System.out.println(prod1.toString());
    }

}
