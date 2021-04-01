package by.alekseyshysh.array.action;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;

public interface ArraySearch {

	public int searchMaxElementWithStream(IntArray intArray) throws ArrayException;

	public int searchMaxElement(IntArray intArray) throws ArrayException;

	public int searchMinElementWithStream(IntArray intArray) throws ArrayException;

	public int searchMinElement(IntArray intArray) throws ArrayException;
}
