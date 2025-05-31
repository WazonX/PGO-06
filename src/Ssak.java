public class Ssak extends Zwierze{
    public Ssak(String nazwa, int wiek, boolean czyPlywa, String dzwiek, String porusz, String srodowisko) {
        super(nazwa, wiek);
        this.czyPlywa = czyPlywa;
        this.dzwiek = dzwiek;
        this.porusz = porusz;
        this.srodowisko = srodowisko;
    }

    protected boolean czyPlywa;
    protected String dzwiek, porusz, srodowisko;

    public boolean isCzyPlywa() {
        return czyPlywa;
    }

    public void setCzyPlywa(boolean czyPlywa) {
        this.czyPlywa = czyPlywa;
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

    @Override
    public void wyswietlInformacje() {
        System.out.println("Nazwa zwierzęcia: "+this.nazwa+"\nWiek: "+this.wiek+"\nCzy pływa: "+ (this.czyPlywa ? "Tak" : "Nie"));
    }
}
