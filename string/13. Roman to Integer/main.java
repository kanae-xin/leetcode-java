class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                if(i + 1 == s.length() || s.charAt(i + 1) == 'I')
                    res ++;
                else if(s.charAt(i + 1) == 'V'){
                    res += 4;
                    i++;
                }
                else if(s.charAt(i + 1) == 'X'){
                    res += 9;
                    i++;
                }
            }
            else if(s.charAt(i) == 'V')
                res += 5;
            else if(s.charAt(i) == 'X'){
                if(i + 1 == s.length())
                    res += 10;
                else if(s.charAt(i + 1) == 'L'){
                    res += 40;
                    i++;
                }
                else if(s.charAt(i + 1) == 'C'){
                    res += 90;
                    i++;
                }
                else
                    res += 10;
            }
            else if(s.charAt(i) == 'L')
                res += 50;
            else if(s.charAt(i) == 'C'){
                if(i + 1 == s.length())
                    res += 100;
                else if(s.charAt(i + 1) == 'D'){
                    res += 400;
                    i++;
                }
                else if(s.charAt(i + 1) == 'M'){
                    res += 900;
                    i++;
                }
                else
                    res += 100;
            }
            else if(s.charAt(i) == 'D')
                res += 500;
            else if(s.charAt(i) == 'M')
                res += 1000;
        }
        return res;
    }
}
/*
Better solution
----------
class Solution {
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for(int i= s.length()-1;i>=0;i--){
         switch(s.charAt(i)){
             case 'I': num = 1; break;
             case 'V': num = 5; break;
             case 'X': num = 10; break;
             case 'L': num = 50; break;
             case 'C': num = 100; break;
             case 'D': num = 500; break;
             case 'M': num = 1000; break;
             
                     }
         if (4* num < ans) ans -=num;
         else ans += num;


        }
        return ans;
    }
}
*/