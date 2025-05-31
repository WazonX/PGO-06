public abstract class Zwierze {
    protected String nazwa,dzwiek,porusz, srodowisko;
    protected int wiek;

    public Zwierze(String nazwa, int wiek, String dzwiek, String porusz, String srodowisko) {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.porusz = porusz;
        this.dzwiek = dzwiek;
        this.srodowisko = srodowisko;
    }

    public String getDzwiek() {
        return dzwiek;
    }

    public void setDzwiek(String dzwiek) {
        this.dzwiek = dzwiek;
    }

    public String getPorusz() {
        return porusz;
    }

    public void setPorusz(String porusz) {
        this.porusz = porusz;
    }

    public String getSrodowisko() {
        return srodowisko;
    }

    public void setSrodowisko(String srodowisko) {
        this.srodowisko = srodowisko;
    }

    public abstract String wydajDzwiek();

    public abstract String poruszajSie();

    public abstract String srodowiskoNaturalne();

    public void wyswietlInformacje(){
        System.out.println("Nazwa zwierzęcia: "+this.nazwa+"\nWiek: "+this.wiek);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
