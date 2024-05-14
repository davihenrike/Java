public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume= 25;

    public void mudardeCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal () {
        canal++;
    }

    public void dimuirCanal () {
        canal--;
    }

    public void diminuirVolume() 
        {volume--; /*ou volume=volume -1 */
            System.out.println("Diminuindo o volume para:" + volume);} 

    public void aumentarVolume() 
        {volume++; /*ou volume=volume +1 */
            System.out.println("Aumentando o volume para:" + volume);} 

    public void ligar ()
        {ligada = true;}

    public void desligar ()
        {ligada = false;}
}
