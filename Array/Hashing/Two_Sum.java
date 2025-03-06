import java.util.*;
class Two_Sum {

    public static int[] twoSum(int[] nums, int target) 
    {
                          //T(n)=n^2
        int n=nums.length;
        int sum=0;
        int[] output = new int[2];

            for(int i=0; i<n; i++)
            {
                for(int j=i+1; j<n; j++)
                {
                    sum=nums[i]+nums[j];
                    if(sum==target)
                    {
                        output[0]=i;
                        output[1]=j;
                        return output;
                    }

                }
                sum=0;
            }
        return output;

    }
    public static void main(String[] args)
    {
        int[] nums = {7,5,3,5,8};
        int target = 13;
        System.out.print(Arrays.toString(twoSum(nums, target)));

    }
}