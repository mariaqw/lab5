import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a hexadecimal number: ");
        String thing = scnr.next();
        int lengthy= thing.length();

        int counter = -1 , num=0;
        double num1,num2=0;
        if (thing.charAt(0)=='0'&& (thing.charAt(1)=='x' || thing.charAt(1)=='X')){
          lengthy=lengthy-2;
          counter= 1;
        }
        int powtwo =  lengthy;
        while (lengthy > 0) {
                powtwo--;
                counter++;

                char thingy = thing.charAt(counter);

                if (thingy == 'a' || thingy == 'A') {
                    num = 10;
                } else if (thingy == 'b' || thingy == 'B') {
                    num = 11;
                } else if (thingy == 'c' || thingy == 'C') {
                    num = 12;
                } else if (thingy == 'd' || thingy == 'D') {
                    num = 13;
                } else if (thingy == 'e' || thingy == 'E') {
                    num = 14;
                } else if (thingy == 'f' || thingy == 'F') {
                    num = 15;
                } else {
                    num = ((int) thingy) - 48;
                }
                num1 = (double) num * Math.pow(16, (double) powtwo);

                num2 += num1;

                if (powtwo == 0) {
                    break;
                }

            }
            System.out.println("Your number is " + (long) num2 + " in decimal");
            //System.out.println(num2);


            // System.out.println("Your number is "+      + " in decimal");

    }
}
