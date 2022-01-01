import java.util.Arrays;
\

public class ArrayFreq {
    public static void main(String[] args) {
        int[] arr ={10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] freq = new boolean[arr.length];
        Arrays.fill(freq, false);

        
        for(int i=0;i<arr.length;i++){
            if (freq[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }

        }
}
