import java.util.Scanner;

public class Komputer {
    private String producent;
    private String model;
    private String plytaGlowna;
    private String procesor;
    private String kartaGraficzna;
    private String dyskTwardy;

    public Komputer() {
        System.out.println("Wprowadz dane o komputerze");
        System.out.println("Wprowadz nazwe producenta: ");
        Scanner sproducent = new Scanner(System.in);
        this.producent = sproducent.next().toString();
        System.out.println("Wprowadz nazwe modelu: ");
        Scanner smodel = new Scanner(System.in);
        this.model = smodel.next().toString();
        System.out.println("Wprowadz nazwe plyty glownej: ");
        Scanner splytaGlowna = new Scanner(System.in);
        this.plytaGlowna = splytaGlowna.next().toString();
        System.out.println("Wprowadz nazwe procesora: ");
        Scanner sprocesor= new Scanner(System.in);
        this.procesor = sprocesor.next().toString();
        System.out.println("Wprowadz nazwe karty graficznej: ");
        Scanner skartaGraficzna = new Scanner(System.in);
        this.kartaGraficzna = skartaGraficzna.next().toString();
        System.out.println("Wprowadz nazwe dysku twardego: ");
        Scanner sdyskTwardy= new Scanner(System.in);
        this.dyskTwardy = sdyskTwardy.next().toString();
    }

    public Komputer(String producent, String model, String plytaGlowna, String procesor, String kartaGraficzna, String dyskTwardy) {
        this.producent = producent;
        this.model = model;
        this.plytaGlowna = plytaGlowna;
        this.procesor = procesor;
        this.kartaGraficzna = kartaGraficzna;
        this.dyskTwardy = dyskTwardy;
    }
    public void informacjeOKomputerze()
    {
        System.out.println("INFORMACJE O KOMPUTERZE");
        System.out.println("Producent: "+producent);
        System.out.println("Model: "+model);
        System.out.println("Plyta glowna: "+plytaGlowna);
        System.out.println("Procesor: "+procesor);
        System.out.println("Karta graficzna: "+kartaGraficzna);
        System.out.println("Dysk twardy: "+dyskTwardy);

    }

}
