public class Wordlist {

    private String first;
    private Wordlist rest;

    public Wordlist(){
        this.first = "";
        this.rest = null;
    }

    private Wordlist (String word, Wordlist rest){
        this.first = word;
        this.rest = rest;
    }
    

    public Wordlist add(String word){
        return new Wordlist(word, this);
    }

    public boolean contains(String word){
        if (isEmpty()){
            return false;
        }
        else if (first.equals(word)){
            return true;
        }
        else{
            return rest.contains(word);
                }
    }
                        

    public boolean isEmpty(){
        return first == "";
    }

    public int size(){
        if (isEmpty()){
            return 0;
        }
        else{
            return 1 + rest.size();
        }
    }
    

    public String toString(){
        if (isEmpty()){
            return "";
        }
        else{
            String fullString = "";
            fullString += first + " ";
            return fullString += rest.toString();
            }
    }
}

            
  
