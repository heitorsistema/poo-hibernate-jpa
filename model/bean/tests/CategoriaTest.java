package model.bean.tests;

import model.bean.Categoria;
import model.dao.CategoriaDAO;

public class CategoriaTest {
    public static void main(String[] args) {
        Categoria c = new Categoria();
        c.setDescricao ("Verduras");
        
        CategoriaDAO dao = new CategoriaDAO();
        dao.save(c);
    }
}