
package fachadaDAO;

import dominio.Cancion;
import dominio.Lista;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IFachadaDAO {
    
    
    public Cancion createCancion(Cancion cancion);
    
    public Cancion readCancion(Cancion cancion);
    
    public Cancion updateCancion(Cancion cancion);
    
    public void deleteCancion(Cancion cancion);
    
    public List<Cancion> readAllCancion();
    
    
    public Lista createLista(Lista lista);
    
    public Lista readLista(Lista lista);
    
    public Lista updateLista(Lista lista);
    
    public void deleteLista(Lista lista);
    
    public List<Lista> readAllLista();
    
    
}
