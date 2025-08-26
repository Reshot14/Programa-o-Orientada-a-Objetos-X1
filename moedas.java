import java.util.Scanner;

public class moedas{
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            int valor;
            int unreal, meioreal, umquarto, dez, cinco, uno;

            System.out.println("gite um valor em centavos:");
            valor = teclado.nextInt();

            unreal = valor / 100;
            valor = valor % 100;

            meioreal = valor / 50;
            valor = valor % 50;

            umquarto = valor / 25;
            valor = valor % 25;

            dez = valor / 10;
            valor = valor % 10;

            cinco = valor / 5;
            valor = valor % 5;

            uno = valor / 1;

            System.out.println(
                unreal + " moedas de 1 real\n" +
                meioreal + " moedas de 50 centavos\n" +
                umquarto + " moedas de 25 centavos\n" +
                dez + " moedas de 10 centavos\n" +
                cinco + " moedas de 5 centavos\n" +
                uno + " moedas de 1 centavo\n"
            );
        }
    }
}
