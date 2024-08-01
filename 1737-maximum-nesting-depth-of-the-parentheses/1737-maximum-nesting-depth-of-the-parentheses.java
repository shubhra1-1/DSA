class Solution {
    public int maxDepth(String s) {
        int maxi=0;
        int count=0;
       char[] arr = s.toCharArray();
       for(int i =0;i<arr.length;i++){
        if(arr[i]=='('){
            count++;
        }
        if(arr[i]==')'){
            count--;
        }
        if(count>maxi){
            maxi++;
        }

        maxi=Math.max(maxi,count);
        
       }
       return maxi;
        
    }
}