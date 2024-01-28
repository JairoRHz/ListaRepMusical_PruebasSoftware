
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CancionDAO deleteCancionDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<CancionDAO> readAllCancionDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListaDAO createListaDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListaDAO readListaDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListaDAO updateListaDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListaDAO deleteListaDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ListaDAO> readAllListaDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
