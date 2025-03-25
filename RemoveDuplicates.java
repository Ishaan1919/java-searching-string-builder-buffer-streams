import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "hello ishaan";
        HashSet<Character> set = new HashSet<>();
        int size = s.length();

        StringBuilder str = new StringBuilder();

        for(int i=0;i<size;i++){
            if(! set.contains(s.charAt(i))){
                str.append(s.charAt(i));
            }
            set.add(s.charAt(i));
        }
        System.out.println(str);
    }
}