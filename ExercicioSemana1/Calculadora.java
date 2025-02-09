package ExercicioSemana1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        char operador;

        System.out.println("Entre com o primeiro valor: ");
        num1 = scanner.nextInt();

        System.out.println("Entre com o segundo valor: ");
        num2 = scanner.nextInt();

        System.out.println("Entre com o operador( +, -, *, / ) ");
        operador = scanner.next().charAt(0);

        switch (operador){
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            default:
                System.out.println("Operador Invalido!");
        }
    }
}
