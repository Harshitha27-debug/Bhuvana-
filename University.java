class University{
public String universityName = "Amrita Vishwa Vidyapeetham";
//beginning of inner class 
class Department{
public String deptName ;
public int deptCode;
public void deptDetails(String deptName, int deptCode){
this.deptName = deptName;
this.deptCode = deptCode;
System.out.println("--------Department Details---------");
System.out.println("Department name : " + deptName);
System.out.println("Department code : " + deptCode);
}
}
class Student{
public String studentName;
public int rollnumber;
public void details(String studentName , int rollnumber){
this.studentName = studentName;
this.rollnumber=rollnumber;
System.out.println("-------Student Details-------");
System.out.println("Student name : " + studentName);
System.out.println("Student rollnumber : " +rollnumber);
}
}
public static void main(String[] args){
University u = new University();
System.out.println(u.universityName);
University.Department dep = u.new Department();
dep.deptDetails("Computer Science and Engineering",100);
University.Student stu = u.new Student();
stu.details("Bhuvana Harshithaa",24027);
}
}
