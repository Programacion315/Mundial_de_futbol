/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author jluiso315
 */
public class Equipo {
    
    private String pais;
    private String director;
    private String imagen;
    
    ArrayList<Jugador> jugadores = new ArrayList<>();
    

    public Equipo(String pais, String director, String imagen) {
        this.pais = pais;
        this.director = director;
        this.imagen = imagen;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public void insertarJugadorLista(Jugador jugador){
        
        jugadores.add(jugador);
    }
            
    
}
