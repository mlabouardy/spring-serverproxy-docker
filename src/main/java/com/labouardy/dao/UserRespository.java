package com.labouardy.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.labouardy.model.User;

@RepositoryRestResource
public interface UserRespository extends JpaRepository<User, Long>{
	
	@Query("SELECT u FROM User u WHERE u.username LIKE :keyword")
	Collection<User> findByKeyword(@Param("keyword") String keyword);

}
