
package Controlador;

import Modelo.Pelicula;
import Servicio.PeliculaServicio;
import java.util.List;

/**
 *
 * @author USER
 */
public class PeliculaControl {

    private final PeliculaServicio peliculaServicio = new PeliculaServicio();
    
    public Pelicula crear(String []args){
        var pelicula = new Pelicula(Integer.valueOf(args[0]), args[1], args[2], Integer.valueOf(args[3]));
        this.peliculaServicio.crear(pelicula);
        return pelicula;
    }
    
    public List<Pelicula> listar(){
        return this.peliculaServicio.listar();
    }
    
}
