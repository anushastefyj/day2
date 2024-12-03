import java.util.*;
 class swapmuldiv{
 public static void main(String args[]){

        Scanner Sc=new Scanner(System.in);
        {
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        a=a*b;
        b=a/b;
        a=a/b;
        String res=String.format("after swapping boy=%d and girl=%d",a,b);
        System.out.println(res);
    }
}
}
    
