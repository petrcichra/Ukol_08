import java.time.LocalDate;

public class Student implements InterfaceStudent{

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

    @Override
    public void upravID() {
        String upraveneID;
        if (studentskeCislo > 10)
        {
            upraveneID = "00"+studentskeCislo;
        } else if (studentskeCislo > 9 && studentskeCislo < 99)
        {
            upraveneID = "0"+studentskeCislo;
        } else
        {
            upraveneID = String.valueOf(studentskeCislo);
        }
    }
}
