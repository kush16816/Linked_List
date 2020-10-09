
package com.bridgelabz.linkedlist;

public class Linkd_List {

	/**
	 * @param node Contains node to which key is to be added
	 * @param key  Contains key to be added
	 *             Adds key to the given node
	 */
	public static void add_Key(Node node, int key) {
		node.key = key;
	}

	/**
	 * @param new_Node Contains node to be added
	 * @param head     Contains the head node of linked list.
	 *                 Adds node at the end of the list
	 */
	public static void add_Node_At_Last(Node new_Node, Node head) {
		Node tmp_Node = new Node();
		if (head.key == null) {
			head.key = new_Node.key;
		} else if (head.next == null) {
			head.next = new_Node;
		} else {
			tmp_Node.key = head.key;
			tmp_Node.next = head.next;
			while (tmp_Node.next != null) {
				tmp_Node = tmp_Node.next;
			}
			tmp_Node.next = new_Node;
		}
	}

	/**
	 * @param head Contains node from which list is to be printed.
	 *             Prints Linked list from head to last.
	 */
	public static void show_Key(Node head) {
		while (head != null) {
			System.out.println(head.key);
			head = head.next;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node();
		Node new_Node1 = new Node();
		Node new_Node2 = new Node();
		Node new_Node3 = new Node();
		add_Key(new_Node1, 56);
		add_Node_At_Last(new_Node1, head);
		show_Key(head);
		add_Key(new_Node2, 30);
		add_Node_At_Last(new_Node2, head);
		show_Key(head);
		add_Key(new_Node3, 70);
		add_Node_At_Last(new_Node3, head);
		show_Key(head);
	}
}
