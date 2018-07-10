package String;
import java.util.Scanner;
public class SameChar
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
String str1=sc.next();
String str2=sc.next();
String name1=str1.toLowerCase();
String name2=str2.toLowerCase();
char[] ch1=str1.toCharArray();
char[] ch2=str2.toCharArray();
int count=0;
for(int i=0;i<name1.length()-1;i++)
{
if(ch1[i]==ch2[i]){
	
count++;

}
}
if (count==name2.length()-1)
{
System.out.println("True");
}
else
{
System.out.println("False");
}
}
}

