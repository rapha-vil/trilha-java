
public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(11);
        System.out.println("Novo Canal: " + smartTv.canal );
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume:" + smartTv.volume);



    }
}