package basics;

public class Problem12 {
    public static void main(String[] args) {
        Student s1 = new Student('A',90);
        Student s2 = new Student('B',85 );

        s1.Display();
        s2.Display();

    }
}
class Student {
    char name;
    int marks;

    Student(char n, int m) {
        this.name = n;
        this.marks = m;
    }

     void Display() {
        System.out.println("Name: " + name + " Marks: " + marks);
    }
}