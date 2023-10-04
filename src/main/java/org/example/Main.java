package org.example;

import org.example.usuario.User;

public class Main {
    public static void main(String[] args) {

        User userNumberOne = new User("Jaguar", "2587");
        userNumberOne.verificarEstadoJugador();
        userNumberOne.subirNivel();
        userNumberOne.aumentarPuntaje();
        userNumberOne.bonus(3);
        userNumberOne.verificarEstadoJugador();
        userNumberOne.subirNivel();
        userNumberOne.aumentarPuntaje();
        userNumberOne.bonus(10);
        userNumberOne.verificarEstadoJugador();



        System.out.println("Hello GitHub");
    }
}