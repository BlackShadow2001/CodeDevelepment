package com.lowlevel.design.observer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Channel {

	private String title;
	private ArrayList<Subscriber> subscriberList = new ArrayList();

	static class Tuple {
		int min;
		int max;

		Tuple(int min, int max) {
			this.min = min;
			this.max = max;
		}
	}

	static Tuple solution(char[] arr, int low, int high) {
		int start = low, end = low;
		while (low <= high) {
			if (arr[start] - '0' <= arr[low] - '0') {
				start = low;
			}
			low++;
		}
		return new Tuple(start, 0);
	}

	public static String findMaximumNum(String str, int k) {
		char[] arr = str.toCharArray();
		int j = 0;
		for (int i = 0; j < k; i++) {
			Tuple t = solution(arr, i + 1, arr.length - 1);
			if (arr[t.min] > arr[i]) {
				char c = arr[t.min];
				arr[t.min] = arr[i];
				arr[i] = c;

				j++;
			}
			System.out.println("i - " + i + " j - " + j + " min - " + t.min + " s - " + String.valueOf(arr));
		}
		return String.valueOf(arr);
	}

	public static void main(String[] args) {
		char[] digits = { '1', '2', '3' };
		int[] d = { 2, 3, 4 };
		if ('a' > 92)
			System.out.println((char) 90);
		int number = Integer.parseInt("867");
		if (number > 3)
			System.out.println("sgsgeg");
		findMaximumNum("92343219", 4);
		char[] charArray = "".toCharArray();
		charArray.toString();
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println(al.get(0));
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('c', map.getOrDefault('c', 0) + 1);
		String[] array = map.entrySet().stream().sorted((a, b) -> {
			if (b.getValue() == a.getValue())
				return a.getKey() - a.getKey();
			return b.getValue() - a.getValue();
		}).toArray(String[]::new);
		PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
		Queue<Integer> q1 = new ArrayDeque<Integer>();
		HashMap<Character, ArrayList<Integer>> map1 = new HashMap<>();
		map1.entrySet().stream().forEach(entry -> entry.getValue().stream().forEach(li -> al.add(li)));
	}
}
