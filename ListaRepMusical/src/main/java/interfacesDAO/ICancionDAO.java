
package interfacesDAO;

import dominio.Cancion;
import java.util.List;


/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface ICancionDAO {
    
    public Cancion createCancion(Cancion cancion);
    
    public Cancion readCancion(Cancion cancion);
    
    public Cancion updateCancion(Cancion cancion);
    
    public void deleteCancion(Cancion cancion);
    
    public List<Cancion> readAllCancion();
}
