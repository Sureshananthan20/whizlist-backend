package com.example.taskManager.Repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskManager.Entity.task;
import com.example.taskManager.Entity.user; 
public interface taskRepo extends JpaRepository<task, Integer>{

	List<task> findByuserid(int id);
	
}
