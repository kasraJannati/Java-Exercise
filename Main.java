package com.jetbrains;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //Q8   10 -> 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter a number");
//        int number = scanner.nextInt();
//        int i;
//        int k = number;
//        StringBuilder sb = new StringBuilder();
//        do{
//            i = k % 2;  // baghimande
//            k = k / 2;  // taghsim
//            sb.append(i);
//        }while(k!=0);
//        sb = sb.reverse();
//        System.out.println(sb);


        //Q5 2 -> 10
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter a number");
//        int number = scanner.nextInt(); // 100100 //36
//        int length = (int) (Math.log10(number) + 1);
//        //int length = String.valueOf(number).length();
//        length--;
//        int i=0;
//        int j=1;
//        int a = 2;
//        int b = length;
//        double resutl = 0;
//        while(b>=0){
//            int firstDigit = Integer.parseInt(Integer.toString(number).substring(i, j));
//            resutl = (Math.pow(a, b) * firstDigit) + resutl;
//            b--;
//            i++;
//            j++;
//        }
//        int value = (int) resutl;
//        System.out.println(value);


        //Q11 ( S=1/2-2/3+3/4-4/5+...+N-1/N )
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter a number");
//        double number = scanner.nextInt(); // 1
//        double i = 1;
//        double j = 2;
//        double k = i / j;
//        while((i+1)<number){
//            i++;
//            j++;
//            if(i%2 == 0){
//                k = k- i/j;
//            }else{
//                k = k+ i/j;
//            }
//        }
//        if(number<2) System.out.println(0);
//        else System.out.println(k);

        //Q10  yekan = sadgan   VA dahgan zoj bashad
//        for(int i=100;i<999;i++){
//            int x = i%10; // yekan
//            int y = (i/10)%10; //dahgan
//            int z = (i/100)%10; //sadgan
//            if((x==z)&& (y%2==0)){
//                System.out.println(i); //sadgan
//            }
//        }


        //Q12
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number (N)");
        int n = scanner.nextInt(); // 2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("please enter another number (X)");
        double x = scanner2.nextDouble(); // 4
        int p = 1;
        int i;
        int fix = (2*n) - 1;
        double power;
        double result = 0;
        while(p<fix){
            p = p+2;
            power = Math.pow(x,p);
            int fact = 1;
            for(i=1;i<=p;i++){
                fact=fact*i;
            }
            System.out.println(power);
            System.out.println(fact);
            result = (power/fact) + result;
            System.out.println(result);
        }
        double answer = x - result;
        System.out.println(answer);

    }
}
