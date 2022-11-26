import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Funcional {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Matias");
        nombres.add("Renata");
        nombres.add("test");

        nombres.stream().forEach(x -> System.out.println(x));

        Stream<String> valores = nombres.stream().map(x -> x.toUpperCase()).filter(x -> x.startsWith("M"));
        valores.forEach(x -> System.out.println(x));


        //forma funcional o declarativa
        int []numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var stNumeros = Arrays.stream(numeros);
        var resultado = stNumeros
                .map(x -> x * 2)
                .filter(x -> x % 2 == 0)
                .reduce(0, (x, y) -> x + y);

        //forma imperativa
        int sumatotal = 0;
        for (int numero : numeros){
            numero = numero * 2;
            if (numero % 2 != 0){
                continue;
            }
            sumatotal += numero;
        }

        System.out.println("Mi suma de pares es: " +resultado + " y con for: " +sumatotal);


    }
}
