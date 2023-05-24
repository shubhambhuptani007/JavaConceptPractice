package org.example.JavaConcepts;

public class StaticExample {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name="Shubham";
        student1.rollNo=04;
        student1.standard=10;
        Student student2 = new Student();
        student2.name="Harshil";
        student2.rollNo=05;
        student2.standard=11;
        student2.schoolName="BHASKAR";
        System.out.println(student1);
        System.out.println(student2);
    }
    static class Student{
        int rollNo;
        int standard;
        String name;
        static String schoolName;

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", standard=" + standard +
                    ", name='" + name + '\'' +
                    ", schoolName='" + schoolName + '\'' +
                    '}';
        }
    }
}
