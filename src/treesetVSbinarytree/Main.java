package treesetVSbinarytree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import binaryTree.BinaryTree;

public class Main {
	 public static void main(String[] args) {
		 final int SIZE = 100000;
		 
		 Set<Integer> treeSet = new TreeSet<Integer>();
		 System.out.println("TreeSet starts");
		 long treesetStart = System.currentTimeMillis();
		 for (int i = 0; i< SIZE; i++) {
			 Integer number = (int) (Math.random()*1000000);
			 if(!treeSet.contains(number)) {
				 treeSet.add(number);
			 }
			 else {
				 i--;
			 }
		 }
		 Iterator treeSetIterator = treeSet.iterator();
		 int j = 0;
		 while(treeSetIterator.hasNext()) {
			 System.out.print(treeSetIterator.next() + " ");
			 j++;
			 if(j%100==0) {
				 System.out.println();
			 }
		 }
		 long usedTime = (System.currentTimeMillis() - treesetStart);
		 System.out.println("Used time: " + usedTime + " milliseconds");
		 
		 BinaryTree binaryTree = new BinaryTree();
		 System.out.println("BinaryTree starts");
		 long treeStart = System.currentTimeMillis();
		 for(int i =0; i<SIZE; i++) {
			 Integer number = (int) (Math.random()*1000000);
			 if(binaryTree.find(number)==null) {
				 binaryTree.insert(number);
			 }
			 else {
				 i--;
			 }
		 }
		 binaryTree.inOrder();
		 System.out.println();
		 System.out.println("Treeset used time: " + usedTime + " milliseconds");
		 usedTime = (System.currentTimeMillis() - treeStart);
		 System.out.println();
		 System.out.println("Binarytree used time: " + usedTime + " milliseconds");
	 }
}
