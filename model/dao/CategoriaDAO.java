package model.dao;

import javax.persistence.EntityManager;
import model.bean.Categoria;

public class CategoriaDAO {
    public Categoria save(Categoria categoria){
        
        EntityManager em = new connection.ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(categoria);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return categoria;
    }
}