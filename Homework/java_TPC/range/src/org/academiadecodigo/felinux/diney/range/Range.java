package org.academiadecodigo.felinux.diney.range;

import java.util.Iterator;

public class Range implements Iterable<Integer> {
    private int max;
    private int min;
    private boolean ascend;

    public Range(int min, int max) {
        this.max = max;
        this.min = min;
        ascend = true;
    }



    @Override
    public Iterator <Integer> iterator() {

        if (ascend) {
            return new Iterator() {
                int current = min;

                @Override
                public boolean hasNext() {
                    return current <= max;
                }

                @Override
                public Integer next() {
                    return current++;
                }
            };
        }

        return new Iterator() {
            int current = max;
            @Override
            public boolean hasNext() {
                return current >= min ;
            }

            @Override
            public Integer next() {
                return current--;
            }
        };
    }


    public void setAscend(boolean ascend) {
        this.ascend = ascend;
    }
}
