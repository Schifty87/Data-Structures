package Practice;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Hashtable;
import java.util.Set;

public class HashtableExample {

	//create a hashtable to contain a set of <login name>, <password>
	private Hashtable<String, String> hashtable = new Hashtable<String, String>();
	
	public void CreateHashTable(){
		String[] userLoginList = {"peter", "ricky", "greg", "gray", "amy"};
		String passwordBase = "pwd";
		
		for(int i=0; i<userLoginList.length; i++){
			hashtable.put(userLoginList[i], passwordBase + "_" + (int)(Math.random()*10000));
		}
	}
	
	public String searchByLoginName(String LoginName){
		
		String password = hashtable.get(LoginName);
		return password;
	}
	
	public void deleteByLoginName(String LoginName){
		hashtable.remove(LoginName);
	}
	
	public void insertLoginPassword(String LoginName, String password){
		hashtable.put(LoginName, password);
	}
	
	public void saveToFile(String fileName) throws FileNotFoundException{
		Formatter ft = new Formatter(fileName);
		//key is string
		Set<String> keys = hashtable.keySet();
		
		for(String akey : keys){
			//get value associated with each key
			String value = hashtable.get(akey);
			ft.format("%s = %s \n", akey, value);
			System.out.println("LoginName = " + akey + " password = " + value);
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		
		HashtableExample he = new HashtableExample();
		he.CreateHashTable();
		String LoginName = "greg";
		System.out.println("Password of the user " + LoginName + " is " + he.searchByLoginName(LoginName));
		he.insertLoginPassword("steve", "next_PS2032");
		he.deleteByLoginName(LoginName);
		he.saveToFile("hashtable.out");
	}
}
