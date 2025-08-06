public class NumToString {
    static void numtoString(int num,String words[]){
        if(num==0){
            return;
        }
        numtoString(num/10, words);
        int digit = num%10;
        System.out.print(words[digit]+" ");
    }
    static String numtoString1(int num,String words[]){
        if(num==0){
            return "";
        }
        String s = numtoString1(num/10, words);
        s += words[num%10]+" ";
        return s;
    }
    public static void main(String[] args) {
        String words[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int num = 123;
        numtoString(num,words);
        String res = numtoString1(num,words);
        System.out.println(res);
    }
}
