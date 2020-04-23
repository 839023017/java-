package shuZu;

import java.util.Arrays;

/**
 * shuzu4
 *
 * @Author: wwb
 * @Date: 2020/4/16 11:50
 */
public class shuzu4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int []{5,3,6,9,2,7})));
    }
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {int temp=arr[j];
                 arr[j]= arr[j+1];
                 arr[j+1]=temp;
                }
            }
        }
        return  arr;
    }
}