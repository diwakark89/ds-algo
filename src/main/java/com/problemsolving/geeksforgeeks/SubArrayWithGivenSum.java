package com.problemsolving.geeksforgeeks;

public class SubArrayWithGivenSum {
    public int [] subArraySum(int []arr,int n,int sum){
        int []ans=new int[2];
        int curr_sum=arr[0],start=0,i;
        for( i=1;i<=n;i++){
            while(curr_sum>sum && start<i-1){
                curr_sum =curr_sum-arr[start];
                start++;
            }
            if(curr_sum==sum){
                int p=i-1;
                ans[0]=start;
                ans[1]=p;
            }if(i<n){
                curr_sum+=arr[i];
            }
        }
        return ans;
    }
}
