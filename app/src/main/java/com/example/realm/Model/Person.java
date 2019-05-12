package com.example.realm.Model;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;

public class Person extends RealmObject {


    @PrimaryKey
    private int id;
    //String name;
    //String surname;
    String age;
    String gender;
    @Index
    String fullname;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    // public String getSurname() {
    //     return surname;
    // }

    //  public void setSurname(String surname) {
    //     this.surname = surname;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {

        return  "\n"
                +"ID: "+ id + "\n"
                +"Nombre Completo: " + fullname + "\n"
                //   +"Nombre: " + name + "\n"
                //   +"Apellido: " + surname + "\n"
                +"Edad: " + age+ "\n"
                +"Genero: " + gender + "\n";
    }
}
