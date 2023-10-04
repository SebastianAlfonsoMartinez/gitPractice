package org.example.usuario;

public class User {
    private String nombre;
    private String clave;
    private  Double puntaje;
    private Integer nivel;

    public User(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        puntaje = 0.0;
        nivel = 0;

    }

    public String getNombre() {
        return nombre;
    }


    public String getClave() {
        return clave;
    }


    public Double getPuntaje() {
        return puntaje;
    }


    public int getNivel() {
        return nivel;
    }


    public void aumentarPuntaje(){
        puntaje++;
    }

    public void subirNivel(){
        nivel++;
    }
    public void bonus(Integer valor){
        puntaje += valor;
    }

    public void verificarEstadoJugador(){
        String info = "El jugador: " + nombre + " tiene nivel: " + nivel + " y su puntaje es de: " + puntaje;
        System.out.println(info);
    }
}
