package ukolInterface;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.util.Scanner;

public class TridaService implements TridaInterface{


    public static final int STATUS_CANNOT_READ_FILE = 1;

    @Override
    public void printClass(SkolniTrida trida) {
        System.out.println(
                "##########################################"+ "\n" +
                "Třída: " + trida.getNazevTridy() + " (ročník: "+trida.getRocnik()+")" + "\n" +
                "Třídní učitel: " + trida.getTridniUcitel().getJmeno() + ", " + trida.getTridniUcitel().getPrijmeni() + "\n" +
                "Počet studentů: " + trida.listStudentu.size() + "\n" + "\n" +
                "##########################################"
        );

        int pos = 0;
        for (Student student : trida.listStudentu) {
            System.out.println("# " + pos + " # " + student.upravID() + " - " + student.getJmeno() + " " + student.getPrijmeni() + " ("+student.getRokNarozeni().getYear()+")" ) ;
            pos++;
        }

    }

    @Override
    public void printClassTwo(SkolniTrida trida) {
        System.out.println(
                trida.getNazevTridy() + trida.getTridniUcitel().getJmeno() + ", " + trida.getTridniUcitel().getPrijmeni()
        );

        for (Student student : trida.listStudentu) {
            System.out.println(student.upravID() + ", " + student.getPrijmeni() + student.getJmeno());
        }
    }

     @Override
        public void printClassThree(SkolniTrida trida) {

         String filename = "trida.csv";
         String delimiter = ";";



         System.out.println(
                 "Třída: " + trida.getNazevTridy() + "\n" +
                 "Třídní učitel: " + trida.getTridniUcitel().getJmeno() + ", " + trida.getTridniUcitel().getPrijmeni() + "\n" +
                 "Seznam studentů : " + "\n"
         );

         for (Student student : trida.listStudentu) {
             System.out.println("ID: " + student.upravID() + " Jméno: " + student.getPrijmeni() + " Rok narození: " +  student.getRokNarozeni().getYear());
         }


         // export do souboru
         try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
             for (Student student : trida.listStudentu) {
                 writer.println(
                         student.upravID()
                         +delimiter
                         +student.getJmeno()
                         +delimiter
                         +student.getPrijmeni()
                         +delimiter
                         +student.getRokNarozeni().getYear()
                 );
             }
         } catch (IOException e) {
             System.err.println(
                     "Chyba při čtení souboru "+ filename
                             +":\n"+e.getLocalizedMessage()
                             +":\n"+e.getStackTrace());
             System.exit(STATUS_CANNOT_READ_FILE);
         }





        }


}
