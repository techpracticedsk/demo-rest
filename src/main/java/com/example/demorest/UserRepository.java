package com.example.demorest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

   @Query(value = "select city from User", nativeQuery = true)
   List<Object[]>  findAllUserCities();

   @Query(value = "select fName, city, email from User where fName=:fName", nativeQuery = true)
   List<Object[]>  findUsersByFirstName(@Param("fName")String firstName);


}
