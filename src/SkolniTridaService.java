public class SkolniTridaService extends SkolniTrida {


    public SkolniTridaService(String nazevTridy, int rocnik, Ucitel tridniUcitel) {
        super(nazevTridy, rocnik, tridniUcitel);
    }


    // počet studentů v listu
    public String pocetStudentu ()
    {
        return "Počet studentů: " + listStudentu.size();
    }

    public String vypisStudenty()
    {
        int radek = 1;
        System.out.println("\n" + "##########################################");
        for (Student student : listStudentu)
        {
            System.out.println(
                    "# " + radek + " # "
                    + student.upravID() + " - "
                    + student.getJmeno() + " " + student.getPrijmeni()
                    + " (" + student.getRokNarozeni() + ")"
            );

        }
        return null;
    }


}
