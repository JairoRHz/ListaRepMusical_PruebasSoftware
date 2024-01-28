
package dominio;

import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
@Entity
@Table(name = "lista")
public class Lista {
    
    //Atributos de la clase
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLista;
    
    @Column(name = "nombre", nullable = false)
    private String nombreLista;
    
    //Relaciones
    @ManyToMany()
    @JoinTable(name = "cancion_lista",
            joinColumns = @JoinColumn(name = "id_cancion"),
            inverseJoinColumns = @JoinColumn(name = "id_lista"))
    private List<Cancion> cancion;

    //--------- Constructores ----------
    public Lista() {
    }

    public Lista(Long idLista, String nombreLista, List<Cancion> cancion) {
        this.idLista = idLista;
        this.nombreLista = nombreLista;
        this.cancion = cancion;
    }

    public Lista(String nombreLista, List<Cancion> cancion) {
        this.nombreLista = nombreLista;
        this.cancion = cancion;
    }

    // Getter and setter
    public Long getIdLista() {
        return idLista;
    }

    public void setIdLista(Long idLista) {
        this.idLista = idLista;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public List<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(List<Cancion> cancion) {
        this.cancion = cancion;
    }
    
    //---------------------------------------------

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idLista);
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
        final Lista other = (Lista) obj;
        return Objects.equals(this.idLista, other.idLista);
    }

    //-------------- To String -----------------
    @Override
    public String toString() {
        return "Lista{" + "idLista=" + idLista + ", nombreLista=" + nombreLista + ", cancion=" + cancion + '}';
    }
    
    
}
