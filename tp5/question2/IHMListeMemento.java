package question2;
import java.util.List;
import java.util.Map;


/**
 * Write a description of class IHMListeMemento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IHMListeMemento
{
    private List<String> liste;
    private Map<String, Integer> occurences;
    private String message;
     
    // Constructor of memento class
    public IHMListeMemento(List<String> liste, Map<String, Integer> occurences, String message) {
        super();
        this.liste = liste;
        this.occurences = occurences;
        this.message = message;
    }
     
    // Get list
    public List<String> getListe() {
        return liste;
    }
    
    // Get occurences
    public Map<String, Integer> getOccurences() {
        return occurences;
    }
    
    // Get message
    public String getMessage() {
        return message;
    }
}