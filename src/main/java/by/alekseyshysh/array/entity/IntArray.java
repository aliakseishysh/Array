package by.alekseyshysh.array.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author AlekseyShysh
 *
 */
public class IntArray {
	
	private int[] elements;
	
	public IntArray() {
	}
	
	/**
	 * @return sets copy of elements array to avoid violating encapsulation
	 */
	public IntArray(int[] elements ) {
		this.elements = Arrays.copyOf(elements, elements.length);
	}
	
	public int getElement(int elementNumber) {
		return elements[elementNumber];
	}
	
	public void setElement(int index, int element) {
		elements[index] = element;
	}
	
	/**
	 * @return Copy of elements array to avoid violating encapsulation
	 */
	public int[] getElements() {
		return Arrays.copyOf(elements, elements.length);
	}
	
	/**
	 * @return sets copy of elements array to avoid violating encapsulation
	 */
	public void setElements(int[] elements) {
		this.elements = Arrays.copyOf(elements, elements.length);
	}
	
	// symmetry rule not violated here, test in IntArrayTest
	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof IntArray)) {
			return false;
		}
		var intArrayToCompare = (IntArray) object;
		return Arrays.equals(elements, intArrayToCompare.elements);
	}
	
	public List<Integer> toIntegerList() {
		List<Integer> list = new ArrayList<Integer>(elements.length);
		for (int element: elements) {
			list.add(Integer.valueOf(element));
		}
		return list;
	}
	
	@Override
	public String toString() {
		var stringBuilder = new StringBuilder();
		stringBuilder.append("[");
		for (int i = 0; i < elements.length - 1; i++) {
			stringBuilder.append(elements[i]);
			stringBuilder.append(",");
			stringBuilder.append(" ");
		}
		stringBuilder.append(elements[elements.length - 1]);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
	@Override
	public int hashCode() {
		if (elements == null) {
			return 0;			
		}
        int result = 1;
        for (int element : elements) {
        	result = 31 * result + element;        	
        }
        return result;
	}

}
