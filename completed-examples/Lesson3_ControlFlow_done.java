public class Lesson3_ControlFlow_done {
    public static void main(String[] args) {
        int[] notas = {8, 15, 11, 6, 18};
        int aprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 11) {
                System.out.println("Nota " + notas[i] + " -> Aprobado");
                aprobados++;
            } else {
                System.out.println("Nota " + notas[i] + " -> Desaprobado");
            }
        }

        System.out.println("Total aprobados: " + aprobados);
    }
}
