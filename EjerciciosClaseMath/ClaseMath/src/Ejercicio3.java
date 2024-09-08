public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        double notas = 0.0;

        for (int i = 0; i < 5; i++) {

            double nota = Math.random() * (10 - 0);
            System.out.println(String.format("Nota %d: %.2f", (i + 1), nota));
            notas += nota;

        }
        System.out.println(String.format("El promedio de notas es: %.4f", (notas / 5)));
    }
}