package zadaci_04_02_2016;

/*
 *  Zadatak3
 *  StopWatch class
 */

public class StopWatch {

	private long startTime;
	private long endTime;

	public StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return endTime - startTime;
	}

}
