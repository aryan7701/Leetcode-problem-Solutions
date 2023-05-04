import java.util.*;

public class DifferenceBtwTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1= new ArrayList<Integer>();
        List<Integer> list2= new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list2.add(nums2[i]);
        }
        //Add the two list in one list as a subset of a list;=
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i)==list2.get(j)){
                    //removing element from lists2
                    list2.remove(j);
                    //remove element from list1
                    list1.remove(i);
                }
            }
        }
        for(int i=0;i<list1.size();i++){
            list3.add(i);
        }
        for(int i=0;i<list2.size();i++){
            list3.add(i);
        }
        return Collections.singletonList(list3);
    }
    public static void main(String[] args){
        int []nums1 = {1,2,3};
        int []nums2 = {2,4,6};
        System.out.println(findDifference(nums1,nums2));
    }
}
