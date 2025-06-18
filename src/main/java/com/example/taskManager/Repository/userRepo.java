package com.example.taskManager.Repository;
 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.taskManager.Entity.*;
@Repository
public interface userRepo extends JpaRepository<user, Integer>{
	@Query("SELECT id FROM user  WHERE username= ?2 AND password = ?1")
	int findByNameAndPass(String name,String pass);
}
