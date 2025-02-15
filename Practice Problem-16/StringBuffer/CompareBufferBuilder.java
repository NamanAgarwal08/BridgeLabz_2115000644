public class CompareBufferBuilder {
    public static void main(String[] args) {
        String dummyData = "HelloWorld!";

        // for StringBuilder
        StringBuilder sb = new StringBuilder();
        
        long startTime = System.nanoTime();
        
        for (int i = 0; i < 1000000; i++) {
            sb.append(dummyData);
        }
        
        long endTime = System.nanoTime();
        
        System.out.println("StringBuilder : " + ((endTime - startTime) / 1_000_000) + " ms");

        
        // for StringBuffer
        StringBuffer sbf = new StringBuffer();
        
        startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            sbf.append(dummyData);
        }

        endTime = System.nanoTime();

        System.out.println("StringBuffer : " + ((endTime - startTime) / 1_000_000) + " ms");
    }
}
