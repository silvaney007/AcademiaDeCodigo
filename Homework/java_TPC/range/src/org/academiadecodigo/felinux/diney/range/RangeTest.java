package org.academiadecodigo.felinux.diney.range;

public class RangeTest {
    public static void main(String[] args) {

        System.out.println("Ascend Mood");
        Range range = new Range(10,25);

        for (Integer r : range) {
            System.out.println(r);
        }

        System.out.println("Descend Mood");
        range.setAscend(false);

        for (Integer r : range) {
            System.out.println(r);
        }
    }
}
