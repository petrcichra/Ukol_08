import java.time.LocalDate;

public class Student {

    private String jmeno;
    private String prijmeni;
    private LocalDate rokNarozeni;
    private int studentskeCislo;

    public Student(String jmeno, String prijmeni, LocalDate rokNarozeni, int studentskeCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
        this.studentskeCislo = studentskeCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getRokNarozeni() {
        return rokNarozeni;
    }

    public void setRokNarozeni(LocalDate rokNarozeni) {
        this.rokNarozeni = rokNarozeni;
    }

    public int getStudentskeCislo() {
        return studentskeCislo;
    }

    public void setStudentskeCislo(int studentskeCislo) {
        this.studentskeCislo = studentskeCislo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", rokNarozeni=" + rokNarozeni +
                ", studentskeCislo=" + studentskeCislo +
                '}';
    }
}