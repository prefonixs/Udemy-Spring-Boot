package com.in28minutes.mockito.mockito_demo.business;

public class SomeBusinessImpl {

	private DataService dataService;

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findTheGreatestFromAllData() {
		int[] data = dataService.retriveAllData();
		int max = Integer.MIN_VALUE;
		for (int i : data) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}

interface DataService {
	int[] retriveAllData();
}