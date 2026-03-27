import java.util.Scanner;

public class Superficie {
    public static void main(String[] args) {
        // Dados de entrada
        double x1 = 25.0;   // latitude 1
        double y1 = 35.0;   // longitude 1
        double x2 = 35.5;   // latitude 2
        double y2 = 25.5;   // longitude 2

        // Raio da Terra em km
        double r = 6371.01;

        // Converter graus para radianos
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        // Fórmula da distância
        double d = r * Math.acos(
                Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)
        );

        // Saída
        System.out.println("A distância entre esses pontos é: " + d + " km");
    }
}