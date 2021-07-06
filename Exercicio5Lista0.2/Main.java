import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");

        int raio = input.nextInt();
        input.close();

        Circulo umCirculo = new Circulo(raio);

        umCirculo.setRaio(raio);

        // print
        System.out.println("Raio: " + raio);
        System.out.println("Area: " + umCirculo.area());
        System.out.println("Circunferencia: " + umCirculo.circunf());
    }
}