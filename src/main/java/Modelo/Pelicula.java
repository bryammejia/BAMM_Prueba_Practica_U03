
package Modelo;

/**
 *
 * @author USER
 */
public class Pelicula {

    private int codigo;
    private String titulo;
    private String director;
    private int numeroActores;

    public Pelicula(int codigo, String titulo, String director, int numeroActores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
        this.numeroActores = numeroActores;
    }

    public Pelicula() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNumeroActores() {
        return numeroActores;
    }

    public void setNumeroActores(int numeroActores) {
        this.numeroActores = numeroActores;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "codigo=" + codigo + ", titulo=" + titulo + ", director=" + director + ", numeroActores=" + numeroActores + '}';
    }

   
    
}
