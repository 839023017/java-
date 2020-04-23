package shuZu;

/**
 * shuzu2
 *
 * @Author: wwb
 * @Date: 2020/4/16 11:49
 */
public class shuzu2 {
    public static void main(String[] args) {
        int []arr={3,7,16,0,5,0,0,6,7,0,5};
        int num=0;
        for(int i=0;i<arr.length;i++)
        { if(arr[i]!=0)
        {num++;}
        }
        int j=0;
        int []x=new int [num];
        for(int i=0;i<arr.length;i++)
        {  if(arr[i]!=0)
        { x[j]=arr[i];
            j++;}
        }
        for(int i=0;i<x.length;i++) {
            System.out.print(x[i]+" ");
        }
    }

}