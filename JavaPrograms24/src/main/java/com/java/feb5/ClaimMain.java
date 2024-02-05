package com.java.feb5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ClaimMain {
	
	static ClaimBAL bal;
	static Scanner sc;
	
	static {
		bal = new ClaimBAL();
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		Claim claim = new Claim();
		 ClaimDAO claimDAO = new ClaimDaoImpl();
		 
		 Claim claim1 = new Claim(1,"Rahul Raman","Suchitra",new Date(),2500.20,true);
		 Claim claim2 = new Claim(1,"Chandra Sekar","Narayan Bej",new Date(),5555.87,false);
		 claimDAO.addClaimDao(claim1);
		 claimDAO.addClaimDao(claim2);
//		 System.out.println(claimDAO.showClaimDao());
		 
		 int choice;
		 do {
			 System.out.println("O P T I O N S");
				System.out.println("-------------");
				System.out.println("1. Add Claim");
				System.out.println("2. Show Claim");
				System.out.println("3. Delete Employ");
				System.out.println("4. WriteEmploy File");
				System.out.println("5. Read Employ File");
				System.out.println("6. Exit");
				System.out.println("Enter Your Choice  ");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					try {
						addClaimMain();
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;
				case 2:
					showClaimMain();
					break;
				case 3:
					deleteClaimMain();
					break;
				case 4 : 
					try {
						writeClaimFileMain();
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case 5 : 
					try {
						readClaimFileMain();
					} catch (ClassNotFoundException | IOException e) {
						e.printStackTrace();
					}
					break;
				}
				
			 
		 }while(choice!=6);
	}
	
	public static void addClaimMain() throws Exception {
		Claim claim = new Claim();
		System.out.println("Enter ClaimId Number : ");
		claim.setClaimId(sc.nextInt());
		System.out.println("Enter Patient Name  ");
		claim.setPatientName(sc.next());
		System.out.println("Enter Provider Name  ");
		claim.setProviderName(sc.next());
		System.out.println("Enter totalClaimAmount  ");
		claim.setTotalClaimAmount(sc.nextDouble());
		System.out.println(bal.addClaimBal(claim));
		claim.setDateOfService(new Date());
	}
	public static void showClaimMain() {
		List<Claim> claimList= bal.showClaimBal();
		for (Claim claim: claimList) {
			System.out.println(claim);
		}
	}
	public static void readClaimFileMain() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println(bal.readClaimFileBal());
	}
	
	public static void writeClaimFileMain() throws FileNotFoundException, IOException {
		System.out.println(bal.writeClaimFileBal());
	}
	public static void deleteClaimMain() {
		int empno;
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		System.out.println(bal.deleteClaimBal(empno));
	}
}

