/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maxel
 */
import javax.swing.JTextArea;

public class ThreadRunner implements Runnable {
    private Runner runner;
    private JTextArea textArea;

    public ThreadRunner(Runner runner, JTextArea textArea) {
        this.runner = runner;
        this.textArea = textArea;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        try {
            // Dormir el hilo por la velocidad del corredor en milisegundos
            Thread.sleep(runner.getSpeed() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long elapsedTimeSeconds = (endTime - startTime) / 1000;

        // Formatear la salida con el nombre del corredor y el tiempo transcurrido
        String result = runner.getName() + " - Tiempo " + elapsedTimeSeconds + " segundos\n";

        // Agregar el resultado al JTextArea de manera sincronizada
        synchronized (textArea) {
            textArea.append(result);
        }
    }
}
