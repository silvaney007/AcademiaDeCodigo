package org.academiadecodigo.felinux.diney.magiclamp.genie;

public class DemonGenie extends Genie{
    private boolean recycled;
    private int count;

    public DemonGenie(int maxWishes) {
        super(maxWishes);
        this.count = 0;
    }

    public boolean isRecycled() {
        return recycled;
    }

    @Override
    public void grantWish(){
        if(count <= super.getMaxWishes() && !recycled){
            count++;
            return;
        }
        recycled = true;
    }
}
