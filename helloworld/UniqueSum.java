package com.qa.helloworld;

public class UniqueSum {

	public static void main(String[] args) {
		unique(14,15,16);

	}
	
	public static void unique(int fst, int snd, int trd) {
		if (fst==snd) {
			fst = 0;
		} else if (snd==trd) {
			snd = 0;
		} else if (trd==fst) {
			trd = 0;
		}
		System.out.println(fst+snd+trd);
	}

}
