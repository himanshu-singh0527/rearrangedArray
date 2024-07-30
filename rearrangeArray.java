import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int j=1;
        int i=0;
        int arr[]=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            if(nums[k]>0){
                arr[i]=nums[k];
                i=i+2;
            }else{
                arr[j]=nums[k];
                j=j+2;
            }
        }
        return arr;
    }
}
public class rearrangeArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        Solution solution=new Solution();
        int[] rearrangeArray=solution.rearrangeArray(num);
        System.out.println("rearrange array is"+rearrangeArray);
    }
}