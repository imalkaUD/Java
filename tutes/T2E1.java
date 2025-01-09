public class E1{
	private int m1;
	private int m2;
	private int m3;
	public marks(){}
	public marks(){
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;}

public class T2E1{
	public class void main(String args[]){
		
--------------import java.util.Scanner;
 
public class Student {
 
    private String name;
    private String id;
    private int mark1,mark2,mark3;
    private double average;
 
    public Student(){
        this.mark1=0;
        this.mark2=0;
        this.mark3=0;
 
    }
 
    public void calculate(int mark1,int mark2,int mark3){
        average=(mark1+mark2+mark3)/3.0;
    }
 
    public void displayDetails(String id,String name){
        System.out.println("Id\t\tName\t\tAverage\n"+id+"\t\t"+name+"\t\t"+average);
    }
    public static void main(String[] args){
        Student d1=new Student();
 
        Scanner scan=new Scanner(System.in);
 
        System.out.println("Enter Name: ");
        String name=scan.nextLine();
 
        System.out.println("Enter Id: ");
        String id=scan.nextLine();
 
        System.out.println("Enter mark1: ");
        int m1=scan.nextInt();
 
        System.out.println("Enter mark2: ");
        int m2=scan.nextInt();
 
        System.out.println("Enter mark3: ");
        int m3=scan.nextInt();
 
        d1.calculate(m1,m2,m3);
        d1.displayDetails(id,name);
 
    }
 
 
}






---2------import java.lang.Math;
 
class Point3D{
	private double x;
	private double y;
	private double z;
	private double distance;
	public Point3D(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public double distance(){
		distance=Math.sqrt(x*x+y*y+z*z);
		return distance;

	}
}
public class PointApp{
	public static void main(String[] args){
		Point3D p1=new Point3D(2,3,8);
		Point3D p2=new Point3D(4,8,6);
		System.out.println("Distance to the origin of Object : "+p1.distance());
		System.out.println("Distance to the origin of Object : "+p2.distance());
	}
}	







-----3------class BankAccount{
	private String accountNumber;
	private String name;
	private double balance;
	public BankAccount(){
		this.accountNumber=null;
		this.name=null;
		this.balance=0.0;
	}
	public BankAccount(String number,String name,double balance){
		this.accountNumber=number;
		this.name=name;
		this.balance=balance;
	}
	public void setBalance(){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double amount){
		balance+=amount;
	}
	public boolean withdraw(double amount){
		if(balance>=amount){
			balance-=amount;
			return true;
		}
		return false;
	}
 
}
public class BankApp{
		public static void main(String args[]){
			BankAccount b1=new BankAccount("200100201","Kasun",3000);
			BankAccount b2=new BankAccount("200100202","Isuru",1000);
			b1.deposit(2000);
			System.out.println("Your Account Balance "+b1.getBalance());
			if(b2.withdraw(2000)){
				System.out.println("Withdraw Successfully");
			}
			else{
				System.out.println("Can not Withdraw.You have not enough Balance.\nYour Balance :"+b2.getBalance());
			}
		}
}	