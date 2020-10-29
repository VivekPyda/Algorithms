package problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author vivek
 *
 *         Given an array of numbers N and an integer k, your task is to split N
 *         into k partitions such that the maximum sum of any partition is
 *         minimized. Return this sum.
 * 
 *         For example, given N = [5, 1, 2, 7, 3, 4] and k = 3, you should
 *         return 8, since the optimal partition is [5, 1, 2], [7], [3, 4].
 * 
 */

public class Problem243 {

	/*
	 * Step 1: Generate a max heap of given array
	 * 
	 * Step 2: Create a min heap of sums of K size where sums are initialised to 0
	 * and pair the sums with partitions
	 * 
	 * Step 3: Poll each element from the max heap Also poll the min heap and get
	 * the min sum Add element to sum as well as the partition Add the pair back to
	 * min heap
	 * 
	 * Step 4: Poll all the elements from the min heap until empty and return the
	 * last value
	 */

	public static int optimalPartition(int[] N, int k) {
		PriorityQueue<Integer> elements = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Pair<Integer, List<Integer>>> sums = new PriorityQueue<>(k,
				(Pair<Integer, List<Integer>> arg0, Pair<Integer, List<Integer>> arg1) -> {

					if (arg0.getKey() < arg1.getKey())
						return -1;
					else if (arg0.getKey() > arg1.getKey())
						return 1;
					else
						return 0;

				});

		for (int val : N)
			elements.add(val);

		for (int i = 0; i < k; i++) {
			sums.add(new Pair<Integer, List<Integer>>(0, new ArrayList<>()));
		}

		for (int i = 0; i < N.length; i++) {
			Pair<Integer, List<Integer>> ref = sums.poll();
			int val = elements.poll();
			ref.setKey(ref.getKey() + val);
			ref.getValue().add(val);
			sums.add(ref);
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < k; i++) {
			Pair<Integer, List<Integer>> ref = sums.poll();
			System.out.println(ref.getValue());
			max = Math.max(max, ref.getKey());
		}

		return max;
	}

	public static void main(String[] args) {
		int[] N = { 5, 1, 2, 2, 7, 3, 4 };
		int k = 2;

		System.out.println("Minimised maximum sum: " + optimalPartition(N, k));
	}
}

class Pair<K, V> {
	private K k;
	private V v;

	Pair(K key, V value) {
		this.k = key;
		this.v = value;
	}

	public K getKey() {
		return k;
	}

	public void setKey(K k) {
		this.k = k;
	}

	public V getValue() {
		return v;
	}

	public void setValue(V v) {
		this.v = v;
	}
}
