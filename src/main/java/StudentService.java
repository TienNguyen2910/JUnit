public class StudentService implements IStudentService{
    private Student student;
    public StudentService(Student student){
        this.student = student;
    }
    @Override
    public double getAverage() {
        int numMonHoc = student.getDsMonHoc().size();
        double diemTrungBinh = 0;
        for (int i = 0; i < student.getDsDiem().size(); i++){
            diemTrungBinh += student.getDsDiem().get(i);
        }

        return diemTrungBinh / numMonHoc;
    }
}
