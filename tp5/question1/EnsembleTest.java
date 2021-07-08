package question1;

public class EnsembleTest extends junit.framework.TestCase {

    public void testUnion() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        question1.Ensemble<Integer> union = e1.union(e2);
        assertEquals(3, union.size());
        assertTrue(union.contains(2));
        assertTrue(union.contains(3));
        assertTrue(union.contains(4));
    }
    
    public void testAdd() {
        question1.Ensemble<Integer> e1= new question1.Ensemble<Integer>();
        question1.Ensemble<String> e2= new question1.Ensemble<String>();
        question1.Ensemble<Boolean> e3= new question1.Ensemble<Boolean>();
        
        assertTrue(e1.add(0));
        assertTrue(e2.add("hello"));
        assertTrue(e3.add(false));
        
        assertFalse(e1.add(0));
        assertFalse(e2.add("hello"));
        assertFalse(e3.add(false));
    }
    
    public void testIntersection() {
        question1.Ensemble<Integer> e1 = new question1.Ensemble<Integer>();
        question1.Ensemble<Integer> e2= new question1.Ensemble<Integer>();
        assertTrue(e1.add(0));
        assertTrue(e1.add(1));
        assertTrue(e1.add(2));

        assertTrue(e2.add(0));
        assertTrue(e2.add(1));
        assertTrue(e2.add(4));

        question1.Ensemble<Integer> intersection = e1.inter(e2);
        assertEquals(2, intersection.size());
        assertTrue(intersection.contains(0));
        assertTrue(intersection.contains(1));
        assertFalse(intersection.contains(2));
        assertFalse(intersection.contains(4));
    }
    
    public void testDifference() {
        question1.Ensemble<Integer> e1 = new question1.Ensemble<Integer>();
        question1.Ensemble<Integer> e2= new question1.Ensemble<Integer>();
        assertTrue(e1.add(0));
        assertTrue(e1.add(1));
        assertTrue(e1.add(2));

        assertTrue(e2.add(0));
        assertTrue(e2.add(3));
        assertTrue(e2.add(4));

        question1.Ensemble<Integer> difference = e1.diff(e2);
        assertEquals(2, difference.size());
        assertTrue(difference.contains(1));
        assertTrue(difference.contains(2));
        assertFalse(difference.contains(0));
        assertFalse(difference.contains(3));
        assertFalse(difference.contains(4));
    }
    
    public void testSymDifference() {
        question1.Ensemble<Integer> e1 = new question1.Ensemble<Integer>();
        question1.Ensemble<Integer> e2= new question1.Ensemble<Integer>();
        assertTrue(e1.add(0));
        assertTrue(e1.add(1));
        assertTrue(e1.add(2));
        assertTrue(e1.add(3));

        assertTrue(e2.add(2));
        assertTrue(e2.add(3));
        assertTrue(e2.add(4));
        assertTrue(e2.add(5));

        question1.Ensemble<Integer> diffSym = e1.diffSym(e2);
        assertEquals(4, diffSym.size());
        assertTrue(diffSym.contains(0));
        assertTrue(diffSym.contains(1));
        assertTrue(diffSym.contains(4));
        assertTrue(diffSym.contains(5));
        assertFalse(diffSym.contains(2));
        assertFalse(diffSym.contains(3));
    }
}
