/**
 * exemplifies the use of binary search methods for Collections and arrays
 * binary search returns the searched item position if the item exists in the list or a negative
 * number in the form -p -1, where p is the position the item should be at if it were in the list.
 */
package com.lgcirilo.javacore.collections.classes;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

class Mammal implements Comparable<Mammal>{

    String order;
    String species;

    Mammal(String order, String species) {
        this.order = order;
        this.species = species;
    }

    public int compareTo(Mammal other) {
        if (this.order.compareTo(other.order) == 0) {
            return this.species.compareTo(other.species);
        }
        return this.order.compareTo(other.order);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "order='" + order + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}

class MammalSpeciesComparator implements Comparator<Mammal> {
    @Override
    public int compare(Mammal first, Mammal second) {
        return first.species.compareTo(second.species);
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        // binary search for primitive type collections
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(2);
        integerList.add(5);
        integerList.add(4);
        // Always sort before using binary search
        Collections.sort(integerList);
        System.out.println(Collections.binarySearch(integerList,2));

        // binary search for primitive type arrays
        int[] intArray = {1, 3, 2, 5, 4};
        // Always sort before using binary search
        Arrays.sort(intArray);
        System.out.println(Arrays.binarySearch(intArray, 2));

        Mammal mammal1 = new Mammal("rodentia", "capybara");
        Mammal mammal2 = new Mammal("rodentia", "springhare");
        Mammal mammal3 = new Mammal("chiroptera", "bat");
        Mammal mammal4 = new Mammal("primates", "lemur");
        Mammal mammal5 = new Mammal("primates", "human");
        List<Mammal> mammalList = new ArrayList<>();
        mammalList.add(mammal1);
        mammalList.add(mammal2);
        mammalList.add(mammal3);
        mammalList.add(mammal4);
        mammalList.add(mammal5);
        Mammal existsInList = new Mammal("primate", "human");
        Mammal doesNotExistsInList = new Mammal("rodentia", "house mouse");

        // binary search for Object collections
        // uses Comparable.compareTo from Mammal class
        // always sort before using binary search
        Collections.sort(mammalList);
        for (Mammal mammal: mammalList) {
            System.out.println(mammal);
        }
        System.out.println(Collections.binarySearch(mammalList, existsInList));
        System.out.println(Collections.binarySearch(mammalList, doesNotExistsInList));

        // binary search for Object arrays
        // uses Comparable.compareTo from Mammal class
        Mammal[] mammalArray = {mammal1, mammal2, mammal3, mammal4, mammal5};
        // always sort before using binary search
        Arrays.sort(mammalArray);
        System.out.println(Arrays.binarySearch(mammalArray, existsInList));
        System.out.println(Arrays.binarySearch(mammalArray, doesNotExistsInList));

        // binary search for Object collections using MammalSpeciesComparator
        // always sort before using binary search
        Collections.sort(mammalList, new MammalSpeciesComparator());
        // The comparator must be used when calling binary search method
        System.out.println(Collections.binarySearch(mammalList, existsInList, new MammalSpeciesComparator()));
        System.out.println(Collections.binarySearch(mammalList, doesNotExistsInList, new MammalSpeciesComparator()));

        // binary search for Object arrays using MammalSpeciesComparator
        // always sort before using binary search
        Arrays.sort(mammalArray, new MammalSpeciesComparator());
        // The comparator must be used when calling binary search method
        System.out.println(Arrays.toString(mammalArray));
        System.out.println(Arrays.binarySearch(mammalArray, doesNotExistsInList, new MammalSpeciesComparator()));
    }
}
