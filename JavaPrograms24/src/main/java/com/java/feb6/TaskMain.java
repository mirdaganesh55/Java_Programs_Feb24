package com.java.feb6;

import java.util.List;
import java.util.Scanner;

import com.java.feb5.Claim;
import com.java.feb5.ClaimBAL;

public class TaskMain {
	
	static TaskDAOImpl dao;
	static Scanner sc ;
	
	static {
		dao = new TaskDAOImpl();
		sc = new Scanner(System.in);
	}
	
	
	public static void main(String[] args) throws Exception {
		
		
		int choice;
		
		do {
			System.out.println("1. Add Task ");
			System.out.println("2. Show Task ");
			System.out.println("3. Perform Task ");
			System.out.println("4. Delete Task ");
			System.out.println("5. Perfrom Thread Demo");
			System.out.println("6. Exit ");
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println(e.getClass());
				throw new Exception("Enter a valid number!!!");
			}
			switch(choice) {
			case 1:{
				try {
					addTaskMain();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 2:{
				getAllTasksMain();
				break;
			}
			case 3:{
				getTaskByNameMain();
				break;
			}
			case 4:{
				displayTaskMain();
				break;
			}
			case 5:{
				dao.performDemoThread();
				break;
			}
		}
		}while(choice!=6);
}
	public static void addTaskMain() {
		Task task = new Task();
		System.out.print("Enter task name : ");
		task.setTaskName(sc.next());
		dao.addTask(task);
	}
	public static void getAllTasksMain() {
		List<Task> taskList= dao.getAllTasks();
		for (Task task : taskList) {
			System.out.println(task);
		}
	}
	public static void getTaskByNameMain() {
		System.out.print("Enter correct task name : ");
		dao.performTask(sc.next());
	}
	
	public static void displayTaskMain() {
		System.out.print("Enter correct task name : ");
		dao.deleteTask(sc.next());
		 getAllTasksMain();
	}
	
}
