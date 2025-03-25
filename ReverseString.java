public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder str = new StringBuilder(s);
        int size = s.length();
        int i=0;
        int j=size-1;
        while(i<j){
            char temp = str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
            i++;
            j--;
        }

        StringBuilder reverse = new StringBuilder();
        for(int a=size-1;a>=0;a--){
            reverse.append(s.charAt(a));
        }
        System.out.println(str);
        System.out.println(reverse);
    }
}