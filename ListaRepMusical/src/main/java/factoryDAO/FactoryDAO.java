
package factoryDAO;

import conexionBD.ConexionBD;
import conexionBD.IConexionBD;
import implementacionDAO.CancionDAO;
import implementacionDAO.ListaDAO;
import java.util.List;


/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class FactoryDAO implements IFactoryDAO{
    
    private IConexionBD conexion;
    
    public FactoryDAO(){
        this.conexion = new ConexionBD();
    }

    @Override
    public CancionDAO createCancionDAO() {
        return new CancionDAO(conexion);
    }

    @Override
    public CancionDAO readCancionDAO() {
        return new CancionDAO(conexion);
    }

//    @Override
//    public void deleteCancionDAO() {
//        return new CancionDAO(conexion);
//    }

    @Override
    public List<CancionDAO> readAllCancionDAO() {
        return (List<CancionDAO>) new CancionDAO(conexion);
    }

    @Override
    public ListaDAO createListaDAO() {
        return new ListaDAO(conexion);
    }

    @Override
    public ListaDAO readListaDAO() {
        return new ListaDAO(conexion);
    }

    @Override
    public ListaDAO updateListaDAO() {
        return new ListaDAO(conexion);
    }

//    @Override
//    public void deleteListaDAO() {
//        return new ListaDAO(conexion);
//    }

    @Override
    public List<ListaDAO> readAllListaDAO() {
        return (List<ListaDAO>) new ListaDAO(conexion);
    }

    
}
