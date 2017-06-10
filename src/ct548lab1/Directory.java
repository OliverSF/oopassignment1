package ct548lab1;


import java.util.*;

//subclass Directory extends the superclass
public class Directory extends FileSystem {
	
	//creating private variables
	private String name;
	private int size;
	
	//creating arraylist of type FileSystem
	private ArrayList<FileSystem> hierarchy = new ArrayList<FileSystem>();;
	
	//constructor
	public Directory(String x) {
		this.setName(x);
	}
	
	//add method to add objects to the arraylist
	public void add(FileSystem filesys){
		this.hierarchy.add(filesys);
	}
	
	
	//size method using enhanced for loop to iterate through elements in arraylist + recursion
	public int size() {
		
		for(FileSystem p : hierarchy){
			size += p.size();
		}
		
		return size;
	}
	
	//getNumFiles method using enhanced for loop to iterate through Array list + recursion
	//and instanceof to only count the files in the arraylist
	@Override
	public int getNumFiles() {
		
		int numFiles = 0;
		
		for(FileSystem p : hierarchy){
			if(p instanceof File){
				numFiles++;
			}
			else{
				numFiles += p.getNumFiles();
			}
		}
		
		return numFiles;
	}
	
	//getnumFolders method using enhanced for loop to iterate through array list + recursion
	//using instanceof to only count folders
	@Override
	public int getNumFolders() {
		
		int numFolders = 0;
		
		for(FileSystem p : hierarchy){
			if(p instanceof Directory){
				numFolders++;
			}
			numFolders += p.getNumFolders();
		}
		return numFolders;
	}
	
	//getter for name
	public String getName() {
		return name;
	}
	
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
}
