import java.util.Random;
import java.util.Scanner;

class HeadorTails{
	public static void main(String[] args){
Random r = new Random();
Scanner s = new Scanner(System.in);
int a = 0;
int b = 0;

System.out.println("Tossong a coin...");
for(int i=0;i<3;i++){
	int random = r.nextInt(2);
	if(random == 0){
		System.out.println("Round"+(i+1)+": Heads");
		a++;
	}else if(random == 1){
		System.out.println("Round"+(i+1)+": Tails");
		b++;
	}
	}
	System.out.println("Heads: "+a+", Tails: "+b);
}
}