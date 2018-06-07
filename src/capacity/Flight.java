package capacity;

import java.util.Scanner;

public class Flight {
	boolean[]capacity =new boolean[11];
	Scanner input = new Scanner (System.in);
public  void start()
{
	while(true)
	{
		makeReservation();
	}
}
public void makeReservation() {
System.out.println("please type 1 for firstclass or 2 for Economy class");
int section = input.nextInt();
if(section==1)
{
	FirstClassSeat();
}
else
{
	economyClassSeat();
}
	
}
private void FirstClassSeat() {
for(int count=1;count<=5;count++)
{
	if(capacity[count]==false)
	{
		capacity[count]=true;
		System.out.printf("FirstClass,Seat#%d\n",+count);
		break;
	}
	else if(capacity[5]==true)
	{
		if(capacity[10]==true)
		{
			System.out.println("sorry flight is fully booked and the next flight will arrive after 30min");
		}
		else
		{
			System.out.println("firstclass is fully booked");
			int choice=input.nextInt();
			if (choice==1)
			{
				 choice=input.nextInt();
				if(choice==1)
				{
					economyClassSeat();
					start();
				}
				else
				{
					System.out.println("next flight is in 3hours");
					System.exit(0);
				}
			}
		}
	}
	}
}

public void economyClassSeat()
{
	for(int count=0;count<=10;count++)
{
if(capacity[count]==false)
{
capacity[count]=true;
System.out.printf("Economy.seat#%d\n",count);
break;
}
else if(capacity[10]==true)
{
if(capacity[5]==true)
{
System.out.println("sorry,flight fully booked.next will array after 30min");
System.exit(0);
}
else
{
	System.out.println("Economy is fully booked");
	
			}
}
}
}
}
	



