package Project4;

import java.util.ArrayList;
import java.util.Collection;

public class tweet {

	private int popularity, ID;
	private String keyword, user, text;
	
	
	public tweet(int popularity, int ID, String keyword, String user, String text){
		this.popularity = popularity;
		this.ID = ID;
		this.keyword = keyword;
		this.user = user;
		this.text = text;
	}


	/**
	 * @return the popularity
	 */
	public int getPopularity() {
		return popularity;
	}


	/**
	 * @param popularity the popularity to set
	 */
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}


	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}


	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}


	/**
	 * @return the keyword
	 */
	public String getKeyword() {
		return keyword;
	}


	/**
	 * @param keyword the keyword to set
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}


	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}


	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}


	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	public String toString(){
		int pop = this.popularity;	
		return this.popularity + "\t" + this.keyword + "\t" + this.user + "\t" + this.text;
		
		
	}
	
}
