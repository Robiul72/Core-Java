package students;

public class StudentInformation<Student, StudentsAge, StudentsMother, StudentsFather> {

    Student name;
    StudentsAge age;
    StudentsMother motherName;
    StudentsFather fatherName;

    public StudentInformation(Student name, StudentsAge age, StudentsMother motherName, StudentsFather fatherName) {
        
        this.name = name;
        this.age = age;
        this.motherName = motherName;
        this.fatherName = fatherName;
    }

    public void information() {
        System.out.println("Student Name        : " + name + "\nStudent Age         : " + age+
                "\nStudent Mother Name : " + motherName + "\nStudent Father Name : "+fatherName );
    }
    
    public void information_1(){
    
        System.out.println("Student Name        : " + name + "\nStudent Mother Name : "
                + motherName + "\nStudent Father Name : "+ fatherName);
    }

}
