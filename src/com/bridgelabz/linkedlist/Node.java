package com.bridgelabz.linkedlist;

public class Node<K> {
	K key;
	Node next;

	public Node(K key) {
		this.key = key;
		this.next = null;
	}
	
	public Node(){
		this.key = null;
		this.next =null;
	}
	
	public Node(Node node) {
		this.key = (K) node.key;
		this.next = node.next;
	}
}
