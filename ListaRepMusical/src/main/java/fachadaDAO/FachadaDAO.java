
package fachadaDAO;

import dominio.Cancion;
import dominio.Lista;
import factoryDAO.FactoryDAO;
import factoryDAO.IFactoryDAO;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class FachadaDAO implements IFachadaDAO{
    
    IFactoryDAO iFactoryDAO;
    
    public FachadaDAO(){
        this.iFactoryDAO = new FactoryDAO();
    }

    @Override
    public Cancion createCancion(Cancion cancion) {
        return iFactoryDAO.createCancionDAO().createCancion(cancion);
    }

    @Override
    public Cancion readCancion(Cancion cancion) {
        return iFactoryDAO.readCancionDAO().readCancion(cancion);
    }

    @Override
    public Cancion updateCancion(Cancion cancion) {
        return null;
    }

    @Override
    public void deleteCancion(Cancion cancion) {
        iFactoryDAO.createCancionDAO().deleteCancion(cancion);
    }

    @Override
    public List<Cancion> readAllCancion() {
        return iFactoryDAO.createCancionDAO().readAllCancion();
    }

    @Override
    public Lista createLista(Lista lista) {
        return iFactoryDAO.createListaDAO().createLista(lista);
    }

    @Override
    public Lista readLista(Lista lista) {
        return iFactoryDAO.readListaDAO().readLista(lista);
    }

    @Override
    public Lista updateLista(Lista lista) {
        return iFactoryDAO.createListaDAO().updateLista(lista);
    }

    @Override
    public void deleteLista(Lista lista) {
        iFactoryDAO.createListaDAO().deleteLista(lista);
    }

    @Override
    public List<Lista> readAllLista() {
        return iFactoryDAO.createListaDAO().readAllLista();
    }
    
}
