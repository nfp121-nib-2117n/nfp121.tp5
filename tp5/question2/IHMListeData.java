package question2;
import java.util.List;
import java.util.Map;


/**
 * Write a description of class IHMListeData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IHMListeData {
    private List<String> liste;
    private Map<String, Integer> occurences;
    private String message;

    public IHMListeData() {
    }
    
    public void setListe(List<String> liste) {
        this.liste = liste;
    }
    
    public void setOccurence(Map<String, Integer> occurences) {
        this.occurences = occurences;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Create position memento based on current liste and occurences
     * @return new memento object
     */
    public IHMListeMemento createMemento() {
        return new IHMListeMemento(liste, occurences, message);
    }

    /**
     * Restore to given liste and occurences saved in memento
     * @param memento input memento
     */
    public void setMemento(IHMListeMemento memento) {
        this.liste = memento.getListe();
        this.occurences = memento.getOccurences();
        this.message = memento.getMessage();
    }
}
