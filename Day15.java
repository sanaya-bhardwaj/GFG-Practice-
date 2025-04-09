

// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder result=new StringBuilder();
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry =0;
        while(i>=0||j>=0||carry!=0){
            int bit1=(i>=0)?s1.charAt(i--)-'0':0;
            int bit2=(j>=0)?s2.charAt(j--)-'0':0;
            int sum=bit1+bit2+carry;
            result.append(sum%2);
            carry=sum/2;
        }
        result.reverse();
        int startindex=0;
        while(startindex<result.length()-1&&result.charAt(startindex)=='0'){
            startindex++;
        }
        return result.substring(startindex);
    }
}
