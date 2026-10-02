package round201;

import java.util.Scanner;

public class Task2 {
    public static Scanner sc2=new Scanner(System.in);
    public static void main(String[] args) {
        long m=9800;
        while(true){
            System.out.println("欢迎您使用银行账户管理系统: ");
            System.out.println("请选择您要办理的业务序号: ");
            System.out.println("1.存款 "+" "+"2.取款 "+" "+"3.查询余额 "+" "+"4.退出");
            int choice= sc2.nextInt();
            if(choice==4){
                System.out.println("感谢你的使用，欢迎下次光临");
                break;
            }else{
                m=getIn(m,choice);
            }
        }
    }

    public static long getIn(long m,int choice){
        switch (choice) {
            case 1:
                System.out.println("请输入您要存入的金额: ");
                long b =sc2.nextLong();
                if(b>=0) {
                    m += b;
                    System.out.println("已存完，你账户上的余额为: " + m);
                }else{
                    System.out.println("您输入的金额有误，请您重新存入");
                }
                break;
            case 2:
                System.out.println("请输入您要取出的金额: ");
                long c = sc2.nextLong();
                if(c<0){
                    System.out.println("您输入的金额有误，请重新输入");
                }else if(c>m){
                    System.out.println("您余额不足");
                }else{
                    m-=c;
                    System.out.println("已取出"+ c+",余额剩余"+m);
                }
                break;
            case 3:
                System.out.println("您的帐户余额为: " + m);
                break;
            default:
                System.out.println("暂未开放此业务，请您重新选择");
        }
        return m;
    }
}