package Automovel;

public class TestarAutomovel {
    
    public static void main(String[] args) {
        Automovel meuCarro;
        meuCarro = new Automovel();
        meuCarro.marca = "Opala";
        meuCarro.cor = "Preto Azulado";
        meuCarro.velocidade = 100;
        meuCarro.acelerar();
        meuCarro.combustivel();
        System.out.println("A velocidade é: "+ meuCarro.velocidade);
        System.out.println(meuCarro.marca + " " + "tem" + " " + meuCarro.combustivel + " " + "Litros de Gasosa");
    }
}
