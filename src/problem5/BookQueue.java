package problem5;

import java.util.LinkedList;
import java.util.ListIterator;

public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue(){queue = new LinkedList<>();};

    public void enqueue(Book book){
        queue.addLast(book);
    }
    public Book dequeue(){
        if (!queue.isEmpty()){
            return queue.removeFirst();
        }
        return null;
    }

    public Book peek(){
        if (!queue.isEmpty()){
            return queue.getFirst();
        }
        return null;
    }

    public void display() {
        System.out.println("Queue contents (front to back):");
        ListIterator<Book> iter = queue.listIterator(0);
        while (iter.hasNext()){
            System.out.print(" - "+iter.next()+"\n");
        }
    }

}
