import java.util.*;
import static net.mindview.util.Print.*;

public class Velocity{
	float distance;
	float time;
	float velocity;
	
	public Velocity(float distance, float time){
		distance = distance;
		time = time;
		velocity = distance/time;
	}
	
	public static void main(String[] args){
	Velocity velocity0 = new Velocity(60f , 1f);
	print("velocity0 : " + velocity0.velocity);
	}
}