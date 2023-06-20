package com.example.RestCrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    public User() {

    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", first_name='" + this.firstName + '\'' + ", email='" + this.email + '\'' + ", lastName='" + this.lastName + '\'' + '}';
    }
}
