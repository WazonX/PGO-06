public class ZdarzenieZoo {
    public static void main(String[] args) {
        Zwierze[] zwierze = {
                new Gad("Wąż", 2, true, "Syczy","Pełza", "Las"),
                new Ptak("Pingwin", 21, false, "Ćwierka", "Ślizga", "Morza i nadbrzesza"),
                new Ssak("Lew", 5, true, "Ryczy", "Biegnie", "Sawanna")
        };
        for (Zwierze z : zwierze) {
            System.out.println("\n----------------------------\n");
            z.wyswietlInformacje();
            System.out.println("Zwierze wydaje dźwięk: "+ z.wydajDzwiek());
            System.out.println("Zwierze porusza się: "+z.poruszajSie());
            System.out.println("Występje : "+z.srodowiskoNaturalne());
        }
        System.out.println("\n----------------------------\n");
    }
}
