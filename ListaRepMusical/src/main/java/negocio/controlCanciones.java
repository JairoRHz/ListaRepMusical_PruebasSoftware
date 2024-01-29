package negocio;

import dominio.Cancion;
import java.util.ArrayList;
import java.util.List;

public class controlCanciones {

    private static List<Cancion> listaDeCanciones = new ArrayList<>();

    public void agregarCancion(String nombre, String artista, String colaborador, String ruta, String genero) {
        Cancion cancion = new Cancion(nombre, artista, colaborador, ruta, genero);
        listaDeCanciones.add(cancion);
        System.out.println(listaDeCanciones);
    }

    public void modificarLista() {

    }

    public List<String> obtenerTodasLasCanciones() {
        List<String> todasLasCanciones = new ArrayList<>();

        for (Cancion cancion : listaDeCanciones) {
            String nombre = cancion.getNombre();
            todasLasCanciones.add(nombre);
//            String artista = cancion.getArtista();
//            todasLasCanciones.add(artista + " - " + nombre);
        }
        return todasLasCanciones;
    }

}
