package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {

    }



    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar candidato com contra proposta");
        } else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
