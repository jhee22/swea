package swea.day03_queue;
import java.util.*; 
import java.io.*; 
public class Solution3 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int T = Integer.parseInt(br.readLine()); 
        for(int test_case = 1; test_case <= T; test_case++) { 
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken()); 
            // 합 자체를 인덱스로 사용 
            int[] count = new int[n+m+1]; 

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    int sum = i + j; 
                    count[sum]++; 
                }
            }
            int maxCount = Integer.MIN_VALUE; 
            for (int elem : count) {
                if (elem > maxCount) {
                    maxCount = elem; 
                }
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] == maxCount) {
                    System.out.println("#" + test_case + " " + i);
                }
            }

        }
    }
}
