/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p0.pkg0;

/**
 *
 * @author alexu
 */
public class P00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double x = (a - 5)*(b + 4);
        System.out.println("x = " + x);
        double m = 3;
        double y = m * x + b;
        System.out.println("y = " + y);
        double z = 4 * ((2 * x + 7) * (3 * x - 2));
        System.out.println("z = " + z);
        double w = (m - 4 * x) / (7 - y);
        System.out.println("w = " + w);
        double v = (a * x * 2 + b * x + z) / (m * x - w);
        System.out.println("v =" + v);




    }

}
