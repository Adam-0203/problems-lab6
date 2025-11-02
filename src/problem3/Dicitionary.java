package problem3;

public class Dicitionary extends Document {
    private String language;

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();  
        res.append("the dictionnary "+id+", its tile : "+title+".\n");
        res.append("The language : "+language+".\n");
        return res.toString();
    }

    public Dicitionary(String title,String language){
        super(title);
        this.language = language;
    }
}
