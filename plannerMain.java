
public class plannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] squatNums = {0,0,2,0,0,1,1,2,0,0,0,0,0};
    	int[] deadliftNums = {0,2,1,0,0,2,1,1,0,0,0,0,0};
    	int[] sleepNums = new int[13];
    	
    	Workout squat = new Workout();
    	squat.initWorkout(squatNums, "squat");
    	Workout deadlift = new Workout();
    	deadlift.initWorkout(deadliftNums, "deadlift");
        Workout sleep = new Workout();
        sleep.initWorkout(sleepNums, "sleep");
        
        squat.getInfo();
        deadlift.getInfo();
        sleep.getInfo();
	}

}
