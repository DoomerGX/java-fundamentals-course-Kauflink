class Estudiante_done {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante_done(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre()   { return nombre; }
    public int getEdad()        { return edad; }
    public double getPromedio() { return promedio; }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

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

public class Lesson5_OOP_done {
    public static void main(String[] args) {
        Estudiante_done e1 = new Estudiante_done("Sofia", 15, 16.5);
        Estudiante_done e2 = new Estudiante_done("Diego", 14, 9.0);
        Estudiante_done e3 = new Estudiante_done("Valeria", 16, 13.8);

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();

        e2.setPromedio(12.0);
        System.out.println("\nDiego actualizó su promedio a: " + e2.getPromedio());
    }
}
