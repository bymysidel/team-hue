package com.hue.ssm.pojo;

public class MyBorrow {
	private int userId;
	private String userName;
	private int sex;
	private String dept;
	private int bookId;
	private String bookName;	
	private String author;
	private String press;
	private String category;
	private double price;
	private int status;//书籍在借状态
	private int borrowId;//借阅记录编号
	private String borrowTime;//借出时间
	private String returnDeadline;//归还期限
	private String returnTime;//实际归还时间
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getBorrowId() {
		return borrowId;
	}
	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
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
		return "MyBorrow [userId=" + userId + ", userName=" + userName + ", sex=" + sex + ", dept=" + dept + ", bookId="
				+ bookId + ", bookName=" + bookName + ", author=" + author + ", press=" + press + ", category="
				+ category + ", price=" + price + ", status=" + status + ", borrowId=" + borrowId + ", borrowTime="
				+ borrowTime + ", returnDeadline=" + returnDeadline + ", returnTime=" + returnTime + "]";
	}
}
