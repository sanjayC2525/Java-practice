class Student{
    private String name;
    private int rollNo;
    private int marks;

    Student(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks provided. Setting marks to 0.");
            this.marks = 0;
        }
    }

    int marksValidation(){
        if(marks > 0 && marks < 100){
            return marks;
        } else if (marks < 0){
            return marks = 0;
        }
        else{
            return marksValidation();
        }
    }
    void display(){
        System.out.println("Student Name: " + name +
                           " Roll No: "+rollNo +
                           " Marks: "+ marks);
    }
    boolean isPassed(){
        return marks >= 40;
    }
    String getGrade(){
        if(marks > 80){
            return "A";
        }
        else if(marks >=60){
            return "B";
        }
        else  if(marks >= 40){
            return "C";
        }
        else{
            return "F";
        }
    }
    public static void main(String[] args){
        Student s1 = new Student("Sanjay",1001,90);
        Student s2 = new Student("bob",1002,35);

        s1.display();
        System.out.println("Passed: "+ s1.isPassed());
        System.out.println("Grade: "+ s1.getGrade());
        s2.display();
        System.out.println("Passed: "+ s2.isPassed());
        System.out.println("Grade: "+ s2.getGrade());
    }
}