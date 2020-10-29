package com.company;

public class Main {

    public static void main(String[] args) {
        //Box 1 object
        Box box1=new Box();
        box1.width=14.5;
        box1.heigth=12.5;
        box1.material="wooden";
        System.out.println("Width: " + box1.width);
        System.out.println("Heigth: " + box1.heigth);
        System.out.println("Material: " + box1.material);

        //Box 2 object
        Box box2=new Box();
        box2.width=18.3;
        box2.heigth=23.9;
        box2.material="cast-iron";
        System.out.println("Width: " + box2.width);
        System.out.println("Heigth: " + box2.heigth);
        System.out.println("Material: " + box2.material);
        System.out.println("----------------------------------------------------------------------");


        //Apple 1 object
       Apple apple1= new Apple();
        apple1.color="yellow";
        apple1.grade="Ainur";
        apple1.sour="No";
        apple1.price=7;
        System.out.println("color : " + apple1.color);
        System.out.println("grade : " + apple1.grade);
        System.out.println("sour : " + apple1.sour);
        System.out.println("price : " + apple1.price);
        //---------------------------------------------------

        //Apple 2 object
        Apple apple2= new Apple();
        apple2.color="red";
        apple2.grade="Eda";
        apple2.sour="No";
        apple2.price=9;
        System.out.println("color : " + apple2.color);
        System.out.println("grade : " + apple2.grade);
        System.out.println("sour : " + apple2.sour);
        System.out.println("price : " + apple2.price);
        System.out.println("----------------------------------------------------------------------");


        //Apple 3 object
        Apple apple3= new Apple();
        apple3.color="green";
        apple3.grade="Manted";
        apple3.sour="yes";
        apple3.price=4;
        System.out.println("color: " + apple3.color);
        System.out.println("grade : " + apple3.grade);
        System.out.println("sour : " + apple3.sour);
        System.out.println("price : " + apple3.price);
        System.out.println("----------------------------------------------------------------------");

        //Car 1 object
        Car car1=new Car();
        car1.color="dark-blue";
        car1.Name="Audi";
        car1.Model="Citycaver";
        car1.year=2020;
        car1.price=20000;
        System.out.println("color : " + car1.color);
        System.out.println("Name : " + car1.Name);
        System.out.println("Model : " + car1.Model);
        System.out.println("year : " + car1.year);
        System.out.println("price : " + car1.price);
        System.out.println("----------------------------------------------------------------------");

        //Car 2 object
        Car car2=new Car();
        car2.color="white";
        car2.Name="Lada";
        car2.Model="sidan";
        car2.year=1999;
        car2.price=3000;
        System.out.println("color : " + car2.color);
        System.out.println("Name : " + car2.Name);
        System.out.println("Model : " + car2.Model);
        System.out.println("year : " + car2.year);
        System.out.println("price : " + car2.price);
        System.out.println("----------------------------------------------------------------------");

        //Car 3 object
        Car car3=new Car();
        car3.color="gray";
        car3.Name="BMW";
        car3.Model="X3";
        car3.year=2006;
        car3.price=12500;
        System.out.println("color : " + car3.color);
        System.out.println("Name : " + car3.Name);
        System.out.println("Model : " + car3.Model);
        System.out.println("year : " + car3.year);
        System.out.println("price : " + car3.price);
        System.out.println("----------------------------------------------------------------------");

        //Car 4 object
        Car car4=new Car();
        car4.color="only-white";
        car4.Name="Ravon";
        car4.Model="Nexia-R3";
        car4.year=2017;
        car4.price=6000;
        System.out.println("color : " + car4.color);
        System.out.println("Name : " + car4.Name);
        System.out.println("Model : " + car4.Model);
        System.out.println("year : " + car4.year);
        System.out.println("price : " + car4.price);
    }

}

 class Box{
    double width;
    double heigth;
    String material;
}

class Apple{
    String color;
    String grade;
    String  sour;
    int price;
}
class Car{
    String Name;
    String Model;
    String color;
    short price;
    short year;
}