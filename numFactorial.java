package Java.numFactorial;

public import java.util.Scanner;

class numFactorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int numIn = sc.nextInt();
int fact = 1;
int count = 1;

while (count<=numIn) {
	fact*=count; count++;
}

if (count>=numIn) { 
System.out.println(fact);
}
 
   }
} {
    
}
