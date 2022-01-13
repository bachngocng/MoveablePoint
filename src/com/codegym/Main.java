package com.codegym;

public class Main {

    public static void main(String[] args) {
        Point p1 = new MoveablePoint(2, 1);
        p1.setXY(1, 4);
        System.out.println(p1);
        Point p2 = ((MoveablePoint) p1).move();
        System.out.println(p2);

        Point p3 = new Point(4, 9);
//      Point p4 = ((MovablePoint) p3).move();     // dòng này lỗi
//      Lỗi vì p4 là Point (dòng 12, new Point(4,9) ). không thể bị ép kiểu về MovablePoint
//      p1 có thể ép kiểu được vì: tuy KDL thực của p1 là Point (dòng 6, Point p1)
//      nhưng tham chiếu của nó là MovablePoint (dòng 6, new MovablePoint(2,1))

    }
}
