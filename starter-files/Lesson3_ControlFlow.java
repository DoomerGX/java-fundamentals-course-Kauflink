public class Lesson3_ControlFlow {
    public static void main(String[] args) {
        int[] notas = {8, 15, 11, 6, 18};

        // TODO: Recorre el arreglo de notas con un bucle for
        for (int i = 0; i < notas.length; i++) {
            // TODO: Usa if-else para imprimir si cada nota es Aprobado o Desaprobado
            if (notas[i] >= 11) {
                System.out.println("Nota " + notas[i] + " -> Aprobado");
            } else {
                System.out.println("Nota " + notas[i] + " -> Desaprobado");
            }
        }

        // TODO (reto): Cuenta e imprime cuántas notas aprobatorias hay en total
    }
}
