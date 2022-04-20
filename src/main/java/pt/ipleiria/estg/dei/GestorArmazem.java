package pt.ipleiria.estg.dei;

import pt.ipleiria.estg.dei.models.Categoria;
import pt.ipleiria.estg.dei.models.Produto;
import pt.ipleiria.estg.dei.models.Utilizador;

import java.util.ArrayList;

public class GestorArmazem {
    private ArrayList<Produto> produtos;
    private ArrayList<Utilizador> utilizadores;

    public static GestorArmazem INSTANCE = new GestorArmazem();

    public GestorArmazem() {
        produtos = new ArrayList<>();
        utilizadores = new ArrayList<>();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public ArrayList<Utilizador> getUtilizadores() {
        return utilizadores;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void inserirDadosExemplo(){
        produtos.add(new Produto("Lapis Lazuli", Categoria.PRODUTOS_ANIMAIS, 10, 30));
        produtos.add(new Produto("Cadeira Gaymer Madrux", Categoria.MOBILIA, 5, 18));
        produtos.add(new Produto("Manual de SI", Categoria.LIVROS, 20, 0));
    }
}
