public class Student{
    private  String studentId;
    private String name;
    private String grade;
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    } 
    public void setStudentId(String studentId){
    this.studentId = studentId;
    }
    public String getStudentId(){
        return studentId;
    }
    public void addGrade(String grade){
    this.grade = grade;
    System.out.println("Grade of the student is : " +grade);
    }
}
    class main2{
        public static void main(String[] args) {
        Student b = new Student();
        b.setname("Bhuvana Harshithaa");
        System.out.println("Name : "+b.getname());
        b.setStudentId("24027");
        System.out.println("Student ID : "+b.getStudentId());
        b.addGrade("A");
    }
    }
