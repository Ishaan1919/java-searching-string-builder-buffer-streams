public class FirstLastOccurence {
    public static void main(String[] args) {
        int[] numbers = {5,7,7,8,8,10};
        int target = 7;
        int first = firstOccurence(numbers,target);
        int last = lastOccurence(numbers,target);
        System.out.println("First index: " + first);
        System.out.println("Last index: " + last);
    }

    public static int firstOccurence(int[] numbers, int target){
        int size = numbers.length;
        int start = 0;
        int end = size - 1;
        while(start<end){
            int mid = (start+end)/2;
            if(numbers[mid] < target){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    public static int lastOccurence(int[] numbers, int target){
        int size = numbers.length;
        int start = 0;
        int end = size - 1;
        while(start<end){
            int mid = (start+end)/2;
            if(numbers[mid] > target){
                end = mid-1;
            }
            else{
                start = mid;
            }
        }
        return start;
    }
}