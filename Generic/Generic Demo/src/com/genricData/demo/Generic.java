package com.genricData.demo;

class Data<T> {
	private T obj;

	/**
	 * @param v So set method is using for storing some type value in this one
	 *          [obj]. It will take an object of type generic and it will assign it
	 *          to obj.
	 */
	public void setData(T v) {
		obj = v;
	}

	/**
	 * @return Method for reading the value.
	 */
	public T getData() {
		return obj;
	}

}

public class Generic {

	public static void main(String[] args) {
		Data<Integer> d = new Data<Integer>();
		d.setData(10); // So 10 here will be an integer type object and it will be assigned to the obj. (Autoboxing is happening here)

		System.out.println(d.getData());

	}

}
