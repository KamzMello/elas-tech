package Singleton;

public class MainCarrinho {


    public static void main(String[] args) {

        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();

        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();


        System.out.println("Itens no carrinho: " + telaProdutos.getQuantidadeItens());
    }

}