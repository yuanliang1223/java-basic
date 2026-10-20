import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入分数");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("分数不合法");
        }
        else if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 60) {
            System.out.println("及格");
        }
        else {
            System.out.println("重修吧");
        }

        System.out.print("输入星期(1-7)：");
        int day = sc.nextInt();
        switch (day) {
            case 6:  System.out.println("周末，睡懒觉"); break;
            case 7:  System.out.println("周末，睡懒觉"); break;
            case 1:  System.out.println("周一，青协例会"); break;
            default: System.out.println("上课"); break;
        }
    }
}