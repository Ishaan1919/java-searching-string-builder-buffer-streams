public class RotationPoint {
    public static void main(String[] args) {
        int[] rotatedArray = {4,5,6,1,2,3};
        int smallestElementIndex = getRotationPoint(rotatedArray);
        System.out.println("Index " + smallestElementIndex);
        System.out.println("Value at Index " + rotatedArray[smallestElementIndex]);

    }

    public static int getRotationPoint(int[] rotatedArray){
        int size = rotatedArray.length;
        int start = 0;
        int end = size-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(rotatedArray[mid] >= rotatedArray[end]){
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return end;
    }
}