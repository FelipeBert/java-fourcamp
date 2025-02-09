package ExercicioSemana2;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcular(10, 5, '+'));
        System.out.println(calculadora.calcular(10, 5, '-'));
        System.out.println(calculadora.calcular(10, 5, '*'));
        System.out.println(calculadora.calcular(10, 5, '/'));
    }
}
