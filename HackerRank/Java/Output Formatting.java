import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.print(s1);
            for(int j=0;j<(15-s1.length());j++){
                System.out.print(" ");
            }
            String number = "";
            if(x<=99 && x>=10){
                number="0"+x;
            }
            if(x<=9 && x>=0){
                number="00"+x;
            }
            if(x>=100){
                number=""+x;
            }
            System.out.println(number);
        }
        sc.close();
        System.out.println("================================");
    }
}
