/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class Student {
    
    private int id;
    private String firstName;
    private String lastName;
    private String fatherFirstName;
    private String fatherLastName;
    private String motherFirstName;
    private String motherLastName;
    private String gender;
    private String dateOfBirth;
    private String nid;
    private String contact;
    private String email;
    private String entrtDate;
    private String address;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String fatherFirstName, String fatherLastName, String motherFirstName, String motherLastName, String gender, String dateOfBirth, String nid, String contact, String email, String entrtDate, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherFirstName = fatherFirstName;
        this.fatherLastName = fatherLastName;
        this.motherFirstName = motherFirstName;
        this.motherLastName = motherLastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.nid = nid;
        this.contact = contact;
        this.email = email;
        this.entrtDate = entrtDate;
        this.address = address;
    }

    public Student(String firstName, String lastName, String fatherFirstName, String fatherLastName, String motherFirstName, String motherLastName, String gender, String dateOfBirth, String nid, String contact, String email, String entrtDate, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherFirstName = fatherFirstName;
        this.fatherLastName = fatherLastName;
        this.motherFirstName = motherFirstName;
        this.motherLastName = motherLastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.nid = nid;
        this.contact = contact;
        this.email = email;
        this.entrtDate = entrtDate;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEntrtDate() {
        return entrtDate;
    }

    public void setEntrtDate(String entrtDate) {
        this.entrtDate = entrtDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", fatherFirstName=" + fatherFirstName + ", fatherLastName=" + fatherLastName + ", motherFirstName=" + motherFirstName + ", motherLastName=" + motherLastName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", nid=" + nid + ", contact=" + contact + ", email=" + email + ", entrtDate=" + entrtDate + ", address=" + address + '}';
    }
    

    
    
}
