public class Usuario {
    public static void main(String[] args) throws Exception {
        
SmartTv smartTv = new SmartTv();

smartTv.diminuirVolume();
smartTv.diminuirVolume();
smartTv.diminuirVolume();
smartTv.aumentarVolume();

System.out.println("CANAL ATUAL ? : " +smartTv.canal);
smartTv.mudarCanal(10);
System.out.println("CANAL ATUAL ? : " +smartTv.canal);


System.out.println("VOLUME ATUAL ? : " +smartTv.volume);


System.out.println("TV LIGADA ? " +smartTv.ligada);
System.out.println("CANAL ATUAL ? : " +smartTv.canal);
System.out.println("VOLUME ATUAL ? : " +smartTv.volume);

smartTv.ligar();
System.out.println("Novo Status - TV LIGADA ? " +smartTv.ligada);

smartTv.desligar();
System.out.println("Novo Status - TV LIGADA ? " +smartTv.ligada);

    }
}
