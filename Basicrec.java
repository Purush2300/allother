public class Basicrec{
       static void fun1(int x){
        if(x==0){
           return;
        }
        System.out.println("gfg");
        fun1(x-1);

    }
    public static void main(String[] args){
        // int a=10;
        // int b=20;
   
     fun1(2);
    }
}