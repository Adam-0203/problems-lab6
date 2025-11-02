package problem3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("The library : \n");
        for (int i=0; i<documents.size(); i++){
            res.append(documents.get(i).toString());
        } 
        return res.toString();
    }

    public Library(int capacity){
        this.capacity = capacity;
        documents = new ArrayList<>(capacity);
    }

    public boolean addDoc(Document doc){
        if (documents.size() >= capacity){
            System.out.println("the library has reached its maximun capacity.");
            return false;
        }
        documents.add(doc);
        return true;
    }

    public boolean deleteDoc(Document doc){
        return documents.remove(doc);
    }

    Document document(int numEnrg){
        for (Document doc : documents){
            if (doc.getId() == numEnrg){
                return doc;
            }
        }
        return null;
    }

    public void displayDocuments(){
        for (Document doc : documents){
            System.out.println(doc);
        }
    }

    public void displayAuthors(){
        Set<String> authorSet = new HashSet<>();
        for (Document doc : documents){
            if (doc instanceof Book){
                authorSet.add(((Book) doc).getAuthor());
            }
        }
        System.out.println("the authors : ");
        for (String name : authorSet){
            System.out.println(name+" ");
        }
    }
}
