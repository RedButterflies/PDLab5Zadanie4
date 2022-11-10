public class Main {
    public static void main(String[] args) {
        System.out.println("Komputer przenosny");
        KomputerPrzenosny komputerPrzenosny = new KomputerPrzenosny();
        komputerPrzenosny.informacjeOKomputerze();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Komputer - konstruktor 1.");
        Komputer komputer1= new Komputer();
        komputer1.informacjeOKomputerze();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Komputer - konstruktor 2.");
        Komputer komputer2 = new Komputer("Apple","iMac24","A1418","Apple M1","Apple M1","SSD");
        komputer2.informacjeOKomputerze();
    }
}