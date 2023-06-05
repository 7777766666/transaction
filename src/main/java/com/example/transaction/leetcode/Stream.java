//package com.example.transaction.leetcode;
//
//import jakarta.persistence.criteria.CriteriaBuilder;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.TreeMap;
//import java.util.stream.Collectors;
//
//public class Stream {
//
//    private static List<Car> carList = new ArrayList<>();
//
////    static
////    {
////        Car car = new Car("Tesla", 300);
////        Car car1 = new Car("BMW", 100);
////        Car car2 = new Car("Kamaz", 55);
////
////        carList.addAll(Arrays.asList(car, car1, car2));
////
////    }
//
//    private static Map<String, Integer> map = new HashMap<>();
//    static
//    {
//
//        map.put("One", 1);
//        map.put("Two", 2);
//        map.put("Three", 3);
//        map.put("Four", 4);
//        map.put("Five", 5);
//    }
//
//
//    public static void main(String[] args) {
//
//        List<Car> collect = carList.stream()
//                .filter(e -> e.getSpeed() > 11)
//                .map(r -> new Car(r.getModel(), r.getSpeed() + 11))
//                .sorted(new Comparator<Car>() {
//                    @Override
//                    public int compare(Car o1, Car o2) {
//                        return o2.getModel().compareTo(o1.getModel());
//                    }
//                })
//                .collect(Collectors.toList());
//
//        System.out.println(collect);
//
//        Map<Integer, String> ttt = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o2, Integer o1) {
//
//                return o1 - o2;
//            }
//        });
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//
//
//
//
//        System.out.println(ttt);
//
////        for (int i = 0; i < ttt.size(); i++) {
////            System.out.println(ttt.get(i)) ;
////        }
//
//
//    }
//
//
//
//}
