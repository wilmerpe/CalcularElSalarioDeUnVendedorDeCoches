import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salario = 1000;
        int nCochesVendidos;
        float costeCoche, salarioTotal;

        System.out.println("Número de coches vendidos: ");
        nCochesVendidos = entrada.nextInt();
        System.out.println("Coste del coche: ");
        costeCoche = entrada.nextFloat();

        salarioTotal = salario + (nCochesVendidos*150) + (0.05f*costeCoche*nCochesVendidos);
        System.out.println("\nEl salario del empleado es: " + salarioTotal);
    }
}
