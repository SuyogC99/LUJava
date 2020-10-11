package com.luassignment;

public class employee {
    String name;
    int age;
    String city;
    public void display(){
        System.out.println("The name is "+this.name);
        System.out.println("The age is "+this.age);
        System.out.println("The city is "+this.city);
    }
    public static void main(String[] args) {
        employee h=new employee();
        h.name = "Saurab";
        h.age = 23;
        h.city = "Chennai";
        h.display();
        employee h1=new employee();
        h1.name = "Suyog";
        h1.age = 20;
        h1.city = "Bengaluru";
        h1.display();
    }
}
