package com.Strings;

public class RemoveSpaces {
    static void removeExtraSpaces(String str){
        int i =0;
        String s ="";
        while (i<str.length()-1){
            if(str.charAt(i)==' '&& str.charAt(i+1)!=' '){
                s=s+str.charAt(i+1);
            }else if(str.charAt(i)!=' '&&str.charAt(i+1)!=' '){
                s=s+str.charAt(i+1);
            }else if(str.charAt(i)!=' '&&str.charAt(i+1)==' '){
                s=s+str.charAt(i+1);
            }
            i++;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s = "  hi  sahsn       jkdsfdl  rf  ";
        removeExtraSpaces(s);
    }
}
