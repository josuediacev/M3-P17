package practica17;

import java.util.Scanner;

public class Practica17 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;
        int euro;
        float dolars;
        double doolars;
        String e;
        String euros1;
        int dolarsInt;
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//inicio switch
                case 1:
                    System.out.print("Quantity of euros: ");
                    euro = keyboard.nextInt();
                    dolars = functionIntFloat(euro);
                    System.out.println("Dolars: " + dolars + "$");
                    break;
                case 2:
                    System.out.print("Quantity of euros: ");
                    euro = keyboard.nextInt();
                    doolars = functionIntDouble(euro);
                    System.out.println("Dolars: " + doolars + "$");
                    break;
                case 3:
                    System.out.print("Quantity of euros: ");
                    euro = keyboard.nextInt();
                    e = functionIntString(euro);
                    System.out.println("String: " + e);
                    break;
                case 4:
                    System.out.print("Quantity of euros: ");
                    euros1 = keyboard.next();
                    dolarsInt = functionStringInt(euros1);
                    System.out.println("Dolars: " + dolarsInt + "$");
                    break;
                case 5:
                    System.out.print("Quantity of euros:");
                    float Sergio = keyboard.nextFloat();
                    int Carla = functionFloatInt(Sergio);
                    System.out.println("Dolars: " + Carla + "$");
                    break;
                case 6:
                    System.out.print("Quantity of euro: ");
                    float Dani = keyboard.nextFloat();
                    String berta = functionFloatString(Dani);
                    System.out.println("Dolars: " + berta + "$");
                    break;
                case 7:
                    System.out.println("letter: ");
                    char dataChar = (keyboard.next()).charAt(0);
                    int baluni = (int) dataChar;
                    String cas7 = functionCharIntBinario(baluni);
                    System.out.println(baluni);
                    System.out.println(cas7);
                    break;
                case 8:
                    System.out.print("name: ");
                    String name = keyboard.next();

                    String nameBinary = functionStringBinary(name);
                    System.out.println(nameBinary);
                    break;
                case 9:
                    System.out.print("number between 0 to 255: ");
                    int number = keyboard.nextInt();
                    if (number > 0 || number < 255) {
                        char numberChar = (char) (number);
                        System.out.println(number + ": " + numberChar);
                    } else {
                        System.out.print("this number isn't between 0 and 255");
                    }
                    break;
                case 10:
                    ascii();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Option invalid");
            }//fin switch

        }
        while (option != 0);//fin de do while 

    }

    private static float functionIntFloat(int boxEuro) {
        float result = 0;
        result = (float) (boxEuro * 1.1f);
        return result;
    }

    private static double functionIntDouble(int money) {
        double result = 0;
        result = Double.valueOf(money * 1.1);
        return result;
    }

    private static String functionIntString(int string) {
        String result;
        result = String.valueOf(string * 1.1f);
        return result;
    }

    private static int functionStringInt(String boxEuro) {
        int result = 0;
        result = Integer.valueOf(boxEuro);
        result = (int) (result * 1.1);
        return result;
    }

    private static int functionFloatInt(float boxxie) {
        int result = (int) (boxxie);
        return result;
    }

    private static String functionFloatString(float perry) {
        String result;
        result = String.valueOf(perry * 1.1f);
        return result;
    }

    private static String functionCharIntBinario(int bal) {
        String kitty = Integer.toBinaryString(bal);
        return kitty;
    }

    private static String functionStringBinary(String txt) {
        String result = "";
        char ch;
        for (int i = 0; i < txt.length(); i++) {
            ch = Character.toUpperCase(txt.charAt(i));
            result += Integer.toBinaryString(ch) + " ";
        }
        return result;
    }

    private static void ascii() {
        System.out.println("ASCII: Sistema de codificación de caracteres alfanuméricos que asigna un número del 0 al 127 a cada letra, número o carácter especial recogidos; el ASCII extendido permite hasta 256 caracteres distintos."
                + "Préstamo del inglés ASCII, siglas de A(merican) s(tandard) c(ode) (for) i(nformation) i(nterchange) ‘código normalizado norteamericano para el intercambio de información’.");
        for (int i = 0; i < 255; i++) {
            System.out.println(i+"\t"+Integer.toString(i, 16)+ "\t"+(char)i);
        }
    }

    private static void userMenu() {
        System.out.println("Option 1- :");
        System.out.println("Option 2- :");
        System.out.println("Option 3- :");
        System.out.println("Option 4- :");
        System.out.println("Option 5- :");
        System.out.println("Option 6- :");
        System.out.println("Option 7- :");
        System.out.println("Option 8- :");
        System.out.println("Option 0- out");
        System.out.print("\nOption: ");
    }
}
