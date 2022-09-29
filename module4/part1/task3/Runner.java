package module4.part1.task3;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        int n = 10;
        int m = 5;
        Student[] students = new Student[n];

        students[0] = new Student("Nibler", "N.", "G-1");
        students[1] = new Student("Bender", "B.R.", "G-1");
        students[2] = new Student("Fry", "F.J.", "G-2");
        students[3] = new Student("Turanga", "L.", "G-3");
        students[4] = new Student("Dr.Zoidberg", "J.", "G-2");
        students[5] = new Student("Brannigan", "Z.", "G-1");
        students[6] = new Student("Farnsworth", "H.J.", "G-2");
        students[7] = new Student("Scruffy", "S.", "G-3");
        students[8] = new Student("Wong", "A.", "G-1");
        students[9] = new Student("Conrad", "H.", "G-3");

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                students[i].addMarks(random.nextInt(4) + 7);
            }
        }

        for (Student student : students) {
            student.print();
        }

        System.out.println("!!!!!!!THE BEST STUDENTS: ");
        for (Student student : students) {
            if (student.goodStudents()) {
                student.print();
            }
        }
    }
}
