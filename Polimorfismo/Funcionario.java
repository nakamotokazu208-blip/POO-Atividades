public class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public double calcularSalario() {
        return 1500.00; 
    }

    public String getNome() {
        return nome;
    }
}
