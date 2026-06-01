import java.util.Scanner;

public class Lesson4_Methods {

    // TODO: Define un método saludar que reciba un nombre e imprima un saludo
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso.");
    }

    // TODO: Define un método sumar que reciba dos enteros y retorne su suma
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // TODO: Llama al método saludar con tres nombres distintos
        saludar("Ana");
        saludar("Carlos");
        saludar("Lucia");

        // TODO: Llama al método sumar e imprime el resultado
        int resultado = sumar(8, 5);
        System.out.println("La suma es: " + resultado);

        // TODO: Usa Scanner para pedir el nombre y edad del usuario
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = teclado.nextLine();
        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
}
