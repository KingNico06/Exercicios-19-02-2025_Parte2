package exercicios;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();


        double mediaFinal = (nota1 + nota2 + nota3) / 3;


        System.out.printf("A média final do aluno é %.1f\n", mediaFinal);

        scanner.close();
    }
}
