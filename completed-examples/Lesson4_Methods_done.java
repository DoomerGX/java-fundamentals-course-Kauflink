import java.util.Scanner;

public class Lesson4_Methods_done {

    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso.");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        saludar("Ana");
        saludar("Carlos");
        saludar("Lucia");

        int resultado = sumar(8, 5);
        System.out.println("La suma es: " + resultado);

        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = teclado.nextLine();
        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
}
