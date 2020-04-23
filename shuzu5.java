package shuZu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * shuzu5
 *
 * @Author: wwb
 * @Date: 2020/4/16 19:45
 */
public class shuzu5 {
    public static void main(String[] args) {
        int []x=new int[20];
        Scanner a=new Scanner(System.in);
        x[0]=a.nextInt();
        Scanner b=new Scanner(System.in);
        x[1]=b.nextInt();
        for(int i=2;i<20;i++)
        {
            x[i]=x[i-1]+x[i-2];
        }
       System.out.print(Arrays.toString(x));
    }
}