
package pak;

public class Students {
    
    private int id;
    private String name;
    private String phone;
    private String email;

    public Students() {
    }

    public Students(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student ID= " + id + ",\nStudent Name=" + name + ",\nStudent Phone=" + phone + ",\nStudent Email=" + email ;
    }

    
    
}
