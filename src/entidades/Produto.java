package entidades;

public class Produto {
    private String nomeProduto = "";
    private double precoBase;

    public Produto(String nomeProduto, double precoBase) {
        this.nomeProduto = nomeProduto;
        this.precoBase = precoBase;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}
