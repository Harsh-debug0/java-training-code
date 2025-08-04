package Recurrsion;

public class NamePrint {
    static void show(int n){
    if(n==0){
        return;
    }
    System.out.println("Harsh Shishodia");
    show(n-1);
    
}
    public static void main(String[] args) {
        show(5);
    }
}
