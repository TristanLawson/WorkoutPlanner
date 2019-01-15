// Class Declaration
public class Workout {
    // Instance Variables
	int[] muscles = new int[13];
	
  
    // method 1: muscle name index
	public String muscleName(int number) {
		String name;
		switch(number) {
		case 0: name = "upper back";
			break;
		case 1: name = "lats";
			break;
		case 2: name = "lower back";
			break;
		case 3: name = "pecs";
			break;
		case 4: name = "abs";
			break;
		case 5: name = "quads";
			break;
		case 6: name = "glutes";
			break;
		case 7: name = "hammys";
			break;
		case 8: name = "calves";
			break;
		case 9: name = "shoulders";
			break;
		case 10: name = "triceps";
			break;
		case 11: name = "biceps";
			break;
		case 12: name = "forearms";
			break;
		default: name = "none";
		}
		
		return (name);
	}
	
	// method 2: print muscles used in workout
    public boolean getInfo() {
    	int counter = 0;
    	int one, two;
    	for (one=1; one<3; one++) {
    		
    		switch(one) {
    		case 1: System.out.println("Primary muscles used:\t");
    		break;
    		case 2: System.out.println("Secondary muscles used:\t");
    		break;
    		}

    		for (two=0; two<13; two++) {
    			if (muscles[two] == one) {
    				System.out.println("\t"+muscleName(two));
    				counter++;
    			}
    		}
    		if (counter == 0) System.out.println("\tnone");
    		counter = 0;
    	}
    	
        return (true);
    }
    
    // main
    public static void main(String[] args) {
    	int i;
    	
        Workout squat = new Workout();								//define workout squat
        for (i=0; i<13; i++) squat.muscles[i] = 0;
        squat.muscles[2] = 2;
        squat.muscles[5] = 1;
        squat.muscles[6] = 1;
        squat.muscles[7] = 2;
        
        Workout deadlift = new Workout();
        for (i=0; i<13; i++) deadlift.muscles[i] = 0;
        deadlift.muscles[1] = 2;
        deadlift.muscles[2] = 1;
        deadlift.muscles[5] = 2;
        deadlift.muscles[6] = 1;
        deadlift.muscles[7] = 1;
        
        Workout sleep = new Workout();
        for (i=0; i<13; i++) sleep.muscles[i] = 0;
        
        boolean executed = false;
        executed = squat.getInfo();
        if (executed == true) System.out.println("complete\n");
        executed = false;
        executed = deadlift.getInfo();
        if (executed == true) System.out.println("complete\n");
        executed = false;
        executed = sleep.getInfo();
        if (executed == true) System.out.println("complete\n");
    }
}