import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Ucitel ucitel = new Ucitel("Petr", "Svoboda");
    Student student1 = new Student("Jarda", "Zapomněl", LocalDate.of(1995, 10, 12), 1);
    Student student2 = new Student("Hanka", "Vytrhlá", LocalDate.of(1996, 10, 12), 2);



    SkolniTridaService trida2022 = new SkolniTridaService("EngetoJava", 2022, ucitel);
    trida2022.listStudentu.add(student1);
    trida2022.listStudentu.add(student2);

    //trida2022.listStudentu.forEach(System.out::println);
    //System.out.println(trida2022.pocetStudentu());
        System.out.println(trida2022);
        System.out.println(trida2022.vypisStudenty());

        //System.out.println(student1.upravID());

    }
}