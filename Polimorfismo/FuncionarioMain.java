public class Main {
    public static void main(String[] args) {
        Funcionario[] listaDePagamento = new Funcionario[2];

        listaDePagamento[0] = new Gerente("João Gerente", "111.111.111-11");
        listaDePagamento[1] = new Programador("Maria Programadora", "222.222.222-22");

        System.out.println("Demonstração do Polimorfismo Dinâmico:");
        for (Funcionario f : listaDePagamento) {
            double salario = f.calcularSalario();
            System.out.printf("Salário de %s (%s): R$ %.2f\n", 
                                f.getNome(), 
                                f.getClass().getSimpleName(), 
                                salario);
        }
    }
}
