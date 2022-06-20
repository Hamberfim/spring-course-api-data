package com.example.springcourseapidata.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
    // custom finders/search
    // topicId for course all search
    public List<Course> findByTopicId(String topicId);  // Topic class and it's property topicId

}
