public abstract class Funcionario { 
    protected double salarioBase; [cite: 393]

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract double calcularSalarioFinal(); 

    public double getSalarioBase() {
        return salarioBase;
    }
}
