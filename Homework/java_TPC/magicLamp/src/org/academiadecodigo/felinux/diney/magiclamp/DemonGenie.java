package org.academiadecodigo.felinux.diney.magiclamp;

public class DemonGenie extends Genie{
    private boolean recycled;
    private int count;

    public DemonGenie(int maxWishes) {
        super(maxWishes);
        this.recycled = false;
        this.count = 0;
    }

    public boolean isRecycled() {
        return recycled;
    }

    @Override
    public int grantWish(){
        if(count <= super.getMaxWishes() && !recycled){
            count++;
            return 1;
        }
        recycled = true;
        return -1;
    }
}
