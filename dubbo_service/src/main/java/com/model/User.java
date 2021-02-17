package com.model;


public class User {

    private  String name;
    private  Long id;

    public  void  countOff(){
        System.out.println(name+id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public User( Long id,String name) {
        this.name = name;
        this.id = id;
    }

    public User() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age='" + id + '\'' + '}';
    }


    public String sayHello(){
        return " hello" ;
    }

}
