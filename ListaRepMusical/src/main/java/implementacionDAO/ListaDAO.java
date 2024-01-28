
package implementacionDAO;

import conexionBD.IConexionBD;
import dominio.Lista;
import interfacesDAO.ILista;
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
public class ListaDAO implements ILista{
    
    IConexionBD iConexionBD;
    
    public ListaDAO(IConexionBD iConexionBD){
        this.iConexionBD = iConexionBD;
    }

    @Override
    public Lista createLista(Lista lista) {
    
        EntityManagerFactory bdf = iConexionBD.useConnectionMySQL();
        EntityManager bd = bdf.createEntityManager();
        try {
            bd.getTransaction().begin();
            bd.persist(lista);
            bd.getTransaction().commit();
            return lista;
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
    public Lista readLista(Lista lista) {
        EntityManagerFactory bdf = iConexionBD.useConnectionMySQL();
        EntityManager bd = bdf.createEntityManager();
        try {
            bd.getTransaction().begin();
            Lista listaBuscada = bd.find(Lista.class, lista.getIdLista());
            bd.getTransaction().commit();
            return listaBuscada;
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
    public Lista updateLista(Lista lista) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteLista(Lista lista) {
        EntityManagerFactory em = iConexionBD.useConnectionMySQL();
        EntityManager bd = em.createEntityManager();
        try {
            bd.getTransaction().begin();
            try {
                lista = bd.find(Lista.class, lista.getIdLista());
            } catch (EntityNotFoundException enfe) {
            }
            if (lista != null) {
                bd.remove(lista);
            }
            bd.getTransaction().commit();
        } finally {
            if (bd != null) {
                bd.close();
            }
        }
    }

    @Override
    public List<Lista> readAllLista() {
        EntityManagerFactory bdf = iConexionBD.useConnectionMySQL();
        EntityManager bd = bdf.createEntityManager();
        try {
            bd.getTransaction().begin();
            CriteriaBuilder builder = bd.getCriteriaBuilder();
            CriteriaQuery<Lista> criteria = builder.createQuery(Lista.class);
            Root<Lista> root = criteria.from(Lista.class);
            TypedQuery<Lista> query = bd.createQuery(criteria);
            List<Lista> listas = query.getResultList();
            bd.getTransaction().commit();
            return listas;

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
