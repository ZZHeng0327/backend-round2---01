import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        long m=9800;
        while(true){
        m=getin(m);
        if(m==-1){
            break;}
        }
    }
    public static long getin(long m){
        System.out.println("欢迎您使用银行账户管理系统：");
        System.out.println("请选择您要办理的业务序号：");
        System.out.println("1.存款" + "   " + "2.取款" + "   " + "3.查询余额" + "   " + "4.退出");
        Scanner sc=new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("请输入您要存入的金额：");
                    long b = sc.nextLong();
                    m += b;
                    System.out.println("已存完，你账户上的余额为：" + m);
                    return m;
                case 2:
                    System.out.println("请输入您要取出的金额：");
                    long c = sc.nextLong();
                    if (c <= m) {
                        m -= c;
                        System.out.println("已取出，您账户上的余额为：" + m);
                        return m;
                    } else {
                        System.out.println("您余额不足");
                    }
                    return m;
                case 3:
                    System.out.println("您的帐户余额为：" + m);
                    return m;
                case 4:
                    System.out.println("感谢您的使用，欢迎下次光临！");
                    return m=-1;
                default:
                    System.out.println("暂未开放此业务，qingnin重新选择");
            }
            return m;

    }
}
