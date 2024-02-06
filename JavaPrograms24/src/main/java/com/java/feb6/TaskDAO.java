package com.java.feb6;

import java.util.List;

public interface TaskDAO {

	void addTask(Task task);
	Task getTaskByName(String taskName);
	List<Task> getAllTasks();
	void deleteTask(String taskName);
	
}
