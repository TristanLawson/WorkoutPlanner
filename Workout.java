// Class Declaration
public class Workout {
    // Instance Variables
	private int hist = 10;
	private String name;
	private int[] muscles = new int[13];
	private int[][] reps = new int[hist][2];
	private int[] weight = new int[hist];
	private int[][] date = new int[hist][3];
	private int counter;
	
  
    // method 1: input index, return name
 	public String muscleIndex(int number) {
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
    public void getInfo() {
    	int counter = 0;
    	int x, y;
    	System.out.println(name);
    	for (x=1; x<3; x++) {
    		switch(x) {
    		case 1: System.out.println("\tPrimary muscles used:\t");
    		break;
    		case 2: System.out.println("\tSecondary muscles used:\t");
    		break;
    		}
    		for (y=0; y<13; y++) {
    			if (muscles[y] == x) {
    				System.out.println("\t\t"+muscleIndex(y));
    				counter++;
    			}
    		}
    		if (counter == 0) System.out.println("\t\tnone");
    		counter = 0;
    	}
        return;
    }
    
    // method 3: set weight, sets, reps, date
    public void setPerformance(int nWeight, int nSets, int nReps, int day, int month, int year) {
    	weight[counter] = nWeight;
    	reps[counter][0] = nSets;
    	reps[counter][1] = nReps;
    	date[counter][0] = day;
    	date[counter][1] = month;
    	date[counter][2] = year;
    	counter = (counter+1) % hist;		//increment counter, reset to 0 if necessary
    	return;
    }
    
    //method 4: set muscles worked (input is array of length 13)
    public void initWorkout(int[] nMuscles, String nname) {
    	int x;
    	name = nname;
    	for (x=0;x<13;x++) {
    		if (nMuscles[x] == 1) muscles[x] = 1;
    		else if (nMuscles[x] == 2) muscles[x] = 2;
    		else muscles[x] = 0;
    	}
    	return;
    }
}