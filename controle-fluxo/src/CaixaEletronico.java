
public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double saque = 10.0;

        if(saque < saldo){
            saldo = saldo - saque;

            System.out.println("Seu saldo atualizado é: " + "R$" + saldo);
        }else {
            System.out.println("O valor do saque é maior que seu saldo");
        }


    }
}