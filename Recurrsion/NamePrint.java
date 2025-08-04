package Recurrsion;

public class NamePrint {
    static void show(int n){
    if(n==0){
        return;
    }
    System.out.println("Harsh "+n); //pre logic
    show(n-1); // recurrence relation
    // post logic - backtracking
    System.out.println("Shishodia "+n);
    
}
    public static void main(String[] args) {
        show(5);
    }
}
