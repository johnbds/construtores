
package main;
import escola.Aluno;

public class TestaAluno {
    public static void main(String [] args){
        Aluno a1 = new Aluno("John", "007");
        //a1.setNome("John");
        //a1.setMatricula("007");
        
        System.out.println(a1.getNome());
    }
}
