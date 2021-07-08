package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

	protected java.util.Vector<T> table = new java.util.Vector<T>();

	public int size() {
		return table.size();
	}

	public Iterator<T> iterator() {
		return table.iterator();
	}

	// Add method
	public boolean add(T t) {
	    // Check if table contains the element and the element is not null
	    if (t == null || table.contains(t)) return false;
	    return table.add(t);
	}

	public Ensemble<T> union(Ensemble<? extends T> e) {
	    if(e == null || e.size() <= 0) return null;
	    // Create temporary Ensemble
	    Ensemble<T> eTemp = new Ensemble<T>();
	    // Store copy of table
	    eTemp.addAll(this.table);
	    // Add values to the Ensemble that are not contained
	    eTemp.addAll(e);
	    // Return value
	    return eTemp;
	}

	public Ensemble<T> inter(Ensemble<? extends T> e) {
	    if(e == null || e.size() <= 0) return null;
	    // Create temporary Ensemble
	    Ensemble<T> eTemp = new Ensemble<T>();
	    // Store copy of table
	    eTemp.addAll(this.table);
    	    // Retain only the ones in common
    	    eTemp.retainAll(e);
    	    // Return value
    	    return eTemp;
	}

	public Ensemble<T> diff(Ensemble<? extends T> e) {
	    if(e == null || e.size() <= 0) return null;
	    // Create temporary Ensemble
	    Ensemble<T> eTemp = new Ensemble<T>();
	    // Store copy of table
	    eTemp.addAll(this.table);
	    // Get the difference
	    eTemp.removeAll(eTemp.inter(e));
	    // Return value
	    return eTemp;
	}

	Ensemble<T> diffSym(Ensemble<? extends T> e) {
	    if(e == null || e.size() <= 0) return null;
	    // Create temporary Ensemble
	    Ensemble<T> eTemp = new Ensemble<T>();
	    // Create temporary Ensemble to hold the union
	    Ensemble<T> unionTemp = new Ensemble<T>();
	    // Store copy of table
	    eTemp.addAll(this.table);
	    // union the two collections
	    unionTemp = eTemp.union(e);
	    // Get the symetric difference
	    unionTemp.removeAll(eTemp.inter(e));
	    // Return value
	    return unionTemp;
	}
}
