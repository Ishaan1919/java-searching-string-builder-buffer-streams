public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 4;
        boolean present = searchInMatrix(numbers,target);
        if(present){
            System.out.println("The number " + target + " is present");
        }
        else{
            System.out.println("The number " + target + " is not present");
        }
    }
    public static boolean searchInMatrix(int[][] numbers, int target){
        int n = numbers.length;
        int m = numbers[0].length;
        int start = 0;
        int end = (m*n)-1;
        while(start<=end){
            int mid = (start+end)/2;
            int row = mid/m;
            int col = mid%m;
            if(numbers[row][col]==target){
                return true;
            }
            else if(numbers[row][col] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}