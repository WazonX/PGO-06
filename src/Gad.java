public class Gad extends Zwierze{

    public Gad(String nazwa, int wiek, boolean trujacy, String dzwiek, String porusz, String srodowisko) {
        super(nazwa, wiek);
        this.trujacy = trujacy;
        this.dzwiek = dzwiek;
        this.porusz = porusz;
        this.srodowisko = srodowisko;
    }

    protected boolean trujacy;
    protected String dzwiek, porusz, srodowisko;


    @Override
    public void wyswietlInformacje() {
        System.out.println("Nazwa zwierzęcia: "+this.nazwa+"\nWiek: "+this.wiek+"\nCzy trujący: "+ (this.trujacy ? "Tak" : "Nie"));
    }

    @Override
    public String srodowiskoNaturalne() {
        return this.srodowisko;
    }

    @Override
    public String wydajDzwiek() {
        return this.dzwiek;
    }

    @Override
    public String poruszajSie() {
        return this.porusz;
    }
}
