package model.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ProductFile {
	private String path;
	
	public ProductFile() {
	}
	
	public ProductFile(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public void writeFile(List<String> lines, String path) {
		File completePath = new File(path);
		boolean alreadyExistsFile = alreadyExistsFile(completePath.getParent(), completePath.getName() );
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, alreadyExistsFile))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public boolean alreadyExistsFile(String strPath, String nameFile) {
		File parentPath = new File(strPath);
		File[] files = parentPath.listFiles(File::isFile);
		
		for(File file : files) {

			if(file.getName().equals(nameFile)) {
				 return true;			
			}
		}
		return false;
	}
	
}
