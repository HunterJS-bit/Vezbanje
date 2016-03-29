package BrickBreaker;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class BinaryTRee {

	
	
	Node root;
	int count;
	
	public BinaryTRee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void setRoot(Node n){
		this.root = n;
	}
	
	
	public boolean isEmpty(){
		return count==0;
	}
	
	public void callPreorder(){
		preOrder(this.root);
		System.out.println();
	}
	
	
	public void preOrder(Node n){
		if(n!=null){
			System.out.print(n.data+",");
			preOrder(n.left);
			preOrder(n.right);
			
		}
	}
	
	
	public void callInOrder(){
		inOrder(this.root);
		System.out.println();
	}
	
	
	public void inOrder(Node n){
		if(n!=null){
			inOrder(n.left);
			System.out.print(n.data+",");
			inOrder(n.right);
		}
	}
	
	
	public void CallPostOrder(){
		postOrder(this.root);
	}
	
	
	
	public void postOrder(Node n){
		if(n!=null){
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.data+",");
		}
	}
	
	/*
	
	public void StekPreorder(){
		preOrder(this.root);
	}
	public void preOrderStack(Node n){
		Stack<Node> stek = new Stack<Node>();
		stek.push(n);
		while(!stek.isEmpty()){
			System.out.println(stek.pop().data);
			
			stek.push(n.right);
			stek.push(n.left);
			
		}
	}
	
	

	
	
	
	
	
	public void InOrderStack(Node node){
	
		
		Stack<Node> stack = new Stack<Node>();
		
		while(!stack.isEmpty() || node!=null){
			if(node!=null){
				stack.push(node);
				node=node.left;
			}else{
				node = stack.pop();
				System.out.print(node.data+",");
				node = node.right;
			}
		}
	
	
	}
	
	

		
	public void StackPostOrder(Node n){

        Deque<Node> stack1 = new LinkedList<Node>();
        Deque<Node> stack2 = new LinkedList<Node>();
        stack1.addFirst(n);
        while(!stack1.isEmpty()){
            root = stack1.pollFirst();
            if(root.left != null){
                stack1.addFirst(root.left);
                
            }
            if(root.right != null){
                stack1.addFirst(root.right);
            }
            stack2.addFirst(root);
        }
        while(!stack2.isEmpty()){
            System.out.print(stack2.pollFirst().data + " ");
        }
	
	
	}
	
	
	public int maximumElement(Node node){
int max = 0;
		if(node!=null){
			int root = node.data;
			int left = maximumElement(node.left);
			int right = maximumElement(node.right);
			
			if(left>right){
				max = left;
			}else{
				max = right;
			}
			if(root>max){
				max =root;
			}
		}
	return max;
		
	}
	
	
	
	
	
	
	public int sizeOfTree(Node n){
		
		if(n==null){
			return 0;
		}else{
			return 1+sizeOfTree(n.left)+sizeOfTree(n.right);
		}
		 
	}
	
	
	
	public int heightOgTree(Node node){
		if(node==null){
			return 0;
		}else{
			return Math.max(1+heightOgTree(node.left),1+heightOgTree(node.right));
		}
	}
	
	
	
	
	public void levelOrderTraversal(Node startNode){
		 Queue<Node> queue=new LinkedList<Node>();  
		  queue.add(startNode);  
		  while(!queue.isEmpty())  
		  {  
		  Node tempNode=queue.poll();  
		   System.out.printf("%d ",tempNode.data);  
		   if(startNode.left!=null)
		    queue.add(tempNode.left);  
		  if(startNode.right!=null)
		    queue.add(tempNode.right);  
		  }  

		
	}
	
	
	
*/
	
	

	
	
	
	
	public boolean isLeaf(Node n){
		if(n.left!=null || n.right!=null){
			return false;
		}
		return true;
	}
	
	
	public boolean isInternal(Node n){
		if(n.left!=null  || n.right!=null){
			return true;
		}
		return false;
	}
	
	
	
	public void preOrderStack(Node n){
		if(n==null){
			return;}
		Stack<Node> stack = new Stack<Node>();
		stack.add(n);
		
		while(!stack.isEmpty()){
			Node pop = stack.pop();
			System.out.print(pop.data+",");
			
			if(pop.right!=null){
				stack.add(pop.right);
			}
			if(pop.left!=null){
				stack.add(pop.left);
			}
		}
	}
	
	
	
	
	
	
	
	
	public void inOrderIterative(Node n){
		
			  if(n==null){
				  return;
			  }

			Stack<Node> stack = new Stack<Node>();
Node curr = n;
			stack.push(curr);
	
			while(!stack.isEmpty() || curr!=null){
			
				if(curr.left!=null){
					stack.push(curr.left);
					curr = curr.left;
				}else{
					Node pop = stack.pop();
					System.out.println(pop.data);
					curr = stack.peek().right;
				}
			}
	
	}
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	

