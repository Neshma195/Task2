package com.epamtask;
import java.util.*;
public class Gift extends GiftAnalysis implements Chocolates{

        public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of gifts:");
        int n=s.nextInt();
        int[] weight_of_chocos = new int[n];
        String[] name=new String[n];
        int gift_weight[]=new int[n];
        GiftAnalysis g=new GiftAnalysis();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name of the sweet and chocolate");
            name[i]=s.next();
            gift_weight[i]=g.Gift_weight();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("Total weight of");
            System.out.print(name[i]);
            System.out.println(gift_weight[i]);
        }
        System.out.println("Enter range of weights");
        int n1=s.nextInt();
        int n2=s.nextInt();
        for(int i=0;i<n;i++)
            {
                if(gift_weight[i]>n1 && gift_weight[i]<n2)
                {
                    System.out.print(name[i]);
                    System.out.println(gift_weight[i]);
                }
            }
    }

}
