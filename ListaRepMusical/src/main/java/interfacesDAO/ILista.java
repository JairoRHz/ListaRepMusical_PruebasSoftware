
package interfacesDAO;

import dominio.Lista;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface ILista {
    
    public Lista createLista(Lista lista);
    
    public Lista readLista(Lista lista);
    
    public Lista updateLista(Lista lista);
    
    public void deleteLista(Lista lista);
    
    public List<Lista> readAllLista();
}
