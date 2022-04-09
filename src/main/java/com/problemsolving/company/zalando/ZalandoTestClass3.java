package com.problemsolving.company.zalando;

public class ZalandoTestClass3 {
    public static void main(String[]args){
        ZalandoTestClass3 ts1=new ZalandoTestClass3();
//        String s = "?ab??a";
//        String s = "?a?";

//        String s = "bab??a";
        String s = "??b";
        System.out.println(ts1.Solution(s));
    }

    public String Solution(String S) {
        StringBuilder sb=new StringBuilder(S);
        int i=0;
        int j=S.length()-1;
        if(S.length()==1){
            return "a";
        }
        while (i<j){
            if(sb.charAt(i)=='?' && sb.charAt(j)!='?'){
                sb.replace(i,i+1, String.valueOf(sb.charAt(j)));
            }else if(sb.charAt(j)=='?' && sb.charAt(i)!='?'){
                sb.replace(j,j+1, String.valueOf(sb.charAt(i)));
            }else if(sb.charAt(j)=='?' && sb.charAt(i)=='?'){
                sb.replace(j,j+1, "a");
                sb.replace(i,i+1, "a");
            }else{
                return "NO";
            }
            i++;
            --j;
        }
        if(sb.charAt(i)=='?'){
            sb.replace(i,i+1, "a");
        }
        return sb.toString();
    }
}
