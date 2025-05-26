package com.example.taskManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.example.taskManager.Entity.task;
import com.example.taskManager.Service.taskService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class taskController {
	@Autowired
	private taskService taskservice;
	
	@PostMapping("/task")
		public task createTask( @RequestBody task task) {
		return taskservice.createTask(task);
	}
	
	@GetMapping("/task")
	public List<task> getTasksbyuserid(@RequestParam int id){
		return taskservice.getTasksbyuserid(id);
	}
	@DeleteMapping("/task/{taskid}")
	public String deleteTask(@PathVariable int taskid) {
		 taskservice.deleteTask(taskid);
		 return "file deleted";
	}
	
	@PutMapping("/task/{id}")
	public ResponseEntity<task> updateTask(@PathVariable int id, @RequestBody task task) {
		task Task= taskservice.updateTask(id,task);
		return ResponseEntity.ok(Task);
		
	}
}
