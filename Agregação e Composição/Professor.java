public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Turma {
    private int codigo;
    private Professor professor; 

    public Turma(int codigo) {
        this.codigo = codigo;
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }
  
    public void resumo() {
        String nomeProfessor = (professor != null) ? professor.getNome() : "Nenhum professor associado";
        System.out.println("Turma Código: " + codigo);
        System.out.println("Professor: " + nomeProfessor);
    }
}

public class Main {
    public static void main(String[] args) {
        Professor profA = new Professor("Maria de Souza");
        
        Turma turmaA = new Turma(101);
        
        turmaA.setProfessor(profA);
        System.out.println("--- Resumo Inicial ---");
        turmaA.resumo(); 

        Professor profB = new Professor("João da Silva");
        turmaA.setProfessor(profB); 
        
        System.out.println("\n--- Resumo Após Troca ---");
        turmaA.resumo(); 
    }
}
