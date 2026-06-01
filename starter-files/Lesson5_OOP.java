// TODO: Define la clase Estudiante con atributos privados y métodos
class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    // TODO: Escribe el constructor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // TODO: Escribe los getters
    public String getNombre()   { return nombre; }
    public int getEdad()        { return edad; }
    public double getPromedio() { return promedio; }

    // TODO: Escribe el setter para promedio
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // TODO: Escribe el método mostrarInfo()
    public void mostrarInfo() {
        System.out.println("----------------------");
        System.out.println("Nombre  : " + nombre);
        System.out.println("Edad    : " + edad + " años");
        System.out.println("Promedio: " + promedio);
        if (promedio >= 11) {
            System.out.println("Estado  : Aprobado");
        } else {
            System.out.println("Estado  : Desaprobado");
        }
    }
}

public class Lesson5_OOP {
    public static void main(String[] args) {
        // TODO: Crea tres objetos Estudiante y llama a mostrarInfo() en cada uno
        Estudiante e1 = new Estudiante("Sofia", 15, 16.5);
        Estudiante e2 = new Estudiante("Diego", 14, 9.0);
        Estudiante e3 = new Estudiante("Valeria", 16, 13.8);

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();

        // TODO: Actualiza el promedio de Diego y muéstralo
        e2.setPromedio(12.0);
        System.out.println("\nDiego actualizó su promedio a: " + e2.getPromedio());
    }
}
