import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        final double PI = 3.14159;        // 常量
        int age = 19;                     // 变量三要素：类型 名字 值
        double height = 1.75;
        char gender = 'M';
        boolean isStudent = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String name =  sc.nextLine();

        System.out.println("你好，" + name + "！");            // 拼接
        System.out.println("年龄明年是：" + (age + 1));        // 括号先算
        System.out.println("字符运算：" + (gender + 1));        // 'M'+1=78
        System.out.println("整数除法：" + (5 / 2));             // 2
        System.out.println("小数除法：" + (5.0 / 2));           // 2.5
        System.out.println("圆面积：" + (PI * height * height));
        System.out.println(isStudent ? "是学生" : "不是学生");   // 三元
    }
}

