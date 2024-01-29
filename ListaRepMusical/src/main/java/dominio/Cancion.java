
package dominio;

import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
@Entity
@Table(name = "cancion")
public class Cancion {
    
    //Atributos de la clase
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCancion;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "artista", nullable = false)
    private String artista;
    
    @Column(name = "colaborador", nullable = false)
    private String colaborador;
    
    @Column(name = "ruta", nullable = false)
    private String ruta;
    
    @Column(name = "genero", nullable = false)
    private String genero;
   
    //Relaciones
    @ManyToMany(mappedBy = "lista", fetch = FetchType.EAGER)
    private List<Lista> lista;
    
    //----- Constructores -----

    public Cancion() {
    }

    public Cancion(Long idCancion, String nombre, String artista, String colaborador, String ruta, String genero, List<Lista> lista) {
        this.idCancion = idCancion;
        this.nombre = nombre;
        this.artista = artista;
        this.colaborador = colaborador;
        this.ruta = ruta;
        this.genero = genero;
        this.lista = lista;
    }

    public Cancion(String nombre, String artista, String colaborador, String ruta, String genero, List<Lista> lista) {
        this.nombre = nombre;
        this.artista = artista;
        this.colaborador = colaborador;
        this.ruta = ruta;
        this.genero = genero;
        this.lista = lista;
    }
    
    public Cancion(String nombre, String artista, String colaborador, String ruta, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.colaborador = colaborador;
        this.ruta = ruta;
        this.genero = genero;
    }
    
    //----- Getter & Setter -----

    public Long getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(Long idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Lista> getLista() {
        return lista;
    }

    public void setLista(List<Lista> lista) {
        this.lista = lista;
    }
    
    // ----- Hash Code -----

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.idCancion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        return Objects.equals(this.idCancion, other.idCancion);
    }
    
    //----- To String -----

    @Override
    public String toString() {
        return "Cancion{" + "idCancion=" + idCancion + ", nombre=" + nombre + ", artista=" + artista + ", colaborador=" + colaborador + ", ruta=" + ruta + ", genero=" + genero + ", lista=" + lista + '}';
    }
    
    
}
