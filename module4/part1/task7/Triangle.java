package module4.part1.task7;

import java.util.Arrays;

public class Triangle {

    private final double[] sideA;
    private final double[] sideB;
    private final double[] sideC;

    public Triangle(double[] sideA, double[] sideB, double[] sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
        this.sideA = new double[]{0, 0};
        this.sideB = new double[]{10, 0};
        this.sideC = new double[]{2, 6};
    }

    public double AreaOfTriangle() {
        double area = 0;
        if (sideA[0] == sideC[0] && sideA[0] == sideB[0] || sideA[1] == sideB[1] && sideA[1] == sideC[1]) {
            System.out.println("!!!It is not a triangle. It's a line!!!");
        }
        if (sideA[0] != sideB[0] && sideA[1] != sideC[1]) {
            area = Math.abs(sideB[0] - sideA[0]) * Math.abs(sideC[1] - sideA[1]) * 0.5;
        }
        if (sideA[0] != sideC[0] && sideA[1] != sideB[1]) {
            area = Math.abs(sideB[1] - sideA[1]) * Math.abs(sideC[0] - sideA[0]) * 0.5;
        }
        return area;
    }

    public double PerimeterOfTriangle() {
        double perimeter = Math.sqrt(Math.pow(sideB[0] - sideC[0], 2) + Math.pow(sideB[1] + sideC[1], 2)) +
                Math.sqrt(Math.pow(sideA[0] - sideC[0], 2) + Math.pow(sideA[1] + sideC[1], 2)) +
                Math.sqrt(Math.pow(sideB[0] - sideA[0], 2) + Math.pow(sideB[1] + sideA[1], 2));
        return perimeter;
    }

    public double[] PointOfMedianCrossing() {
        double[] medianCross = new double[2];
        medianCross[0] = (sideA[0] + sideB[0] + sideC[0]) / 3;
        medianCross[1] = (sideA[1] + sideB[1] + sideC[1]) / 3;
        return medianCross;
    }

    public String toString(Triangle str) {
        return "sideA=" + Arrays.toString(sideA) +
                ", sideB=" + Arrays.toString(sideB) +
                ", sideC=" + Arrays.toString(sideC) + "\n" +
                "Area S = " + str.AreaOfTriangle() + "\n" +
                "Perimeter P = " + str.PerimeterOfTriangle() + "\n" +
                "Point of median crossing in [x,y] M = " + Arrays.toString(str.PointOfMedianCrossing());
    }
}
