package ct548lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FolderTest {
	
	
	Directory documents;
	Directory music;
	Directory  photos;
	Directory dylan; 
	Directory band;
	
	File a;
	File b; 
	File c; 
	File d;
	File e;

	@Before
	public void setUp() throws Exception {
		
		documents = new Directory("Documents");
		music = new Directory("Music");
		photos = new Directory("Photos");
		dylan = new Directory("Dylan"); 
		band = new Directory("Band");
		
		a = new File("assign1.doc");
		b = new File("family.jpg"); 
		c = new File("tambourine.mp3"); 
		d = new File("dixie.mp3");
		e = new File("weight.mp3");

		documents.add(a);
		documents.add(music);
		documents.add(photos);
		photos.add(b);
		music.add(dylan);
		music.add(band);
		dylan.add(c);
		band.add(d);
		band.add(e);
	}

	@Test
	public void testSize() {
		// expected results
		int expectedSize = 54;


		// results returned from the code
		int sizeResult = documents.size();
		
		//asserting that the expectedSize '54' should equal the returned sizeResult
		assertEquals(expectedSize, sizeResult); 
					
	}
	
	@Test
	public void testNumFiles() {
		
		//expected results
		int expectedNumFiles = 5;
		
		//results returned from the code
		int numFilesResult = documents.getNumFiles();
		
		//asserting that the expectedNumFiles '5' should equal the returned numFilesResult
		assertEquals(expectedNumFiles, numFilesResult);		
		
	}
	
	@Test
	public void testNumFolders() {
		
		//expected results
		int expectedNumFolders = 4;
		
		//results returned from code
		int numFoldersResult = documents.getNumFolders();
		
		//asserting that the expectedNumFolders '4' should equal the returned numFoldersResult
		assertEquals(expectedNumFolders, numFoldersResult);
	}
}
