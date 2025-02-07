import java.util.Scanner;
import java.lang.Math;

class Calc{
    public int sum(int a , int b){
        return a+b;
    }
    public int diff(int a , int b){
        return a-b;
    }
    public float div(float a , float b){
        return (a/b);
    }
    public int product(int a , int b){
        return a*b;
    }
    public double root(double a ){
        return Math.sqrt(a);
    }

}
public class goods {
    public static void main(String[] args) {
        Calc obj = new Calc();
        Scanner lena = new Scanner(System.in);
        System.out.println();
        System.out.println("1.add          2.sub          3.div \n4.product      5.square root  6.sin \n7.cos          8.tan          9.exponential \n10.logarithm   11.maximun     12.exit \nenter the function : ");
        int fun = lena.nextInt();
        while(true) {
            switch (fun) {
                case 1: {
                    System.out.println("enter two num : ");
                    int var1 = lena.nextInt();
                    int var2 = lena.nextInt();
                    System.out.print("sum =");
                    int sum = obj.sum(var1, var2);
                    System.out.println(sum);
                    break;
                }
                case 2: {
                    System.out.println("enter two num : ");
                    int var1 = lena.nextInt();
                    int var2 = lena.nextInt();
                    System.out.print("diff = ");
                    int diff = obj.diff(var1, var2);
                    System.out.println(diff);
                    break;
                }
                case 3: {
                    System.out.println("enter two num : ");
                    int var1 = lena.nextInt();
                    int var2 = lena.nextInt();
                    System.out.print("div = ");
                    float div = obj.div(var1, var2);
                    System.out.println(div);
                    break;
                }
                case 4: {
                    System.out.println("enter two num : ");
                    int var1 = lena.nextInt();
                    int var2 = lena.nextInt();
                    System.out.print("product = ");
                    int product = obj.product(var1, var2);
                    System.out.println(product);
                    break;
                }
                case 5:{
                    System.out.println("enter the number : ");
                    int var1 = lena.nextInt();
                    System.out.println("square root = ");
                    double root = obj.root(var1);
                    System.out.println(root);
                    break;

                }
                case 6 :{
                    System.out.println("enter angle in degrees : ");
                    double degree = lena.nextDouble();
                    System.out.println((float)(Math.sin(Math.toRadians(degree))));
                    break;
                }
                case 7:{
                    System.out.println("enter angle in degrees : ");
                    double degree = lena.nextDouble();
                    System.out.println((float) (Math.cos(Math.toRadians(degree))));
                    break;
                }
                case 8:{
                    System.out.println("enter angle in degrees : ");
                    double degree = lena.nextDouble();
                    System.out.println((float) (Math.tan(Math.toRadians(degree))));
                    break;
                }
                case 9 : {
                    System.out.println("enter base and power : ");
                    float base = lena.nextFloat();
                    float power = lena.nextFloat();
                    System.out.println(Math.pow(base , power));
                    break;
                }
                case 10 :{
                    System.out.println("enter the number : ");
                    float log = lena.nextFloat();
                    System.out.println(Math.log10(log));
                    break;
                }
                case 11 :{
                    System.out.println("enter two numbers : ");
                    int var1 = lena.nextInt();
                    int var2 = lena.nextInt();
                    System.out.println(Math.max(var1 , var2));
                    break;
                }
            }
            if(fun == 12) break;
            System.out.println("do you want to use it again : (y|n)");
            String in = lena.next();
            if(in.equalsIgnoreCase("n")){
                System.out.println("kabhi alvida na kehena .......");
                break;
            }
            System.out.println("1.add          2.sub          3.div \n4.product      5.square root  6.sin \n7.cos          8.tan          9.exponential \n10.logarithm   11.maximum     12.exit \nenter the function : ");
            fun = lena.nextInt();
        }
    }
}


