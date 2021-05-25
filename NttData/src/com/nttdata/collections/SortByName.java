package com.nttdata.collections;

import java.util.Comparator;

public class SortByName implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getPname().compareTo(o2.getPname());
	}
	

}
