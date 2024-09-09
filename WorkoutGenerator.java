public class WorkoutGenerator //This programme helps to select an exercise for a day
{
    public static void main(String[] args) 
    {
        //Creating an array to store list of workouts or activities
       String [] activities =
       {
         "Push-ups",
         "Squats",
         "Running",
         "Yoga",
         "Cycling",
         "Jump ropes",
         "Lunges"
       };
       //Creating  random index to generate an activity
       int randomExerciseIndex = (int) (Math.random() * activities.length);
       //Syntax below helps to print an activity for a day
       System.out.println("Your activity for today is:" + activities[randomExerciseIndex]);
       
       
    }
}
