import java.util.ArrayList;

public class Student {
    private String maSV, name, address;
    private ArrayList<Double> dsDiem = new ArrayList<Double>();
    private ArrayList<Subject> dsMonHoc = new ArrayList<Subject>();

    public Student(String maSV, String name, String address, ArrayList<Double> dsDiem, ArrayList<Subject> dsMonHoc){
        this.maSV = maSV;
        this.name = name;
        this.address = address;
        for (var diem: dsDiem) {
            this.dsDiem.add(diem);
        }
        for (var monHoc: dsMonHoc) {
            this.dsMonHoc.add(monHoc);
        }
    }

    public ArrayList<Double> getDsDiem(){
        return dsDiem;
    }
    public ArrayList<Subject> getDsMonHoc(){
        return dsMonHoc;
    }
}
