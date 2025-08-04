public class Pattern {
    //code for win
    static void Pattern6(){
        
    }

    static void Pattern5(){
        int n = 5;
        for(int row = 1;row<=5;row++){
            
            // for(int space = 1;space<=n-row;space++){
            //     System.out.print(" ");
            // }
             System.out.print(" ".repeat(n-row));
            //  
            // for(int col=1;col<=row;col++){
            //     System.out.print("*");
            // }
            System.out.print("* ".repeat(row));
            System.out.println();
        }
    }
    static void Pattern4(){
        int n =5;
        for(int row=1 ;row<=n;row++){
            for(int col =1;col<=n;col++){
                if(row==1 || row == n || col==1|| col==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void Pattern3(){
        int n =5;
        for(int row=1;row<=n;row++){
            /* 
            for(int space = 1;space<=n-row;space++){
                System.out.print(" ");
            }
            */
            System.out.print(" ".repeat(n-row));
            /* 
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }*/
            System.out.print("*".repeat(row));
            System.out.println();
        }
    }

    static void Pattern2(){
        int n =5;
        for(int row=n;row>=1;row--){          //this can also start from 1 to n
            for(int col=1;col<=row;col++){    //then it should go upto col 1 to n-row+1
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern1(){
        int n =5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Pattern1();
        //Pattern2();
        //Pattern3();
        //Pattern4();
        Pattern5();
    }
}
