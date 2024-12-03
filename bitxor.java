import java.util.*;
public class bitxor {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        String res=String.format("after swappimg ln a=%dln b=%d",a,b);
        System.out.println(res);
    }

    
}