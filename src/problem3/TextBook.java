package problem3;

public class TextBook extends Book{
    public String level;    

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();  
        res.append("the TextBook "+numRec+", its tile : "+title+".\n");
        res.append("The author : "+author+", the number of pages : "+nbrPages+".\n");
        res.append("The lavel : "+level+".");
        return res.toString();
    }

    public TextBook(String title,String author,int nbrPages, String level){
        super(title, author, nbrPages);
        this.level = level;
    }
}
