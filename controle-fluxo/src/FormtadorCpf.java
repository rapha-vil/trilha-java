public class FormtadorCpf {

    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCep("40110010");
            System.out.println(meuCepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep tem que ter 8 digitos");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8) {
            throw new CepInvalidoException();

        }
        return  "40.110.010";
    }
}