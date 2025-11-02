package problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();  
        res.append("the Book "+id+", its tile : "+title+".\n");
        res.append("The author : "+author+", the number of pages : "+nbrPages+".\n");
        return res.toString();
    }

    public String getAuthor(){
        return author;
    }

    public Book(String title,String author,int nbrPages){
        super(title);
        this.author = author;
        this.nbrPages = nbrPages;
    };

}
