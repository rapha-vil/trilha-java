import java.util.Arrays;

public class ExemplosForLista {
    public static void main(String[] args) {
        String [] alunos = {"Rafaela", "Marina", "Joaquim", "Cleinton"};

        /*
        for(int x=0; x<alunos.length; x++){
            System.out.println("O indice de alunos é: " + x + "é" + alunos[x]);
        }*/

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
