package com.example.springcourseapidata.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
    // custom finders/search
}