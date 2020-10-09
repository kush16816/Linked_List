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
}
