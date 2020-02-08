package com.epamtask;
import java.util.*;
public class GiftAnalysis extends Sweets implements Chocolates {
    public int weight_of_chocos(int no_of_chocolates,int wg)
    {
        return (no_of_chocolates*wg);
    }
    public int Gift_weight()
    {
        int weight_of_choco = 0;
        int gift_weight=0;
        Scanner s=new Scanner(System.in);
        Sweets S = new Sweets();
        Chocolates C = new GiftAnalysis();
        System.out.println("Enter number of chocolates and weight of chocolate");
        int cn=s.nextInt();
        int cw=s.nextInt();
        System.out.println("Enter number of sweets and weight of sweet");
        int sn=s.nextInt();
        int sw=s.nextInt();
        gift_weight = C.weight_of_chocos(cn,cw) + S.sweets_weight(sn,sw);
        return gift_weight;
    }
}
