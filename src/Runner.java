
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maxel
 */
public class Runner {

    private String name;
    private int speed; 

    public Runner(String name) {
        this.name = name;
        this.speed = generarVelocidadAleatoria();
    }

    // Método para generar velocidad aleatoria entre 0 y 30
    private int generarVelocidadAleatoria() {
        Random random = new Random();
        return random.nextInt(31);
    }
    
    @Override
    public String toString() {
        return "Runner: " + name + " Speed: " + speed;
    }

    // Getters para obtener nombre y velocidad
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}

