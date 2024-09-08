public class Ejercicio4 {
    public static void main(String[] args) throws Exception {

        int numero1 = 0;
        int numero2 = 0;

        for (int i = 0; i < 2; i++) {

            double numero = Math.random() * (50 - 1) + 1;
            int redondeo = (int) Math.round(numero);

            if (numero1 == 0) {
                numero1 = redondeo;
                System.out.println("Numero 1: " + numero1);
            } else {
                numero2 = redondeo;
                System.out.println("Numero 2: " + numero2);
            }

        }
        int numero_Maximo = Math.max(numero1, numero2);
        System.out.println("El numero Maximo es: " + numero_Maximo);

    }
}
