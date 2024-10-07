public class MujIterator {
    int pozice = 0;
    PostihIterator iterator;

    public MujIterator(PostihIterator it) {
        this.iterator = it;
    }

    public int next(){
        switch(pozice++) {
            case 0: return iterator.a;
            case 1: return iterator.b;
            case 2: return iterator.c;
        }
        return 0;
    }

    public boolean hasNext() {
        return this.pozice < 3;
    }
}
