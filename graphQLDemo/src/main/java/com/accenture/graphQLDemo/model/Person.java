package com.accenture.graphQLDemo.model;

import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "pID")
    public int pID;
    public String first_name;
    public String last_name;
    public String email;
    public String mob_num;



    public String interest;

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMob_num() {
        return mob_num;
    }

    public void setMob_num(String mob_num) {
        this.mob_num = mob_num;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }



    public Person(int pID, String first_name, String last_name, String email, String mob_num, String interest) {
        this.pID = pID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.mob_num = mob_num;
        this.interest = interest;
    }

    public Person() {
    }

}
