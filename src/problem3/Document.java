package problem3;

public class Document {
    protected static int numRec = 0;
    protected String title;
    protected int id;

    @Override
    public String toString(){
        return "the Document "+numRec+", its tile : "+title+".\n";
    }

    public int getId(){return id;}

    public Document(String title){
        this.title = title;
        this.id = numRec+1;
        numRec++;
    }
}
