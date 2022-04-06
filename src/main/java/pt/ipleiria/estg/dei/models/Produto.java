package pt.ipleiria.estg.dei.models;

public class Produto {

    private String nome;
    private Categoria categoria;
    private double peso;
    private int stock;

    public String getNome() {
        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPeso() {
        return peso;
    }

    public int getStock() {
        return stock;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Produto(String nome, Categoria categoria, double peso, int stock) {
        this.nome = nome;
        this.categoria = categoria;
        this.peso = peso;
        this.stock = stock;
    }
}
