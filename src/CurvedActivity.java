
public class CurvedActivity extends GradedActivity {

	double rawScore;
	double percentage; 
	
	public CurvedActivity(double precent){
		percentage = precent;
		rawScore = 0.0;
	}
	
	public void setScore(double s){
		rawScore = s;
		super.setScore(rawScore * percentage);
	}
	
	public double getRawScore(){
		return rawScore;
	}
	
	public double getPercentage(){
		return percentage;
	}
}
