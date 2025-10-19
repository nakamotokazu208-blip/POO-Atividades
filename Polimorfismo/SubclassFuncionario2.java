public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return this.salarioBase * 1.10;
    }
}

public class Suporte extends Funcionario {

    public Suporte(double salarioBase) {
        super(salarioBase);
    }

    public double calcularSalarioFinal() {
        return this.salarioBase + 200.00;
    }
}
