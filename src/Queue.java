import java.util.Arrays;

public class Queue<E> {

    private int size;
    private E[] elements;


    public Queue() {
        elements = (E[])new Object[10];
        size = 0;
    }

    void add(E value) {
        if(size > elements.length) {
            expandSize();
        }
        elements[size] = value;
        size++;
    }

    E remove() {
        if(size == 0) {
            return null;
        }
        E temp = elements[0];
        E[] newArr = (E[]) new Object[this.elements.length-1];
        for (int i = 0, k = 0; i < elements.length; i++) {
            if (i == 0) {

                continue;
            }
            newArr[k++] = elements[i];
        }
        this.elements = newArr;
        size--;
        return elements[size];
    }



    private void expandSize() {
        int increasedSize = elements.length * 2;
        elements = Arrays.copyOf(elements, increasedSize);
    }

    void print() {
        for(int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println("");
    }

void removeAll(){

    E[] newArr = (E[]) new Object[this.elements.length];
    elements = newArr;
    size=0;


}
}