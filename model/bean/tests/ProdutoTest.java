package model.bean.tests;

import model.bean.Categoria;
import model.bean.Produto;
import model.dao.ProdutoDAO;

public class ProdutoTest {
    public static void main(String[] args) {
        
        ProdutoDAO dao = new ProdutoDAO();
        
        Categoria categoria = new Categoria();
        categoria.setId(4);
        
        Produto produto = new Produto();
        produto.setDescricao("Cenoura");
        produto.setQtd(2);
        produto.setValor(0.50);
        produto.setCategoria(categoria);
        
        dao.save(produto);
    }
}
