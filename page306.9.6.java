import java.util.Date;
class Test{
	public static void main(String[] args) {
		StopWatch s = new StopWatch();
		s.start();
		try {
			Thread.sleep(1001);
		}
		catch(Exception x){
			;
		}
		s.stop();
		System.out.println(s.getElapsedTime());
	}
}

class	StopWatch{
	private int startTime = 0;
	private int endTime = 0;

	public int getStartTime(){
		return this.startTime;
	}

	public int getEndTime(){
		return endTime;
	}

	public void start(){
		startTime = (int)new Date().getTime();
	}

	public void stop(){
		endTime = (int)new Date().getTime();
	}

	public int getElapsedTime(){
		return endTime - startTime ;
	}

}