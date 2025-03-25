public class CompareBufferBuilder {
    public static void main(String[] args) {
        String hello = "hello";
        int million = 1000000;

        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();

        long bufferTimeStart = System.nanoTime();
        for(int i=0;i<million;i++){
            buffer.append(hello);
        }
        long bufferTimeEnd = System.nanoTime();

        long builderTimeStart = System.nanoTime();
        for(int i=0;i<million;i++){
            builder.append(hello);
        }
        long builderTimeEnd = System.nanoTime();

        System.out.println("Time taken by String buffer operations: " + (bufferTimeEnd-bufferTimeStart));
        System.out.println("Time taken by String builder operations: " + (builderTimeEnd-bufferTimeStart));
    }
}