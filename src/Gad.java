public class Gad extends Zwierze{

    public Gad(String nazwa, int wiek, boolean trujacy, String dzwiek, String porusz, String srodowisko) {
        super(nazwa, wiek,dzwiek, porusz, srodowisko);
        this.trujacy = trujacy;
    }

    public boolean isTrujacy() {
        return trujacy;
    }

    public void setTrujacy(boolean trujacy) {
        this.trujacy = trujacy;
    }

    protected boolean trujacy;

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
