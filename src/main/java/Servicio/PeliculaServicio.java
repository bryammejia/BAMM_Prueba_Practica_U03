
package Servicio;

import Modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class PeliculaServicio implements IPeliculaServicio {

    public static List<Pelicula> peliculaList = new ArrayList<>();
    
    @Override
    public Pelicula crear(Pelicula pelicula) {
        this.peliculaList.add(pelicula);
        return pelicula;
        
    }

    @Override
    public Pelicula buscarPorCodigo(int i) {
        var pelicula = new Pelicula();
        for(Pelicula p:this.peliculaList){
            if(p.getCodigo()==i){
                pelicula=p;
                break;
            }
        }
        return pelicula;
    }

    @Override
    public List<Pelicula> listar() {
        return this.peliculaList;
    }

}
