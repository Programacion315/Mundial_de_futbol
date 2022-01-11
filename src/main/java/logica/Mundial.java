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
public class Mundial {
    
    private String rutaArchivo; 
    
    ArrayList<Equipo> equipos = new ArrayList<>();

    public Mundial(String ruta) {
        this.rutaArchivo = ruta;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    
    public void ingresarEquipoMundial(Equipo equipo){
        
        equipos.add(equipo);
    }
    
    
}
