package com.problemsolving.company.zalando;

public class StringRemove {
    public static void main(String []args){
        StringRemove remove=new StringRemove();
        System.out.println(remove.solution("CBACD"));
        System.out.println(remove.solution("CABABD"));
        System.out.println(remove.solution("CABABD"));
    }
    public String solution(String S){
       char[] oldArray= S.toCharArray();
       char[] newArray= S.toCharArray();
       boolean flag=true;
       System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        int count=0;
       while (flag){
           flag=false;
           count=0;
           for (int i=0;i<oldArray.length-1 ;i++){
               if((oldArray[i]=='C' && oldArray[i+1]=='D')||(oldArray[i]=='D' && oldArray[i+1]=='C') ||(oldArray[i]=='A' && oldArray[i+1]=='B')||(oldArray[i]=='B' && oldArray[i+1]=='A')){
                   oldArray[i]='X';
                   oldArray[i+1]='X';
                   flag=true;
                   ++i;
                   count+=2;
               }
           }
           oldArray=  copyArray(oldArray,count);
       }

       return new String(oldArray);
    }
    public char[] copyArray(char [] oldArray,int size){
        char []newArray= new char[oldArray.length-size];
        int i=0;
        for(int j=0; j<oldArray.length;j++){
            char ch=oldArray[j];
            if(ch != 'X'){
                newArray[i++]=oldArray[j];
            }
        }
        return newArray;
    }

}
