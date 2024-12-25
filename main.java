class Student {
    int rollNo;
    String name;
    int marks;
}

class Main {
    public static void main(String a[]) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name="ABC";
        s1.marks=89;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name="EFG";
        s2.marks=79;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name="PQR";
        s3.marks=89;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(Student student : students) {
            System.out.println(student.name+" : "+student.marks);
        }
    }
}