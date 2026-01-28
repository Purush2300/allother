public class Digitsum {
    static int digit(int x){
        if(x==0){
            return 0;
        }
        return digit(x/10)+x%10;
    }
    public static void main(String[] args) {
        int num=241;
        System.out.println(digit(num));
    }
}
