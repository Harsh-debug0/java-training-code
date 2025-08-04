public class CountVowels {
    public static void main(String[] args) {
        String s = "Hello how are you";
        s = s.toLowerCase().replaceAll(" ", "");
        char vowels[] ={'a','e','i','o','u'};
        int count[] = new int[5];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count[0]++;
            }
            else if(s.charAt(i)=='e'){
                count[1]++;
            }
            else if(s.charAt(i)=='i'){
                count[2]++;
            }
            else if(s.charAt(i)=='o'){
                count[3]++;
            }
            else if(s.charAt(i)=='u'){
                count[4]++;
            }
        }
        for(int i=0;i<vowels.length;i++){
            System.out.println(vowels[i]+" is coming "+ count[i]+" times ");
        }
    }
}
// happy number
//lucidiean gcd
//automorphic number