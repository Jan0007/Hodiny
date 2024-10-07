public class PostihIterator {
    int a, b, c;
    int index = 0;

    public PostihIterator(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public MujIterator dejMyIterator() {
        return new MujIterator(this);
    }

    public static void main(String[] args) {
        PostihIterator i = new PostihIterator(1, 2, 3);

        MujIterator it = i.dejMyIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
