package Produtos;

public class Produtos {
    String nome;
    Double preco;

    void InformarNome() {
        System.out.println("O nome do produto é: " + nome);
    }

    void InformarPreco() {
        System.out.println("O preço do produto é: " + preco + " " + "Lules");
    }
    
    void FazerPromocao() {
       System.out.println(preco = preco - 1); 
    }
}