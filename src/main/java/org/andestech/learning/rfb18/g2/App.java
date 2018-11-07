package org.andestech.learning.rfb18.g2;


import java.util.*;

import static java.util.Collections.sort;

/**
 * @author Admin
 *
 * @version 1.2.3
 *
 * <p> My class </p>
 *
 */

public class App

{
    private static class MySorter implements Comparator<Double>
    {
        private boolean forward;
        public MySorter(boolean forward)
        {
            this.forward = forward;
        }
        public MySorter()
        {
            this(true);
        }


        @Override
        public int compare(Double o1, Double o2) {
            return (int)(o1*o1-o2*o2)*(forward?1:-1);
        }
    }

    public static void main( String[] args )
    {

        ArrayList<Double> arrayList =
                new ArrayList<>();

        arrayList.add(1.22);
        arrayList.add(1.22);
        arrayList.add(2.11);
        arrayList.add(-3.0);
        arrayList.add(100.0);
        ///...

       // arrayList.remove(1);

        ArrayList<Integer> arrayList2 =
                new ArrayList<>();
        arrayList2.add(0);
        arrayList2.add(2);
        arrayList2.add(10);
        arrayList2.add(1);
        arrayList2.add(-20);

        arrayList2.remove(new Integer(10));

        System.out.println(arrayList);
        arrayList.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int)(o1*o1-o2*o2);
            }
        });
        System.out.println(arrayList);

        Collections.shuffle(arrayList);

        sort(arrayList, new MySorter(false));

     //   Collections.sort(arrayList);
      //  Collections.reverse(arrayList);

        System.out.println(arrayList);


        Collections.shuffle(arrayList);
        System.out.println("lambda sorting ----------------------------");
        System.out.println(arrayList);
//        arrayList.sort( (Double x, Double y) ->
//        {   //..
//            //..
//            return (int)(x-y);} );
        arrayList.sort( (o1,o2) -> (int)(o1-o2));

        System.out.println(arrayList);

//---------------------------------------

        ArrayList<Book> library =
                new ArrayList<>(10);

        library.add(new Book(1898, "Джек Лондон", "Белое Безмолвие" ));

        library.add(new Book(1889, "Джек Лондон", "Как аргонавты в старину" ));

        library.add(new Book(1879, "Лев Толстой", "Крейцерова соната" ));

        //

        Collections.sort(library);

        System.out.println(library);

        Collections.sort(library, (b1,b2) -> b1.getAuthor().compareTo(b2.getAuthor()));

        System.out.println(library);


        //---
        // ADS12387987, GGD9238098, YUU923847987, YHJ23209809



        ArrayList<String> accounts =
                new ArrayList<>();

        accounts.add("GGD9238098");
        accounts.add("AAA1238098");
        accounts.add("DFG2208098");
        accounts.add("GGD89238");
        accounts.add("GGD01238098");

        System.out.println(accounts);

         accounts.sort(new Comparator<String>() {
//             @Override
//             public int compare(String o1, String o2) {
//
//                 return o1.substring(3).compareTo(o2.substring(3));
//             }

             @Override
             public int compare(String o1, String o2) {

                 return Integer.parseInt(o1.substring(3)) -
                         Integer.parseInt(o2.substring(3));
             }
         });

        System.out.println(accounts);

        // Vector, Stack

        //-- множества

        Set<Integer> set = new LinkedHashSet<>();

        set.add(25); set.add(-12); set.add(25); set.add(1); set.add(10);

        for(int a:  set) {
            System.out.println( a);
        }
        set.remove(25);
        System.out.println(set);

// удаление дубликатов
        ArrayList<Integer> arrayList3 =
                new ArrayList<>();
        arrayList3.add(0);
        arrayList3.add(2);
        arrayList3.add(10);
        arrayList3.add(1);
        arrayList3.add(2);

   arrayList3 = new ArrayList<>( new HashSet<>(arrayList3));
        System.out.println(arrayList3);

   //----- maps


   Map map = new HashMap();

   Map<Integer, String> map2 = new HashMap<>();

   map2.put(12, "jhgjhgFFF");
        map2.put(1, "AAAA");
        map2.put(-12, "DOCS");
        map2.put(234, "jhgjhgFFF");
        map2.put(1, "GGGGGG");

   for (int id: map2.keySet() ) {
       System.out.println(map2.get(id));
   }

   System.out.println( map2.values() );











    }
}
