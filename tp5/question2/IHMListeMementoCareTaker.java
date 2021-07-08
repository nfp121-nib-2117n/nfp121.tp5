package question2;
import java.util.LinkedList;


/**
 * Write a description of class IHMListeMementoCareTaker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IHMListeMementoCareTaker {
    
    protected LinkedList<IHMListeMemento> mementoHistory;

    public IHMListeMementoCareTaker() {
        mementoHistory = new LinkedList<IHMListeMemento>();
    }
    
    public void saveData(IHMListeMemento memento) {
        if (memento == null) return;
        mementoHistory.add(memento);
    }

    public IHMListeMemento getData() {
        if (mementoHistory == null || mementoHistory.size() <= 0) return null;
        return mementoHistory.removeLast();
    }
}
