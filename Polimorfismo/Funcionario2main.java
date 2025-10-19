public class Main {
    public static void main(String[] args) {
        double salarioBaseComum = 3000.00;

        Funcionario dev = new Desenvolvedor(salarioBaseComum);
        Funcionario sup = new Suporte(salarioBaseComum);

        System.out.printf("Salário Base: R$ %.2f\n\n", salarioBaseComum);

        System.out.printf("Desenvolvedor (Bônus 10%%): R$ %.2f\n", 
                          dev.calcularSalarioFinal()); 

        System.out.printf("Suporte (Ajuda de Custo R$ 200,00): R$ %.2f\n", 
                          sup.calcularSalarioFinal());
    }
}
