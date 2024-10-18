package servico;

import entidades.Produto;
import estrategias.DescontoStrategy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    public final ArrayList<Produto> lista = new ArrayList<>();
    private DescontoStrategy descontoStrategy;

    public void adicionarProduto(Produto produto){
        this.lista.add(produto);
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy){
        this.descontoStrategy = descontoStrategy;
    }
    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : lista) {
            total += descontoStrategy.calcularDesconto(produto.getPrecoBase());
        }
        return total;
    }

}
