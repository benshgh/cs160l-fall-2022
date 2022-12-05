package edu.sdsu.cs160l.methodrefrence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiLevelSortingTest {
    private MultiLevelSorting multiLevelSorting;

    @BeforeEach
    void setUp() {
        multiLevelSorting = new MultiLevelSorting();
    }

    @Test
    void sortByGpaAndName() {
        System.out.println("Running Sort By GPA");
        multiLevelSorting.sortByGpaAndName()
                .forEach(System.out::println);
        System.out.println("End Sort By GPA");
    }

    @Test
    void sortByGpaWithLambda() {
        System.out.println("Running Sort By GPA With Lambda");
        multiLevelSorting.sortByGpaWithLambda()
                .forEach(System.out::println);
        System.out.println("End Sort By GPA With Lambda");
    }

    @Test
    void sortByGpaAndNameWithComparatorComparing() {
        System.out.println("Running Sort By GpaAndNameWithComparatorComparing");
        multiLevelSorting.sortByGpaAndNameWithComparatorComparing()
                .forEach(System.out::println);
        System.out.println("End Sort By GpaAndNameWithComparatorComparing");
    }
}
