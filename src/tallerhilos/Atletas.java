/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerhilos;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Atletas extends Thread {
    private String nombre;
    private int velocidad; // Velocidad en kms por segundo
    private static final int META = 10000; // Meta en kms
    private int distanciaRecorrida = 0;

    public Atletas(String nombre) {
        this.nombre = nombre;
        this.velocidad = new Random().nextInt(1000) + 1; // Velocidad aleatoria entre 1 y 1000
    }

    @Override
    public void run() {
        System.out.println(nombre + " comienza la carrera con una velocidad de " + velocidad + " kms/seg.");
        while (distanciaRecorrida < META) {
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            distanciaRecorrida += velocidad;
            System.out.println(nombre + " ha recorrido " + distanciaRecorrida + " kms.");
        }
        System.out.println(nombre + " ha alcanzado la meta!");
    }

    public String getNombre() {
        return nombre;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }
}
