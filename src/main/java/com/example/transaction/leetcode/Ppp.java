package com.example.transaction.leetcode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ppp {
    @Id
    int id;

    String color;
    int num;
    @Override
    public String toString(){
        return "PPp id "
        + id
        + " color " + color
        + " num " + num;
    }

    public static void main(String[] args) {
        Ppp black = new Ppp(44, "Black", 1000);
        Ppp white = new Ppp(22, "White", 5000);
        Ppp red = new Ppp(11, "Red", 2500);
        Ppp yellow = new Ppp(11, "Yellow", 1500);




        ArrayList<Ppp> list = new ArrayList<>(Arrays.asList(black, white, red, yellow));

        int result = list.stream()
                .filter(x -> x.num > 100)
                .filter(i -> i.id > 1)
                .reduce(999, (Integer, Ppp) -> Integer + Ppp.num, Integer::sum);

//        collect.forEach(System.err::println);
        System.out.println(result +" result");



        list.forEach((lol) -> lol.setNum(lol.getNum()* 7)) ;

LolAndMem ob = (a , b) -> b - a;

int t = 20;
int y = 88;
        int zzz = ob.fff(t, y);
        System.out.println(zzz);

        list.forEach(System.out::println);




        Fun <Integer, Integer, String> test = (a, b) -> String.valueOf(a * b);
        String sss = test.sss(100, 58);

        System.out.println(sss +" sss");

        Gop <String, String, Integer> gopStop = (a765, b936) -> Integer.parseInt(a765) * Integer.parseInt(b936);
        System.out.println(gopStop.ddd("12", "8") + " ddd");

        Stop <String , String, Integer> xaxa = (ccc, cccc) -> Integer.parseInt(ccc) - Integer.parseInt(cccc);
        Integer st = xaxa.st("29", "-100");
        System.out.println(st + "  I thint plus 129");


    }

    interface Stop<String, String1, Integer>{
        java.lang.Integer st(java.lang.String w, java.lang.String t);

    }
    @FunctionalInterface
    interface Gop<T, T1, R>{
        Integer ddd(String x, String y);
    }
    @FunctionalInterface
    interface Fun<T1, T2, R>{
        String sss(Integer a, Integer b);
    }

    interface LolAndMem{
        int fff(int x, int y );

    }



//    @Override
//    public int hashCode(){
//
//        int hash = getId() * 31;
//        hash += 31 * (getColor() != null ? getColor().hashCode() : 0);
//        hash += 31 * getNum();
//
//
//        return hash;
//    }



//    @Override
//    public boolean equals(Object o){
//        if (o == this) return true;
//        if (o == null) return false;
//        if (o.getClass() != this.getClass()) return false;
//
//        if (((Ppp) o).id == this.id && ((Ppp) o).color.equals(this.color) && ((Ppp) o).num == this.num) return true;
//
//        return false;
//    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ppp ppp)) return false;

        if (getId() != ppp.getId()) return false;
        if (getNum() != ppp.getNum()) return false;
        return getColor().equals(ppp.getColor());
    }



}
