package ukolInterface;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Ucitel ucitel = new Ucitel("Petr", "Svoboda");
        Student student1 = new Student("Jarda", "Zapomněl", LocalDate.of(1995, 10, 12), 1);
        Student student2 = new Student("Hanka", "Vytrhlá", LocalDate.of(1996, 10, 12), 2);
        Student student3 = new Student("Jitka", "Malá", LocalDate.of(1996, 10, 12), 3);
        Student student4 = new Student("Radka", "Měkká", LocalDate.of(1996, 10, 12), 40);
        Student student5 = new Student("Honza", "Král", LocalDate.of(1996, 10, 12), 11);
        SkolniTrida trida = new SkolniTrida("EngetoTrida", 2022, ucitel);

        trida.listStudentu.add(student1);
        trida.listStudentu.add(student2);
        trida.listStudentu.add(student3);
        trida.listStudentu.add(student4);
        trida.listStudentu.add(student5);

        trida.printClass(trida);
        trida.printClassTwo(trida);
        trida.printClassThree(trida);


    }


}
