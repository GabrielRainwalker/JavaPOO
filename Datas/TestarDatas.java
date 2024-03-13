package Datas;

public class TestarDatas {
    public static void main (String[] args) {
        Datas meuData;
        meuData = new Datas();
        meuData.dia = 10;
        meuData.mes = 05;
        meuData.ano = 2004;
        meuData.escreverData();
        meuData.escreverMes();
        meuData.mes = 06;
        meuData.escreverData();
        meuData.escreverMes();
    }
}