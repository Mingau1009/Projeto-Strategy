import entidades.Produto;
import estrategias.DescontoClienteNovo;
import estrategias.DescontoClienteRegular;
import estrategias.DescontoClienteVIP;
import servico.CarrinhoDeCompras;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 100.0);
        Produto produto3 = new Produto("Tenis", 200.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para Cliente Novo: R$" + carrinho.calcularTotal());

        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para Cliente Regular: R$" + carrinho.calcularTotal());

        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total para Cliente Vip: R$" + carrinho.calcularTotal());
    }
}