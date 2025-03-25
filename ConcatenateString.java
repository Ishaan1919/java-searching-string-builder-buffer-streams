public class ConcatenateString {
    public static void main(String[] args) {
        String[] arr = {"Hello ", "my name ", "is ", "ishaan"};
        StringBuffer str = new StringBuffer();
        for(String i:arr){
            str.append(i);
        }
        System.out.println(str);
    }
}