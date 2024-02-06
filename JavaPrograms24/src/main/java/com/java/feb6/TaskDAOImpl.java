package com.java.feb6;

import java.util.ArrayList;
import java.util.List;

import com.java.feb5.Claim;

public class TaskDAOImpl implements TaskDAO{
	
	private List<Task> tasks;
	
	 public TaskDAOImpl() {
	        this.tasks = new ArrayList<>();
	    }
	
	@Override
	public void addTask(Task task) {
		tasks.add(task);
	}

	@Override
	public Task getTaskByName(String taskName) {
		for (Task task : tasks) {
			if(task.getTaskName().equals(taskName)) {
				return task;
			}
		}
		return null;
	}

	@Override
	public List<Task> getAllTasks() {
		return new ArrayList<>(tasks);
	}

	@Override
	public void deleteTask(String taskName) {
	Task taskFound = searchTask(taskName);
	if(taskFound!=null) {
		tasks.remove(taskFound);
	}else {
		System.out.println("Task with name '" + taskName + "' not found. Cannot delete.");
	}
	}
	
	
	public Task searchTask(String name) {
		Task taskfound = null;
		for (Task task : tasks) {
			if(task.getTaskName().equals(name)) {
				taskfound = task;
				break;
			}
		}
		return taskfound;
	}
	
	public void performTask(String name) {
		Task taskfound = searchTask(name);
		if(taskfound!=null) {
			for (int i = 0; i < 5; i++) {
	            System.err.println("The Thread " + name + " called : " + i + " time after 1 Sec of lap");
	            try {
	                // Simulate some work or time-consuming task
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
		}else {
			System.out.println("Task name not Found...");
		}
	}
	public void performDemoThread() {
		Task task1 = new Task();
        task1.setTaskName("Lion");
        for (int i = 0; i < 5; i++) {
            System.out.println(task1 + "Count - " + i);

            try {
                // Simulate some work or time-consuming task
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


	
}
