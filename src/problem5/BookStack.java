package problem5;

import java.util.LinkedList;
import java.util.ListIterator;

public class BookStack {
    private LinkedList<Book> stack;

    public BookStack() {stack = new LinkedList<>();}

    public void push(Book book) {
        stack.addLast(book);
    }

    public Book pop() {
        if (!stack.isEmpty()){
            Book res = stack.getLast();
            stack.removeLast();
            return res;
        }
        return null;
    }

    public Book peek() {
        if (!stack.isEmpty()){
            return stack.getLast();
        }
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents (top to bottom):");
        ListIterator<Book> iter =  stack.listIterator(stack.size());
        while (iter.hasPrevious()){
            System.out.print(" - "+iter.previous()+"\n");
        }
    }
}

