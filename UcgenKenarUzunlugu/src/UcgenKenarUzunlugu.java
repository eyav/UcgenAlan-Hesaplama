import java.util.Scanner;

public class UcgenKenarUzunlugu {
    public static void main(String[] args) {

        double a,b,c;
        Scanner girdi= new Scanner(System.in);
        System.out.println("1. kenarı gişriniz:");
        a= girdi.nextInt();

        System.out.println("2. kenarı gişriniz:");
        b= girdi.nextDouble();

        System.out.println("3. kenarı gişriniz:");
        c= girdi.nextDouble();

        double cevre = (a+b+c);
        double u=(cevre/2);
        double alan= u*(u-a)*(u-b)*(u-c);

        System.out.println("Ucgenin Alanı:"+alan);


    }
}
