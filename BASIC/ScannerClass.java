


import java.util.Scanner;
//Clase scanner

public class ScanerUsage {
    public static void main(String args[]) {
        System.out.println("Escriba tu nombre:");
        Scanner sc = new Scanner(System.in);
        var user = sc.nextLine();
        System.out.println(user.toString());
        sc.close();
    }
}
