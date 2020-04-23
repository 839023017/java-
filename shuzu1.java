package shuZu;

/**
 * shuzu1
 *
 * @Author: wwb
 * @Date: 2020/4/16 11:43
 */
public class shuzu1 {
    public static void main(String[] args) {
        boolean flag=false;
        int []arr=new int[]{1,2,3,1,2,0};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=true;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        if(!flag)
            System.out.println("没重复");
    }
}