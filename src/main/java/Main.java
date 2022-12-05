import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator simple = new SimpleCalculator();
        System.out.println(simple.Add(2,4));;
        System.out.println("Substract: "+ simple.substract(5,7));

        // Test Student
        ArrayList<Double> dsDiem = new ArrayList<Double>();
        dsDiem.add(8.00);
        dsDiem.add(8.50);
        dsDiem.add(7.50);
        ArrayList<Subject> dsMonHoc = new ArrayList<Subject>();
        dsMonHoc.add(Subject.Math);
        dsMonHoc.add(Subject.Physical);
        dsMonHoc.add(Subject.English);

        Student student = new Student("b186", "Tien", "Can Tho",dsDiem ,dsMonHoc);

        StudentService studentService = new StudentService(student);
        System.out.println("Diem trung binh: "+ studentService.getAverage());
    }
}
