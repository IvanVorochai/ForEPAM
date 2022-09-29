package module4.part1.task3;

import java.util.Arrays;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Student {

    private final String surname;
    private final String firstAndMiddleName;
    private final String groupNumber;
    private final int[] marks;
    private final int m = 5;
    private int counterMarks = 0;

    public Student(String surname, String firstAndMiddleName, String groupNumber) {
        this.surname = surname;
        this.firstAndMiddleName = firstAndMiddleName;
        this.groupNumber = groupNumber;
        this.marks = new int[m];

    }

    public boolean addMarks(int mark) {
        if (counterMarks >= m) {
            return false;
        } else {
            marks[counterMarks] = mark;
            counterMarks++;
            return true;
        }
    }

    public boolean goodStudents() {
        for (int i = 0; i < m; i++) {
            if (marks[i] != 9 && marks[i] != 10)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return surname + " " + firstAndMiddleName + "\n" +
                groupNumber + "\n" +
                "Marks: " + Arrays.toString(marks) + "\n\n";
    }

    public void print() {
        System.out.println(surname + " " + firstAndMiddleName);
        System.out.println(groupNumber);
        System.out.print("Marks: ");
        for (int i = 0; i < counterMarks; i++) {
            System.out.print(marks[i] + "; ");
        }
        System.out.println();
        System.out.println();
    }


}


