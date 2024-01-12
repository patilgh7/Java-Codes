package com.demo.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.student.model.Student;

//JpaRepository extends->PagingAndSortingRepository extends->CrudRepository -> save() 

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
