package Datas;

public class Datas {

    int dia;
    int mes;
    int ano;

    void escreverData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    void escreverMes() {
        String[] datas = {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        System.out.println(datas[mes]);
    }
}