package exercicios;

import java.util.Scanner;

public class ConversaoTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();


        double fahrenheit = (celsius * 9 / 5) + 32;


        double kelvin = celsius + 273.15;


        System.out.printf("A temperatura em Fahrenheit é: %.2f°F\n", fahrenheit);
        System.out.printf("A temperatura em Kelvin é: %.2fK\n", kelvin);

        scanner.close();
    }
}

