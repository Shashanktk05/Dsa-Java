package com.array;

import java.util.Scanner;

public class NoofNotes {
    static void printNotes(int [] notes,int amt){
        int i =0;
        while(amt!=0){
            int count = amt/notes[i];
            if(count>0){
                System.out.println(notes[i]+" X "+count);
                amt=amt%notes[i];
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int [] notes={500,200,100,50,20,10,2,1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amt");
        int amt= sc.nextInt();
        printNotes(notes,amt);
    }
}
