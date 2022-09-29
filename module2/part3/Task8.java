package module2.part3;

import java.util.ArrayList;
import java.util.Arrays;

//8.Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные). Составить программу,
// которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
public class Task8 {
    public static void main(String[] args) {
        ArrayList<Fraction> fractions = new ArrayList<>(Arrays.asList(new Fraction(1, 2), new Fraction(1, 3),
                new Fraction(3, 5), new Fraction(9, 17), new Fraction(11, 15), new Fraction(7, 8)));

        long lcd = fractions.stream().mapToLong(f -> f.d).reduce(1, (d1, d2) -> d1 * d2 / program(d1, d2));
        fractions.stream().map(f -> f.setLCD(lcd)).sorted(Fraction::sort).forEach(System.out::println);
    }

    static long program(long a, long b) {
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static class Fraction {
        long n, d;

        public Fraction(long n, long d) {
            this.n = n;
            this.d = d;
        }

        public static int sort(Fraction f1, Fraction f2) {
            return Long.compare(f1.n, f2.n);
        }

        public Fraction setLCD(long lcd) {
            n *= (lcd / d);
            d = lcd;
            return this;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", n, d);
        }
    }
}
