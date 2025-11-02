package problem3;

public class Novel extends Book{
    public double price; 

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();  
        res.append("the Novel "+id+", its tile : "+title+".\n");
        res.append("The author : "+author+", the number of pages : "+nbrPages+".\n");
        res.append("The price : "+price+".");
        return res.toString();
    }

    public Novel(String title,String author,int nbrPages, double price){
        super(title, author, nbrPages);
        this.price = price;
    }

}
