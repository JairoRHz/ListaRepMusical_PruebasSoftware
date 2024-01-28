
package factoryDAO;

import implementacionDAO.CancionDAO;
import implementacionDAO.ListaDAO;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IFactoryDAO {
    
    public CancionDAO createCancionDAO();
    
    public CancionDAO readCancionDAO();
    
    public CancionDAO deleteCancionDAO();
    
    public List<CancionDAO> readAllCancionDAO();
    
    public ListaDAO createListaDAO();
    
    public ListaDAO readListaDAO();
    
    public ListaDAO updateListaDAO();
    
    public ListaDAO deleteListaDAO();
    
    public List<ListaDAO> readAllListaDAO();
}
