public class Ejercicio2 {

    public static void main(String[] args) throws Exception {
        int[] numeros = { 2, 8, 9, 27, 28, 55, 121 };

        for (int i = 0; i < numeros.length; i++) {
            double resultados = Math.sqrt(numeros[i]);
            System.out.println(i + 1 + ") " + "√" + numeros[i] + " = " + resultados);
        }
    }
}