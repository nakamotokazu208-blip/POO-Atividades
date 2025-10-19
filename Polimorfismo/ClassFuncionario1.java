public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public double calcularSalario() {
        return super.calcularSalario() + 500.00;
    }
}

public class Programador extends Funcionario {
    
    public Programador(String nome, String cpf) {
        super(nome, cpf);
    }

    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase + (salarioBase * 0.20);
    }
}
