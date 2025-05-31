public class Ptak extends Zwierze{
    public Ptak(String nazwa, int wiek, boolean czyLata, String dzwiek, String porusz, String srodowisko) {
        super(nazwa, wiek, dzwiek, porusz, srodowisko);
        this.czyLata = czyLata;
    }
    protected boolean czyLata;

    public boolean isCzyLata() {
        return czyLata;
    }

    public void setCzyLata(boolean czyLata) {
        this.czyLata = czyLata;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Nazwa zwierzęcia: "+this.nazwa+"\nWiek: "+this.wiek+"\nCzy lata: "+ (this.czyLata ? "Tak" : "Nie"));
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
