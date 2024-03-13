package Interruptor;

public class Interruptor {
    boolean ligado = false;

    void presionar () {
        ligado = !ligado;
    }

    void VerificarLuz () {
        System.out.println(ligado == true ? "Luz Acessa" : "Luz Apagada");
    }
}
