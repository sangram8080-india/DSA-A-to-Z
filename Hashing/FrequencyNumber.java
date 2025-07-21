import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class FrequencyNumber {
            public static int[] frequencyNumber(int arr[]){
                Arrays.sort(arr);
                int n = arr.length-1;
                int hash[] = new int[n+1];
                for(int i=0; i<=n; i++){
                    hash[arr[i]]++;
                }
return hash;
            }

            public static Map<Integer,Integer> printFrequency(int arr[]){
                int hash[] = frequencyNumber(arr);
                Map<Integer, Integer> freqMap = new HashMap<>();
                for(int i=0; i<hash.length; i++){
                    if(hash[i] != 0){
                     freqMap.put(i, hash[i]);
                    }
                }
                return freqMap;}
        public static void main(String[] args){
            int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 1};
            System.out.println("Frequency of numbers in the array:");
          Map<Integer,Integer> res=  printFrequency(arr);
            for(Map.Entry<Integer, Integer> entry : res.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        
       
    }
