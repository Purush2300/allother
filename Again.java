public class Again {
    public static void main(String[] args) {
        num(5);
    }
    static void num(int x){
        if(x==1){
            return;
        }
        System.out.println(x);
        num(x-1);
    }
}
