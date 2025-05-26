package com.example.taskManager.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskManager.Entity.task;
import com.example.taskManager.Entity.user;
import com.example.taskManager.Repository.taskRepo;
import com.example.taskManager.Repository.userRepo;

@Service
public class taskService {
	
	 @Autowired
	    private taskRepo taskRepository;

	
	
	public task createTask(task task) {
		return taskRepository.save(task);
			
	}

	public List<task> getTasksbyuserid(int id) {
		// TODO Auto-generated method stub
		  return taskRepository.findByuserid(id);
		
	}

	public void deleteTask( int taskid) {
		// TODO Auto-generated method stub
		
		 taskRepository.deleteById(taskid);
	}
	public task updateTask(int id,task updatedtask) {
		task Task=taskRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Task not found ith id : " +id));
			Task.setDueDate(updatedtask.getDueDate());
			Task.setTask(updatedtask.getTask());
			return taskRepository.save(Task);
			
		}
		
	}


