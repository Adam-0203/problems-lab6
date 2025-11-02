package problem3;

public class Magazine extends Document {
    private String month;
    private int year;

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();  
        res.append("the Magazine "+id+", its tile : "+title+".\n");
        res.append("The month : "+month+", the year : "+year+".\n");
        return res.toString();
    }

    public Magazine(String title,String month,int year){
        super(title);
        this.month = month;
        this.year = year;
    }
}
