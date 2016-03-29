package BrickBreaker;

import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Node{


	int data;
	Node left;
	Node right;
	
	
	public Node(int data,Node left,Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public Node(int data){
		this.data = data;
		left=right=null;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public Node getLeft() {
		return left;
	}


	public void setLeft(Node left) {
		this.left = left;
	}


	public Node getRight() {
		return right;
	}


	public void setRight(Node right) {
		this.right = right;
	}
	
	
	
	
}
