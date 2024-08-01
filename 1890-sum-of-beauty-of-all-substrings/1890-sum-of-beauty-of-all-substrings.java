class Solution {

    public int getMax(int freq[]){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
            max=Math.max(max,freq[i]);    
            }
        }
        return max;
    }

    public int getMin(int freq[]){
        int min= Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                min=Math.min(min,freq[i]);
            }
            
        }
        return min;
    }

    public int beautySum(String s) {

        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int freq[]=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                int max= getMax(freq);
                int min= getMin(freq);

                int beauty = max-min;
                ans+=beauty;
            }
        }
        return ans;
    }
}