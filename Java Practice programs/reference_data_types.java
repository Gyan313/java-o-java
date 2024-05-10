import java.util.Date;
// importing "java.util" package to use "Date" class with "D capital"

import javax.print.attribute.standard.PrintQuality;

import java.awt.*;
import java.security.cert.PolicyNode;

public class reference_data_types {
    public static void main(String[] args) {
        /*
         * byte age=9; // ---> primitive data type
         * Date today=new Date(); // "Date" is a reference data type
         * long d=today.getTime(); // accesing methods of Date class using "." operator
         * System.out.println(today); // printing "today" give current date time of my
         * machine
         */

        Point p1 = new Point(1, 2);
        Point p2 = p1;
        p1.x = 8;
        System.out.println(p2); // x will change to 8 in p2 also.
    }
}
