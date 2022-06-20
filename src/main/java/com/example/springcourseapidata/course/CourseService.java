package com.example.springcourseapidata.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// singleton
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    private List<Course> courses = new ArrayList<>(Arrays.asList(  // hardcode dummy data - Spring will automatically convert it to JSON
            new Course("Spring", "Spring Framework", "a description of the Spring Framework"),
            new Course("Java", "Core Java", "a description of core java"),
            new Course("Javascript", "Javascript", "a description of javascript"),
            new Course("Typescript", "Typescript", "a description of typescript")
    ));

    public List<Course> getAllCourses() {
        // return topics;
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);  //  method ref - lambda basics
        return courses;
    }

    public Optional<Course> getCourse(String id) {
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();  // filter lambda expression
        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
        // topics.add(topic);
        courseRepository.save(course);
    }

    public void updateCourse(String id, Course course) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
        courseRepository.save(course);

    }

    public Course deleteCourse(String id) {
//        try {
//            topics.removeIf(t -> t.getId().equals(id));
//        } catch (Exception e) {
//            System.out.println(e + " Something went wrong!");
//        }
//        return null;

        courseRepository.deleteById(id);
        return null;
    }


}
