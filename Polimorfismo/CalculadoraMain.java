public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultadoInt = calc.somar(5, 10);
        System.out.println("Soma de 2 inteiros (5, 10): " + resultadoInt); 

        int resultadoTresInt = calc.somar(1, 2, 3);
        System.out.println("Soma de 3 inteiros (1, 2, 3): " + resultadoTresInt); 

        double resultadoDouble = calc.somar(10.5, 20.3);
        System.out.println("Soma de 2 doubles (10.5, 20.3): " + resultadoDouble); 
    }
}
