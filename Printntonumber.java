public class Printntonumber{
  static void print(int x){
    if(x==0){
        return;
    }
    System.out.print(x +" ");
    print(x-1);
  }






    public static void main(String[] args) {
        int num=4;
        print(num);
        
    }
}