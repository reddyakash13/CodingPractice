package com.algorithms.practice.heap;

public class HeapSort {

	public static void main(String[] args) {
		int[] a = new int[] { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		System.out.println("Before heapify:");
		for (int x : a)
			System.out.print(x + " ");
		System.out.println();
		// To heapify the array
		buildMaxHeap(a, a.length);
		System.out.println("After heapify:");
		for (int x : a)
			System.out.print(x + " ");
		System.out.println();
		// To sort the array
		int heapSize = a.length;
		for (int i = a.length - 1; i >= 1; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapSize = heapSize - 1;
			maxHeapify(a, 0, heapSize);
		}
		System.out.println("Sorted array: ");
		for (int x : a)
			System.out.print(x + " ");
	}

	public static void buildMaxHeap(int[] a, int heapSize) {
		for (int i = a.length / 2; i >= 0; i--) {
			maxHeapify(a, i, heapSize);
		}
	}

	public static void maxHeapify(int[] a, int i, int heapSize) {
		int l = left(i);
		int r = right(i);
		int largest;
		if (l < heapSize && a[l] > a[i]) {
			largest = l;
		} else {
			largest = i;
		}

		if (r < heapSize && a[r] > a[largest]) {
			largest = r;
		}

		if (largest != i) {
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			maxHeapify(a, largest, heapSize);
		}
	}

	public static int left(int i) {
		return 2 * i + 1;
	}

	public static int right(int i) {
		return 2 * i + 2;
	}
}
