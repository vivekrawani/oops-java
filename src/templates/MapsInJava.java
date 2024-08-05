package templates;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MapsInJava {

    public static void main(String[] args) {
      int arr[] = {1, 24, 59, 65, 93,32,18,70, 96 ,78, 43, 24, 66};

      Map<Integer, Integer> mp = new HashMap<>();
      for(int i : arr){
        mp.put(i, 1+mp.getOrDefault(i, 0));
      }
      for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
      }

      for (var key : mp.keySet()) {
        System.out.println(key + ":" + mp.get(key));
    }

//    Iterator<Map.Entry<String, Integer>> iterator = mp.entrySet().iterator();
//    while (iterator.hasNext()) {
//        Map.Entry<String, Integer> entry = iterator.next();
//        System.out.println(entry.getKey() + ":" + entry.getValue());
//    }
    
//   int min[] = {0};
//     mp.forEach((k, v) -> {
//         if(v == 24) min[0] += v;
//     });
    // List<List<Integer>> inv = new ArrayList<>(10);
   
    // System.out.println(inv.size());
   
    // for(int i = inv.size() - 1; i>=0 ;i--){
    //     for(int num : inv.get(i)) {
    //         res[j++] = num;
    //         if(j == k) break;
    //     }
    //     if(j==k) break;
    // }


    }
}
//             int min = nums1[i] < nums1[i] ? nums1[i] : nums1[i];
//             int max = nums1[i] > nums1[i] ? nums1[i] : nums1[i];