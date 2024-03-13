package Produtos;

public class TestarProduto {
    public static void main(String[] args) {
        Produtos meuProduto;
        meuProduto = new Produtos();
        meuProduto.nome = "Picanha";
        meuProduto.preco = 9.99;
        meuProduto.InformarNome();
        meuProduto.InformarPreco();
        meuProduto.FazerPromocao();
        
    }
}
