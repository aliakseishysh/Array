package by.alekseyshysh.array.action;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.utils.Constant;

public interface ArraySearch extends Constant {

	public int searchMaxElementWithStream(IntArray intArray) throws ArrayException;

	public int searchMaxElement(IntArray intArray) throws ArrayException;

	public int searchMinElementWithStream(IntArray intArray) throws ArrayException;

	public int searchMinElement(IntArray intArray) throws ArrayException;
}
