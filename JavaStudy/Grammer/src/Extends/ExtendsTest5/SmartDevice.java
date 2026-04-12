package Extends.ExtendsTest5;

public class SmartDevice {
    String name;
    double price;

    public double payment() {
        /*
        [0, 1000 )      不打折
        [1000 , 5000 )  9折
        [5000 , 10000 ) 8折
        [10000, +00 )   7折
         */

        if (price >= 0 && price < 1000) {
            return price;
        }
        else if (price >= 1000 && price < 5000) {
            return price * 0.9;
        }
        else if (price >= 5000 && price < 10000) {
            return price * 0.8;
        }
        else if (price >= 10000) {
            return price* 0.7;
        }
        else {
            return 0;
        }
    }
}
