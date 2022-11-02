package com.patternhub.javacourse.basics.stringsExample;

public class TwoSum {

    public static void main(String[] args) {
//        int[] a = {2,7,11,15};
        int[] a = {2,4,11,3};
       int[] indexs=  twoSum(a,6);
        System.out.println(indexs[0]+"  "+indexs[1]);
    }

        public static int[] twoSum(int[] nums, int target) {
            int sum =0;
            int[] indexs= new int[2];
            for(int i= 0; i< nums.length; i++){
                System.out.println(i);
                for(int j= 0; j<nums.length; j++){
                    System.out.print(j);
                    if(nums[i]+nums[j] == target){
                        indexs[0] = i;
                        indexs[1] = j;
                        break;
                   }
                }
                System.out.println();

            }
            return indexs;
        }


}
