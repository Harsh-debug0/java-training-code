public class TableRec {
    static void table(int num,int i){
        if(i==0){
            return;
        }
        table(num,i-1);
        System.out.println(num +"x"+ i +" = "+num*i);
    }
    static String table1(int num,int i){
        if(i==11){
            return "";
        }
        String s = table1(num, i+1);
        s = num+" x "+i+" = "+num*i+"\n"+s;
        return s;
    }
    public static void main(String[] args) {
        //table(5,10);
        String r= table1(5,1);
        System.out.println(r);
    }
}



//sum of digit 123 o/p 6 try with void and int return
//check prime or not try with void and int return
//check armstrong or not try with void & boolean return
//count no of zeros
//convert binary to decimal
//sum of n natural numbers
//find out number is strong or not
//count even odd digits in a number
//print power of a number
//num to string conversion 123 - one two three