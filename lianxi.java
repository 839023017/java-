package shuZu;

/**
 * lianxi
 *
 * @Author: wwb
 * @Date: 2020/4/16 14:20
 */
public class lianxi {
    public  String addition(String a,String b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Integer s=new Integer(123);
        Integer x=new Integer(1234);
        char[]y={'a','b','c','r'};
        String r="daewawe";
        System.out.println(r+r.length());
        String abcr=new String(y);
        System.out.println(abcr);
        float a=s.floatValue();
        float d=x.floatValue();
        short b=s.shortValue();
        double c=s.doubleValue();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        StringBuffer sBuffer=new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append("root");
        sBuffer.reverse();
        System.out.println(sBuffer);
        char[] chs={'a','b','c'};
        String s2=new String(chs);
        System.out.println("s2:"+s2);
       String s3="abc";
       byte []s4={97,98,99};
        System.out.println("s4:"+s4.toString());
    }
}