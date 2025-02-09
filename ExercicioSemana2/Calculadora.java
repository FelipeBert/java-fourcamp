package ExercicioSemana2;

public class Calculadora {

    public double calcular(double num1, double num2, char operador){
        switch (operador){
            case '+':
                return somar(num1, num2);
            case '-':
                return subtrair(num1, num2);
            case '*':
                return multiplicar(num1, num2);
            case '/':
                return dividir(num1, num2);
            default:
                System.out.println("Operador Invalido!");
        }
        return 0.0;
    }

    private double somar(double num1, double num2){
        return num1 + num2;
    }

    private double subtrair(double num1, double num2){
        return num1 - num2;
    }

    private double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    private double dividir(double num1, double num2){
        return num1 / num2;
    }
}
