package striver.array;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class MajorityElements {

    List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length/3;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                val++;
                map.put(nums[i],val);
            }else {
                map.put(nums[i],0);
            }
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() >= n){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        MajorityElements iso = new MajorityElements();
        int[] arr = {3,2,3};
        System.out.println(iso.majorityElement(arr));
    }
}
