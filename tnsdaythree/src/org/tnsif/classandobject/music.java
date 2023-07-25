//Program to demonstrate on default and parameterized constructor
package org.tnsif.classandobject;

public class music {
	
	long noOfSongs;
	public String singerName;
	public double albumName;
	public music() {
		super();
		System.out.println("Default constructor");
	}
	//to 
	public music(long noOfSongs, String singerName, double albumName) {
		super();
		this.noOfSongs = noOfSongs;
		this.singerName = singerName;
		this.albumName = albumName;
	}
	// to string method
	@Override
	public String toString() {
		return "music [noOfSongs=" + noOfSongs + ", singerName=" + singerName + ", albumName=" + albumName + "]";
	}
	
	
	
	

}
