package exercicios;

import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o capital inicial: ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (em % ao mês): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o número de meses: ");
        int numeroMeses = scanner.nextInt();

        
        double taxaJurosDecimal = taxaJuros / 100;

        
        double montanteFinal = capitalInicial * Math.pow(1 + taxaJurosDecimal, numeroMeses);

        
        System.out.printf("O montante final após %d meses será de: R$%.2f\n", numeroMeses, montanteFinal);

        scanner.close();
    }
}
