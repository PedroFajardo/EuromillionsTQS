package sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * a simple set of numbers with helper set operators
 * @author ico0
 */
public class SetOfNumbers  implements Iterable<Integer> {
	
	private ArrayList<Integer> collection = null;
	

	public static SetOfNumbers fromArray( int[] values) {
		SetOfNumbers newSet = new SetOfNumbers();
		for( int n : values) {
			newSet.add( n);
		}
		return newSet;
	}
	
	public SetOfNumbers() {
		super();
		collection = new ArrayList<>();
	}
        
        public int size() {
            return this.collection.size();
        }

        /**
         * put a new member in the set; duplicates not allowed
         * @param element 
         */
	public void add(int element) {
		if( this.collection.contains(element )) {
			throw new IllegalArgumentException("duplicate value: " + element);
		}
		
		collection.add( element);		
	}

	public boolean intersects(SetOfNumbers subset) {
		for(int n : collection)
			for(int n2 : subset)
				if(n == n2)
					return true;
		return false;
	}

	public  boolean contains(Integer element) {
		return collection.contains( element);
	}

	@Override
	public Iterator<Integer> iterator() {		
		return collection.iterator();
	}


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.collection);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SetOfNumbers other = (SetOfNumbers) obj;

        return Objects.equals(this.collection, other.collection);
    }
              
	
}