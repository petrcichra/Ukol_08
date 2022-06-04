import java.util.ArrayList;
import java.util.List;

public class SkolniTrida {

    private String nazevTridy;
    private int rocnik;
    private Ucitel tridniUcitel;
    List<Student> listStudentu = new ArrayList<>();

    public SkolniTrida(String nazevTridy, int rocnik, Ucitel tridniUcitel) {
        this.nazevTridy = nazevTridy;
        this.rocnik = rocnik;
        this.tridniUcitel = tridniUcitel;
    }

    public String getNazevTridy() {
        return nazevTridy;
    }

    public void setNazevTridy(String nazevTridy) {
        this.nazevTridy = nazevTridy;
    }

    public int getRocnik() {
        return rocnik;
    }

    public void setRocnik(int rocnik) {
        this.rocnik = rocnik;
    }

    public Ucitel getTridniUcitel() {
        return tridniUcitel;
    }

    public void setTridniUcitel(Ucitel tridniUcitel) {
        this.tridniUcitel = tridniUcitel;
    }

    @Override
    public String toString() {
        return "##########################################"+ "\n" +
                "Třída: " + nazevTridy + " (ročník: "+rocnik+")" + "\n" +
                "Třídní učitel: " + tridniUcitel.getPrijmeni() + ", " + tridniUcitel.getJmeno();
    }
}
