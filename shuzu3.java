package shuZu;

import com.sun.corba.se.spi.ior.iiop.MaxStreamFormatVersionComponent;

import java.util.Scanner;

/**
 * shuzu3
 *
 * @Author: wwb
 * @Date: 2020/4/16 19:11
 */
public class shuzu3 {
    public static void main(String[] args) {
        double []score=new double[10];
        System.out.println("请输入10个评委的评分");
        Scanner sc=new Scanner(System.in);
        double max=0,min=10,num=0;
        for(int i=0;i<score.length;i++)
        {   score[i]=sc.nextDouble();
        num=num+score[i];
            if(score[i]>max)
            max=score[i];
        if(score[i]<min)
            min=score[i];
        }
        System.out.println((num-max-min)/8);


    }
}