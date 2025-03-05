package com.equipos;
import java.io.Serializable;

public class Equipos implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String ciudad_que_representa;
    private String fecha_de_fundacion;
    private String Presidente;
    private String ArrayList<jugador> Jugadores;

    public Equipos(String nombre, String ciudad_que_representa, String fecha_de_fundacion, String Presidente) {
        this.nombre = nombre;
        this.ciudad_que_representa = ciudad_que_representa;
        this.fecha_de_fundacion = fecha_de_fundacion;
        this.Presidente = Presidente;
   
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getnombre() {return nombre;}

    public void setnombre(String nombre) {this.nombre = nombre;}

    public String getciudad_que_representa() {return ciudad_que_representa;}

    public void setciudad_que_representa(String ciudad_que_representa){this.ciudad_que_representa = ciudad_que_representa;}

    public String getfecha_de_fundacion(){return fecha_de_fundacion;}
   
    public void setfecha_de_fundacion(String fecha_de_fundacion){this.fecha_de_fundacion = fecha_de_fundacion;}
    
    public String getPresidente(){return Presidente;}
   
    public void setPresidente(String Presidente){this.Presidente = Presidente;}



}
