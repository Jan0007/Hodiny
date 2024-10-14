package Hodina4;

public class MyIterator {
    int seznam[] = {1, 2, 3, 4, 5};
    int index = 0;

    public int next(){
        int v = this.seznam[this.index];
        this.index++;
        return v;
    }

    public boolean hasNext() {
        if (this.index + 1 <= seznam.length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyIterator i = new MyIterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
