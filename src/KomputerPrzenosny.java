import java.util.Scanner;

public class KomputerPrzenosny extends Komputer {
    private double waga;
    private String bateria;
    private String bluetooth;

    @Override
    public void informacjeOKomputerze() {
        System.out.println("INFROMACJE O KOMPUTERZE PRZENOSNYM");
        super.informacjeOKomputerze();
        System.out.println("Waga: "+waga);
        System.out.println("Bateria: "+bateria);
        System.out.println("Bluetooth: " + bluetooth);
    }

    public KomputerPrzenosny() {
        System.out.println("Wprowadz wage komputera w kilogramach: ");
        Scanner swaga= new Scanner(System.in);
        this.waga = swaga.nextDouble();
        if(waga<1.2 || waga>3.5)
        {
            System.out.println("Wprowadzono niepoprawna wage komputera, sprobuj ponownie i  wprowadz wage z zakresu od 1,2kg do 3,5kg ");
        }else {
            System.out.println("Wprowadz nazwe baterii: ");
            Scanner sbateria = new Scanner(System.in);
            this.bateria = sbateria.next().toString();
            System.out.println("Czy urzadzenie posiada Bluetooth? (Wprowadz 1 jesli tak, 0 jesli nie)");
            Scanner sbluetooth = new Scanner(System.in);
            int x=sbluetooth.nextInt();
            if(x==1)
            {
                this.bluetooth= "t";
            }
            else if(x==0)
            {
                this.bluetooth="n";
            }
            else {
                System.out.println("Wprowadzono niepoprawna wartosc, sprobuj ponownie");
            }
        }
    }
}
