package com.hue.ssm.pojo;

public class Borrow {
	private int borrowId;
	private int b_bookId;
	private int borrowerId;//������id
	private int operator;//����Աid
	private String borrowTime;//���ʱ��
	private String returnDeadline;//�黹����ʱ��
	private String returnTime;//ʵ�ʹ黹ʱ��
	public int getBorrowId() {
		return borrowId;
	}
	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
	}
	public int getB_bookId() {
		return b_bookId;
	}
	public void setB_bookId(int b_bookId) {
		this.b_bookId = b_bookId;
	}
	public int getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	public int getOperator() {
		return operator;
	}
	public void setOperator(int operator) {
		this.operator = operator;
	}
	public String getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(String borrowTime) {
		this.borrowTime = borrowTime;
	}
	public String getReturnDeadline() {
		return returnDeadline;
	}
	public void setReturnDeadline(String returnDeadline) {
		this.returnDeadline = returnDeadline;
	}
	public String getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
	@Override
	public String toString() {
		return "Borrow [borrowId=" + borrowId + ", b_bookId=" + b_bookId + ", borrowerId=" + borrowerId + ", operator="
				+ operator + ", borrowTime=" + borrowTime + ", returnDeadline=" + returnDeadline + ", returnTime="
				+ returnTime + "]";
	}
}
