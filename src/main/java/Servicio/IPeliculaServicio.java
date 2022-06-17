/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Pelicula;
import java.util.List;

/**
 *
 * @author USER
 */
public interface IPeliculaServicio {
    
    public Pelicula crear(Pelicula pelicula);
    public Pelicula buscarPorCodigo(int Codigo);
    public List<Pelicula> listar();
    
}
