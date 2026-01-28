public class Printntonumber{
  static void print(int x,int y){
    if(y>10){
        return;
    }
    
    
    System.out.println(x +"*"+ y+"="+(x*y));
    print(x,y+1);
  }






    public static void main(String[] args) {
        int a=5;
        int b=1;
        print(a,b);
        
    }
}