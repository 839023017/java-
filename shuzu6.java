package shuZu;

import java.util.Scanner;

/**
 * shuzu6
 *
 * @Author: wwb
 * @Date: 2020/4/16 20:04
 */
public class shuzu6 {
    public static void main(String[] args) {
        int num=0;
        Scanner z=new Scanner(System.in);
        int y=z.nextInt();
        int[]x=new int[8];
        for(int i=0;i<8;i++)
        { x[i]=y%2;
            y=y/2;
        }
        for (int i=7;i>=0;i--)
        { System.out.print(x[i]);}
    }
}