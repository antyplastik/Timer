package application;

public abstract class ActionsTimeAbstr extends ReadAndWriteToFile {

	int time;
	
	ActionsTimeAbstr(String file_location) {
		super(file_location);
		// TODO Auto-generated constructor stub
	}
	
	abstract void addTime();
	abstract void getTime();
	
	static void writeTimeToDisk() {
		
	}
	
	static void readTimeFromDisk() {
		
	}
	
}
