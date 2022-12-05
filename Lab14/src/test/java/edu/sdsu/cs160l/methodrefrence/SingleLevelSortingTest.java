package edu.sdsu.cs160l.methodrefrence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingleLevelSortingTest {

    private SingleLevelSorting singleLevelSorting;

    @BeforeEach
    void setUp() {
        singleLevelSorting = new SingleLevelSorting();
    }

    @Test
    void sortByGpa() {
        System.out.println("Running Sort By GPA");
        singleLevelSorting.sortByGpa()
                .forEach(System.out::println);
        System.out.println("End Sort By GPA");
    }

    @Test
    void sortByGpaWithLambda() {
        System.out.println("Running Sort By GPA Then Lambda");
        singleLevelSorting.sortByGpaWithLambda()
                .forEach(System.out::println);
        System.out.println("End Sort By GPA Then Lambda");
    }

    @Test
    void sortByGpaWithComparatorComparing() {
        System.out.println("Running Sort By GPA With Comparator");
        singleLevelSorting.sortByGpaWithComparatorComparing()
                .forEach(System.out::println);
        System.out.println("End Sort By GPA With Comparator");
    }

    @Test
    void sortByGpaWithComparatorComparingAndMethodReference() {
        System.out.println("Running Sort By GPA WithComparatorComparingAndMethodReference");
        singleLevelSorting.sortByGpaWithComparatorComparingAndMethodReference()
                .forEach(System.out::println);
        System.out.println("End Sort By GPA WithComparatorComparingAndMethodReference");
    }
}
