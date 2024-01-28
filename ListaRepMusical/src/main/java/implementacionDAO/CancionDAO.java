
package implementacionDAO;

import conexionBD.IConexionBD;
import dominio.Cancion;
import interfacesDAO.ICancionDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class CancionDAO implements ICancionDAO{
    
    IConexionBD iConexionBD;
    
    public CancionDAO(IConexionBD iConexionBD){
        this.iConexionBD = iConexionBD;
    }

    @Override
    public Cancion createCancion(Cancion cancion) {
        EntityManagerFactory bdf = iConexionBD.useConnectionMySQL();
        EntityManager bd = bdf.createEntityManager();
        try {
            bd.getTransaction().begin();
            bd.persist(cancion);
            bd.getTransaction().commit();
            return cancion;
        } catch (Exception ex) {
            bd.getTransaction().rollback();
            System.out.println(ex.getMessage());
        } finally {
            if (bd != null && bd.isOpen()) {
                bd.close();
            }
        }
        return null;
    }

    @Override
    public Cancion readCancion(Cancion cancion) {

        EntityManagerFactory bdf = iConexionBD.useConnectionMySQL();
        EntityManager bd = bdf.createEntityManager();
        try {
            bd.getTransaction().begin();
            Cancion cancionBuscada = bd.find(Cancion.class, cancion.getIdCancion());
            bd.getTransaction().commit();
            return cancionBuscada;
        } catch (Exception ex) {
            bd.getTransaction().rollback();
            System.out.println(ex.getMessage());
        } finally {
            if (bd != null && bd.isOpen()) {
                bd.close();
            }
        }
        return null; 
    }

    @Override
    public Cancion updateCancion(Cancion cancion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteCancion(Cancion cancion) {
        EntityManagerFactory em = iConexionBD.useConnectionMySQL();
        EntityManager bd = em.createEntityManager();
        try {
            bd.getTransaction().begin();
            try {
                cancion = bd.find(Cancion.class, cancion.getIdCancion());
            } catch (EntityNotFoundException enfe) {
            }
            if (cancion != null) {
                bd.remove(cancion);
            }
            bd.getTransaction().commit();
        } finally {
            if (bd != null) {
                bd.close();
            }
        }
    }

    @Override
    public List<Cancion> readAllCancion() {
        EntityManagerFactory bdf = iConexionBD.useConnectionMySQL();
        EntityManager bd = bdf.createEntityManager();
        try {
            bd.getTransaction().begin();
            CriteriaBuilder builder = bd.getCriteriaBuilder();
            CriteriaQuery<Cancion> criteria = builder.createQuery(Cancion.class);
            Root<Cancion> root = criteria.from(Cancion.class);
            TypedQuery<Cancion> query = bd.createQuery(criteria);
            List<Cancion> chats = query.getResultList();
            bd.getTransaction().commit();
            return chats;

        } catch (Exception ex) {
            bd.getTransaction().rollback();
            System.out.println(ex.getMessage());
        } finally {
            if (bd != null && bd.isOpen()) {
                bd.close();
            }
        }
        return null;
    }
    
}
