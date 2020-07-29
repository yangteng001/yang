import com.sun.javafx.collections.MappingChange;

import javax.swing.text.Style;
import java.util.*;

public class Poker1 {
     public static void main(String[] args){
         ArrayList<String>color=new ArrayList<String>();
         color.add("♠");
         color.add("♥");
         color.add("♦");
         color.add("♣");
         ArrayList<String>num=new ArrayList<String>();
         Collections.addAll(num,"3","4","5","6","7","8","9","10","J","Q","K","A","2");
         HashMap<Integer,String>poker=new HashMap<Integer, String>();
         int index=0;
         poker.put(index++, "小☺");
         poker.put(index++, "大☻");
         for(String thisnum:num){
             for(String thiscolor:color){
                 String a=thiscolor+thisnum;
                 poker.put(index++,a);
             }
         }
         ArrayList<Integer>card=new ArrayList<Integer>();
         for(int i=0;i<=53;i++){
             card.add(i);
         }
         Collections.shuffle(card);
         ArrayList<Integer>playnum1=new ArrayList<Integer>();
         ArrayList<Integer>playnum2=new ArrayList<Integer>();
         ArrayList<Integer>playnum3=new ArrayList<Integer>();
         ArrayList<Integer>scradnum=new ArrayList<Integer>();
         for(int j=0;j<card.size();j++){
             if(j>=51){
                 scradnum.add(card.get(j));
             }
             else {
                 if(j%3==0){
                     playnum1.add(card.get(j));
                 }
                 else if(j%3==1){
                     playnum2.add(card.get(j));
                 }
                 else {
                     playnum3.add(card.get(j));
                 }
             }
         }
         Collections.sort(playnum1);
         Collections.sort(playnum2);
         Collections.sort(playnum3);
         ArrayList<String>player1=new ArrayList<String>();
         ArrayList<String>player2=new ArrayList<String>();
         ArrayList<String>player3=new ArrayList<String>();
         ArrayList<String>scard=new ArrayList<String>();
         for(int p1:playnum1){
             player1.add(poker.get(p1));
         }
         for(int p2:playnum2){
             player2.add(poker.get(p2));
         }
         for(int p3:playnum3){
             player3.add(poker.get(p3));
         }
         for(int s1:scradnum){
             scard.add(poker.get(s1));
         }
         System.out.println(player1);
         System.out.println(player2);
         System.out.println(player3);
         System.out.println(scard);
     }
}
