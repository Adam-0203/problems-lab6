package problem5;

public class Test {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book book2 = new Book("1984", "George Orwell", 1949);
        Book book3 = new Book("Clean Code", "Robert C. Martin", 2008);
        
        // Stack Test
        System.out.println("=== Stack Test ===");
        BookStack stack = new BookStack();
        stack.push(book1);
        stack.push(book2);
        stack.push(book3);
        
        stack.display();
        
        Book popped = stack.pop();
        System.out.println("Popped: " + popped);
        
        Book top = stack.peek();
        System.out.println("Top: " + top);
        
        stack.display();
        
        // Queue Test  
        System.out.println("=== Queue Test ===");
        BookQueue queue = new BookQueue();
        queue.enqueue(book1);
        queue.enqueue(book2);
        queue.enqueue(book3);
        
        queue.display();
        
        Book dequeued = queue.dequeue();
        System.out.println("Dequeued: " + dequeued);
        
        Book front = queue.peek();
        System.out.println("Front: " + front);
        
        queue.display();
    }
}