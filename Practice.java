import java.util.Scanner;
class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
System.out.println("enter your first name: ");
String str=sc.nextLine();
System.out.println("enter your last name: ");
String str1=sc.nextLine();
System.out.println("enter your friends first name: ");
 String str2=sc.nextLine();
System.out.println("enter your friends last name: ");
String str3=sc.nextLine();
String a=null;
String b=null;
String c=null;
String d=null;

a=str;
str=str3;
str3=a;

b=str3;
str3=str;
str=b;
System.out.println(str+" "+ str3);

c=str1;
str1=str2;
str2=c;

d=str2;
str2=str1;
str1=d;
System.out.println(str2+" "+ str1);

    }
}