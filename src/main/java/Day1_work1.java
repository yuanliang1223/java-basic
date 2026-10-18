import java.util.Scanner;

public class Day1_work1 {
    public static void main(String[] args) {
        String name = "yule";
        int age = 18;
        int heigh = 185;
        int weight = 88;

        System.out.println("你好"+name+"，你今年"+age+"，你的身高是"+heigh+"cm，你的体重是"+weight+"kg" );


        Scanner tem = new Scanner(System.in);
        System.out.println("请输入摄氏度温度");
        double c = tem.nextDouble();
        double F = (double) (c* 9) /5+32;
        System.out.println("华氏度的温度为"+F);


        Scanner a = new Scanner(System.in);
        System.out.println("请输入一个三位数数字");
        int mumber = a.nextInt();
        int y =mumber/100;
        int z = mumber/10%10;
        int x = mumber%10%10;
        System.out.println("三位数的百位是"+y+"十位是"+z+"个位是"+x);


        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个秒");
        int time = s.nextInt();
        int h = time/3600;
        int min = time%3600/60;
        int sec = time%60;
        System.out.println("秒数转换为:"+h+"小时"+min+"分钟"+sec+"秒");


    }
}
