public class PeakElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 7, 8, 3};
        int peakIndex = getPeakIndex(numbers);
        System.out.println("Peak Index " + peakIndex);
        System.out.println("Value at Peak Index " + numbers[peakIndex]);
    }

    public static int getPeakIndex(int[] numbers){
        int size = numbers.length;
        int start = 0;
        int end = size-1;
        while(start<end){
            int mid = (start + end) / 2;
            if(numbers[mid] > numbers[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}