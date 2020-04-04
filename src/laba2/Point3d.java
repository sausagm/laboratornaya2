package laba2;

import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class Point3d {
    private double x;
    private double y;
    private double z;

    public Point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3d() {
        this.x = 0;
        this.y = 0;
        this.z = 0;

    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public void setX(double cord) {
        this.x = cord;
    }

    public void setY(double cord) {
        this.y = cord;
    }

    public void setZ(double cord) {
        this.z = cord;
    }

    public static boolean pointsToPoints(Point3d cord1, Point3d cord2) {
        double[] cord_1 = new double[]{cord1.getX(), cord1.getY(), cord1.getZ()};
        double[] cord_2 = new double[]{cord2.getX(), cord2.getY(), cord2.getZ()};

        if (cord_1[0] == cord_2[0] && cord_1[1] == cord_2[1] && cord_1[2] == cord_2[2]) {
            return true;
        } else {
            return false;
        }
    }

    public static double distanceTo(Point3d cord1, Point3d cord2) {
        if (Point3d.pointsToPoints(cord1, cord2) != true) {
            double[] cord_1 = new double[]{cord1.getX(), cord1.getY(), cord1.getZ()};
            double[] cord_2 = new double[]{cord2.getX(), cord2.getY(), cord2.getZ()};

            double distance = Math.sqrt(
                    Math.pow((cord_1[0] - cord_2[0]), 2) +
                            Math.pow((cord_1[1] - cord_2[1]), 2) +
                            Math.pow((cord_1[2] - cord_2[2]), 2)
            );
            return distance;
        } else {
            System.out.println("pounts r same");
            return 0;
        }
    }
}
