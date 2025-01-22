package com.gautam.chaurasia;

public class NodeSum {

	int carry;
	Node dataNode;

	public int getCarry() {
		return carry;
	}

	public NodeSum( Node dataNode,int carry) {
		super();
		this.carry = carry;
		this.dataNode = dataNode;
	}

	public Node getDataNode() {
		return dataNode;
	}

	public void setCarry(int carry) {
		this.carry = carry;
	}

	public void setDataNode(Node dataNode) {
		this.dataNode = dataNode;
	}
}
