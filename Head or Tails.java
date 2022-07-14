import java.util.Random;
import java.util.Scanner;

class HeadorTails{
	public static void main(String[] args){
Random r = new Random();
Scanner s = new Scanner(System.in);
int a = 0;
int b = 0;

System.out.println("Who are you?");
String name = s.next();
System.out.println("hello, "+ name +"!");

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
	if(a>b){
		System.out.println("You won!");
	}else if(b>a){
		System.out.println("You lost");
	}
}
}