import java.util.Scanner;

public class Day2_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入分数");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("分数不合法");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("重修吧");
        }

        System.out.println("请输入年份");
        Scanner a = new Scanner(System.in);
        int year = a.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("非闰年");
        }


        System.out.println("请输入两个数字和一个运算符");
        System.out.println("请输入第一个数字");
        Scanner b = new Scanner(System.in);
        System.out.println("请输入第二个数字");
        Scanner c = new Scanner(System.in);
        System.out.println("请输入运算符");
        Scanner d = new Scanner(System.in);
        double B = b.nextInt();
        double C = c.nextInt();
        char D = d.next().charAt(0);
        double result = 0;


        switch (D) {
            case '+':
                result = B + C;
                System.out.println("结果是"+result);
                break;
            case '-':
                result = B - C;
                System.out.println("结果是"+result);
                break;
            case '*':
                result = B * C;
                System.out.println("结果是"+result);
                break;
            case '/':
                // 判断除数不能为0
                if (C == 0) {
                    System.out.println("错误：除数不能为0！");
                } else {
                    result = B / C;
                    System.out.println("结果是"+result);
                }
                break;
            default:
                System.out.println("错误：运算符不合法！");
                break;
        }


        System.out.println("请输入三个整数");
        Scanner a1 = new Scanner(System.in);
        Scanner a2 = new Scanner(System.in);
        Scanner a3 = new Scanner(System.in);
        int number1 = a1.nextInt();
        int number2 = a2.nextInt();
        int number3 = a3.nextInt();

        int temp; //临时变量，用于交换


        if (number1 > number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }

        if (number1 > number3) {
            temp = number1;
            number1 = number3;
            number3 = temp;
        }

        if (number2 > number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        System.out.println("三个数从小到大排序为 " + number1 + " " + number2 + " " + number3);


        System.out.println("输入你的BMI");
        Scanner heath = new Scanner(System.in);
        double BMI = heath.nextDouble();
        if ( BMI > 28){
            System.out.println("肥胖");
        }
        if ( BMI <18.5){
            System.out.println("偏瘦");

        }
        if (BMI>=24&&BMI<=27.4){
            System.out.println("偏胖");
        }
        else{
            System.out.println("正常");
        }
    }
}
