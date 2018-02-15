package application;

public class ReadAndWriteToFile {

	private boolean file_location_set = false;
	
	String fileLocation = null;
	String detectedOS = null;

	
	ReadAndWriteToFile (String file_location) {
		this.fileLocation = file_location;
	}
	
	ReadAndWriteToFile () {};
	
	
	String OSdetection () {
		detectedOS = System.getProperty("os.name").toString();
		
		if (detectedOS == "Windows 7") {
			
		}
		
		else if (detectedOS == "Linux") {
			
		}
		
		return detectedOS;
	}
	
	
	String getFileLocation () {
		return fileLocation;
	}
	
	boolean isFileLocationSet () {
	
		if (fileLocation != null)
			file_location_set = true;
		else
			file_location_set = false;

		return file_location_set;
	}
	
	void writeFile() {
		
	}
	
	void readFile() {
		
	}
	
}
