package org.andestech.learning.rfb18.g2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

        Collections.sort(arrayList, new MySorter());

     //   Collections.sort(arrayList);
      //  Collections.reverse(arrayList);

        System.out.println(arrayList);










    }
}
