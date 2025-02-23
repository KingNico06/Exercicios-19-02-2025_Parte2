package exercicios;

import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o capital inicial: ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o tempo em meses: ");
        int tempoMeses = scanner.nextInt();

        double taxaJurosDecimal = taxaJuros / 100;

        double juros = capitalInicial * taxaJurosDecimal * tempoMeses;

        double montanteTotal = capitalInicial + juros;

        System.out.printf("Os juros acumulados ao final do período serão: R$%.2f\n", juros);
        System.out.printf("O montante total ao final do período será: R$%.2f\n", montanteTotal);

        scanner.close();
    }
}
