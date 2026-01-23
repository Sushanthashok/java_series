package Suskkoo;

class Student {
    String name;
    int rollNo;
    int marks;

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Marks  : " + marks);
    }
}

public class classorobj {
    public static void main(String[] args) {
        Student s1 = new Student();

        // assigning values
        s1.name = "Sushanth";
        s1.rollNo = 162;
        s1.marks = 78;

        // displaying details
        s1.display();
    }
}

