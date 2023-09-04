
package stu;

public class Student {
    
    public String name;
    public int age;
    public int id;

    public Student() {
    }

    
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", id=" + id + '}';
    }
    
    
}
