public class FirstNegativeNumber {
    public static void main(String[] args) {
        int[] numbers = {3,5,5,1,-1,3,-4,5};
        int firstNegativeNumber = getFirstNegativeNumber(numbers);

        if(firstNegativeNumber!=0){
            System.out.println("First negative number: " + firstNegativeNumber);
        }
        else{
            System.out.println("There is no negative number present in the array");
        }
    }
    public static int getFirstNegativeNumber(int[] numbers){
        for(int i:numbers) {
            if(i<0){
                return i;
            }
        }
        return 0;
    }
}