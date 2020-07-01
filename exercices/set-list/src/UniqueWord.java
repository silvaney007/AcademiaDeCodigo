import java.util.HashSet;
import java.util.Iterator;

public class UniqueWord implements Iterable <UniqueWord>{

    private HashSet<UniqueWord> hashSet;
    private String text;

    public UniqueWord(String text) {
        this.text = text;
        hashSet = new HashSet<>();
    }

    @Override
    public Iterator iterator() {

        return null;
    }

    private class myIteraror{

    }
}
