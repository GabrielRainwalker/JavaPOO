package Automovel;

public class Automovel {

    String marca;
    String cor;
    int velocidade = 0;
    int combustivel = 0;

    void buzinar() {
        System.out.println("BEEEEEEEEEEPPPPP");
    }

    void acelerar() {
        velocidade = velocidade + 1;
    }

    void reduzir(){
        velocidade = velocidade - 1;
    }

    void combustivel() {
        velocidade = velocidade - 20;
    }
}