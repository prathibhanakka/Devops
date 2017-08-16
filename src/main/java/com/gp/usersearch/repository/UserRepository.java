/**
 * 
 */
package com.gp.usersearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gp.usersearch.entities.Usermaster;

/**
 * @author ganeshp
 *
 */
@RepositoryRestResource(collectionResourceRel = "usermaster", path = "userdetails")
public interface UserRepository extends JpaRepository<Usermaster, Long> {
	
	
	Usermaster findByUsername(@Param("username") String username);
	List<Usermaster> findByFirstnameStartingWith(@Param("firstname") String firstname);
	Usermaster findByFirstnameLike(String firstname);
	


	
}
