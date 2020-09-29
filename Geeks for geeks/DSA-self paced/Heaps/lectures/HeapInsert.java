
/* Write a program to insert an element into the heap when,
 * Given an array, capacity of the array, current size of the array & element to be inserted as inputs
 */

package lectures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapInsert {

	public static void insertElement(int[] heap, int capacity, int size, int element) {
		if (capacity > size) {
			heap[size + 1] = element;
			heapify(heap, size + 1);
		}
	}

	public static void heapify(int[] heap, int index) {
		int parent = (int) Math.ceil((double) (index - 1) / 2);

		if (parent > 0 && heap[parent] > heap[index]) {
			swap(heap, parent, index);
			heapify(heap, parent);
		}
	}

	public static void swap(int[] heap, int parent, int index) {
		int temp = heap[parent];
		heap[parent] = heap[index];
		heap[index] = temp;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Capacity: ");
		int capacity = Integer.parseInt(br.readLine());
		System.out.println("Size: ");
		int size = Integer.parseInt(br.readLine());
		System.out.println("Element: ");
		int element = Integer.parseInt(br.readLine());

		int[] heap = new int[capacity + 1];

		System.out.println("Heap Elements: ");
		for (int i = 1; i <= size; i++) {
			heap[i] = Integer.parseInt(br.readLine());
		}

		insertElement(heap, capacity, size, element);

		for (int i = 1; i < size + 2; i++) {
			System.out.print(heap[i] + " ");
		}
	}
}
