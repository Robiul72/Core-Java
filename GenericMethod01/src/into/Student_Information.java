package into;
public class Student_Information < student_id, student_name, student_age > {

    student_id id;
    student_name name;
    student_age age;

    public Student_Information(student_id id, student_name name, student_age age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student_Information\n" + "Student Id   = " + id + "\nStudent Name = " + name + "\nStudent Age  = " + age ;
    }

}
