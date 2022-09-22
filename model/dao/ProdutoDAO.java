package model.dao;

import connection.ConnectionFactory;
import javax.persistence.EntityManager;
import model.bean.Produto;

public class ProdutoDAO {
    
    public Produto save(Produto produto){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return produto;
    }
}
