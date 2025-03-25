public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] numbers = {4,5,3,4,-1,1};
        int number = getFirstMissingPositiveElement(numbers);
        System.out.println("The first missing positive integer is: " + number);
    }

    public static int getFirstMissingPositiveElement(int[] numbers){
        int size = numbers.length;

        int one = 0;
        for(int i=0;i<size;i++){
            if(numbers[i]==1) one++;
            else if(numbers[i] <= 0 || numbers[i] > size) numbers[i] = 1;
        }
        for(int i=0;i<size;i++){
            int num = Math.abs(numbers[i]);
            int index = num-1;
            if(numbers[index]<0) continue;
            numbers[index]*=-1;
        }
        for(int i=0;i<size;i++){
            if(numbers[i]>0) return i+1;
        }
        return size+1;
    }
}