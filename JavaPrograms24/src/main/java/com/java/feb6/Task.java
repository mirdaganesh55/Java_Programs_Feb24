package com.java.feb6;

public class Task {
	
	private String taskName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + "]";
	}

	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
