package collections;

import java.util.Iterator;

public class Demo1 {

    public static void main(String[] args) {

        String[] names = { "Alice", "Bob", "Charlie", "David", "Eve" };

        NameContainer nameContainer = new NameContainer(names);

        Iterator<String> iterator = nameContainer.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}

class NameContainer implements Iterable<String> {
    private String[] names;
    private int size;

    public NameContainer(String[] names) {
        this.names = names;
    }

    public Iterator<String> iterator() {
        return new NameContainerIterator();
    }

    private class NameContainerIterator implements Iterator<String> {
        private int index = 0;

        public boolean hasNext() {
            return index < names.length;
        }

        public String next() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException("No more elements");
            }
            return names[index++];
        }
    }

}
