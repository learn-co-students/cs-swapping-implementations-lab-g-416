package com.flatironschool.javacs;

import java.util.ArrayList;
import java.util.List;

public class ListClientExample {
	private ArrayList list;

	public ListClientExample() {
		list = new ArrayList();
	}

	public ArrayList getList() {
		return list;
	}

	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		ArrayList list = lce.getList();
		System.out.println(list);
	}
}
