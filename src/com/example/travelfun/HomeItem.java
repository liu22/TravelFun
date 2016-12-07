package com.example.travelfun;

public class HomeItem {
	
	 private int mPicture;
	 private String mTitle;
	 
	 public  HomeItem(int picture,String title){
	     this.mPicture = picture;
	     this.mTitle = title;
	 }
	 
	 public int getPicture() {
	     return mPicture;
	 }
	 
	 public void setmPicture(int mPicture) {
	     this.mPicture = mPicture;
	 }
	 
	 public String getTitle() {
	     return mTitle;
	 }
	 
	 public void setTitle(String mTitle) {
	     this.mTitle = mTitle;
	 } 

}