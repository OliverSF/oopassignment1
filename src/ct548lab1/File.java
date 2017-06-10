package ct548lab1;

//subclass File extends the superclass FileSystem
public class File extends FileSystem {
	
	//creating private variables
	private String name;
	private int size;
	
	//constructor given through sample code
	public File(String nm){
		this.setName(nm);
		this.setSize(nm.length()); // for demo purposes the size of the file is the number of characters in its name
	}

	//getter for name
	public String getName() {
		return name;
	}

	//setter for name
	public void setName(String name) {
		this.name = name;
	}

	//getter for size
	public int getSize() {
		return size;
	}

	//setter for size
	public void setSize(int size) {
		this.size = size;
	}

	//overridden size method
	@Override
	public int size() {
		return this.size;
	}

	//overridden getNumFiles method
	@Override
	public int getNumFiles() {
		
		return 0;
	}

	//overridden getNumFolders method
	@Override
	public int getNumFolders() {
		
		return 0;
	}

}
