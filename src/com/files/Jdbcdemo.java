package com.files;

import java.util.Scanner;

import com.files.dao.Jdbcdao;

public class Jdbcdemo {
	
	static Jdbcdao jd;
	Scanner sc;
	public Jdbcdemo() {
		jd = new Jdbcdao();
		sc = new Scanner(System.in);
	}
	public void menu()
	{
		int choice;
		
		do
		{
			System.out.println("0. Exit");
			System.out.println("1. Get All Records");
			System.out.println("2. Get Record by Id");
			System.out.println("3. Get Records by Name"); // *
			System.out.println("4. Get Records By City"); // *
			System.out.println("5. Register Employee");
			System.out.println("6. Delete Employee Record");
			
			System.out.println("Enter your choice : ");
			choice=sc.nextInt();
			
			if(choice == 0)
			{
				System.out.println("Goodbye!!!");
				
			}
			else if(choice==1)
			{
				jd.getRecords();
				

			}
			else if(choice ==2)
			{
				sc.nextLine();
				System.out.println("Enter Employee Id : ");
				jd.getRecordsById(sc.nextLine());
			}
			else if(choice ==3)
			{
				sc.nextLine();
				System.out.println("Enter Name: ");
				jd.getRecordsByName(sc.nextLine());
			}
			else if(choice ==4)
			{
				sc.nextLine();
				System.out.println("Enter City: ");
				jd.getRecordsByCity(sc.nextLine());
			}
			else if(choice ==5)
			{
				jd.registerEmployee();
			}
			else if(choice==6)
			{
				sc.nextLine();
				System.out.println("Enter Employee Id : ");
				jd.deleteEmployeeById(sc.nextLine());
			}
//			else if(choice==7)
//			{
//				sc.nextLine();
//				System.out.println("1. Update Id:");
//				System.out.println("2. Update Name:");
//				System.out.println("3. Update age:");
//				System.out.println("4. Update Phone No.");
//				System.out.println("5. Update city");
//				System.out.println("6. Update all");
//				
//				String colname = "";
//				int x = sc.nextInt();
//				sc.nextLine();
//				if(x == 1)
//					{
//						colname = "empid";
//						System.out.println("Enter ur updated id:");
//						e.setId(sc.nextLine());
//					}
//				else if(x == 2)
//				{
//					colname = "empname";
//					System.out.println("Enter ur updated name:");
//					e.setName(sc.nextLine());
//				}				
//				else if(x == 3){
//					colname = "age";
//					System.out.println("Enter ur updated age:");
//					e.setAge(sc.nextInt());
//				}	
//				else if(x == 4){
//					colname = "phone";
//					System.out.println("Enter ur updated Phone no:");
//					e.setphone(sc.nextLong());
//				}	
//				else if(x == 5){
//					colname = "city";
//					System.out.println("Enter ur updated city:");
//					e.setCity(sc.nextLine());
//				}	
//				else if(x == 6){
//					colname = "all";
//					sc.nextLine();
//					System.out.println("Enter ur updated id:");
//					e.setId(sc.nextLine());
//					System.out.println("Enter ur updated name:");
//					e.setName(sc.nextLine());
//					System.out.println("Enter ur updated age:");
//					e.setAge(sc.nextInt());
//					sc.nextLine();
//					System.out.println("Enter ur updated Phone no:");
//					e.setphone(sc.nextLong());
//					sc.nextLine();
//					System.out.println("Enter ur updated city:");
//					e.setCity(sc.nextLine());
//					System.out.println("Enter ur password:");
//					e.setPassword(sc.nextLine());
//					System.out.println("Enter ur salary");
//					e.setSalary(sc.nextDouble());
//					
//				}	
//				else {					
//					System.out.println("Invalid Input");
//					menu();
//					}
//				edao.updateRecords(colname, e);
//				
//			}
			else
			{
				System.out.println("Wrong choice!! TryAgain!!!");
			}
			System.out.println("----------------------------------------------");
			
		}while(choice!=0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jdbcdemo j = new Jdbcdemo();
		
			j.menu();
		
	}

}
