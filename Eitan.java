import java.util.concurrent.TimeUnit;

public class Eitan{
	public static void main(String[] args){
		System.out.println("I'm blue/n");
		for(int i=1;i<=7;i++){
			System.out.println("if i go greed i will die");
			try{
			TimeUnit.SECONDS.sleep(1);
			}
			catch (InterruptedException e){
			}
		}
	}
}