class Solution {
public:
    string longestPalindrome(string s) {
        int n = s.size(); //size of string
        int maxLen = 1;  //calculate maxLength
        int start = 0; //start index
        int l,h;
        for(int i=1;i<n;i++){
            //even length
            l = i-1;
            h = i;
            while(l>=0 && h<n && s[l] == s[h]){
                if(h-l+1 > maxLen){
                    start = l;
                    maxLen = h - l + 1;
                }
                l--; h++;
            }
            
            //odd length
            
            l = i-1;
            h = i+1;
            while(l>=0 && h<n && s[l]==s[h]){
                if(h-l+1 > maxLen){
                    start = l;
                    maxLen = h - l + 1;
                }
                l--;
                h++;
            }
            
        }
        string str = s.substr(start,maxLen);
        return str;
    }
};
