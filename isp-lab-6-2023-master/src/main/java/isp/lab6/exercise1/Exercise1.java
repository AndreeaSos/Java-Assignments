package isp.lab6.exercise1;

public class Exercise1 {
    public static void main(String[] args) {

        Student student=new Student("Dan");
        Catalog catalog=new Catalog();
        catalog.adaugaNote("ALGA",5);
        catalog.adaugaNote("MSI",8);
        catalog.adaugaNote("PSN",10);
        catalog.adaugaNote("MP",8);
        catalog.adaugaNote("TS",7);
        student.setNote(catalog);

        Student student2=new Student("Maria");
        Catalog catalog2 =new Catalog();
        catalog2.adaugaNote("ALGA",7);
        catalog2.adaugaNote("MSI",6);
        catalog2.adaugaNote("PSN",9);
        catalog2.adaugaNote("MP",6);
        catalog2.adaugaNote("TS",10);
        student2.setNote(catalog2);

        Classroom classroom=new Classroom();
        classroom.addStudent(student);
        classroom.addStudent(student2);

        for (Student s: classroom.getStudentList()) {
            System.out.println("media studentului "+s.getNume()+" este "+ s.getNote().calculeazaMedia());

        }



    }
}
