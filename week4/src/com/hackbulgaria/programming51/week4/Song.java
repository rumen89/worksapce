//Have the following attributes and methods:
//
//name
//artist
//duration (in seconds)
//album
//proper constructors
//toString() method
//Think about the types of each attribute and method. This is your job!

package com.hackbulgaria.programming51.week4;

public class Song {

	private String name;
	private String artist;
	private double duration;
	private String album;
	
	public Song() {
		
	}
	
	public Song(String name, String artist, double duration, String album) {
		this.name = name;
		this.album = album;
		this.duration = duration;
		this.artist = artist;
	}
	
	public String toString() {
		return name + "\t" + duration + "\t" + album;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public String getName() {
		return name;
	}
	
	public double getDuration() {
		return duration;
	}
}
