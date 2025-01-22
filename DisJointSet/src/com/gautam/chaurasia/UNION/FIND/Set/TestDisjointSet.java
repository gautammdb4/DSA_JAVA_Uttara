package com.gautam.chaurasia.UNION.FIND.Set;

public class TestDisjointSet {

	public static void main(String[] args) {
        int size = 5;
        DisjointSet ds = new DisjointSet(size);

        ds.union(0, 2);
        ds.union(4, 2);
        ds.union(3, 1);

        System.out.println(ds.find(4)); // Output: 0 (since 4 and 2 are connected)
        System.out.println(ds.find(1)); // Output: 3
    }
}
