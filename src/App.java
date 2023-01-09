public class App {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < numeros.length; i++) {
            String resultado = "";
            int aux = numeros[i];
            for (int j = 0; j < aux; j++) {
                resultado = resultado + aux;
            }
            System.out.println(resultado);
        }
    }

}
