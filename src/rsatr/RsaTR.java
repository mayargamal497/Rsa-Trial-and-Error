package rsatr;

import java.util.Scanner;

/**
 *
 * @author Mayar
 */
public class RsaTR {

    public static int p;
    public static int q;
    public static int n;
    public static int phi;
    public static int M;
    public static int c;
    public static int d;
    public static int equ;
    public static int equ2;
    public static int e;
    public static int cipher;
    public static int plaintext;
    public static Scanner myObj = new Scanner(System.in);

    public static int calcN() {
        System.out.print("Enter the value of p: ");
        p = myObj.nextInt();
        System.out.print("Enter the value of q: ");
        q = myObj.nextInt();
        n = p * q;
        System.out.print("The value of n: " + n);
        System.out.print("\n");
        return n;
    }

    public static int calcPhi() {
        phi = (p - 1) * (q - 1);
        System.out.print("The the value of φ(n): " + phi);
        System.out.print("\n");
        return phi;
    }

    public static int calcE() {
        System.out.print("Enter the value of e: ");
        e = myObj.nextInt();
        //System.out.println(e);
        return e;

    }

    public static int calcD() {
        for (int i = 1; i <= 100; i++) {
            equ = (phi * i + 1);
            System.out.println(equ);
            equ2 = equ % e;
            System.out.println(equ2);
            if (equ2 == 0) {

                d = equ / e;
                System.err.println("The value of d is: " + d);
                break;

            }

        }
        return d;

    }

    public static int calcC() {
        System.out.print("Enter the value of M: ");
        M = myObj.nextInt();
        cipher = (int) Math.pow(M, e) % n;
        System.out.println("The the value of C: " + cipher);

        return cipher;
    }

    public static int calcM() {

        plaintext = (int) Math.pow(cipher, d) % n;
        System.out.println("The the value of M: " + plaintext);

        return cipher;
    }

    public static void main(String[] args) {
        calcN();
        calcPhi();
        calcE();
        calcD();
        calcC();
        calcM();
    }

}
