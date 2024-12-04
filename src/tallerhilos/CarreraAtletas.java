/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerhilos;


/**
 *
 * @author Usuario
 */
public class CarreraAtletas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Atletas atleta1 = new Atletas("Atleta 1");
        Atletas atleta2 = new Atletas("Atleta 2");
        Atletas atleta3 = new Atletas("Atleta 3");
        Atletas atleta4 = new Atletas("Atleta 4");
        Atletas atleta5 = new Atletas("Atleta 5");

        // Iniciar los hilos (carrera)
        atleta1.start();
        atleta2.start();
        atleta3.start();
        atleta4.start();
        atleta5.start();

        // Esperar a que terminen los hilos
        try {
            atleta1.join();
            atleta2.join();
            atleta3.join();
            atleta4.join();
            atleta5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("¡La carrera ha terminado!");
    }
}
