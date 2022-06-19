package com.example.springcourseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// singleton
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(  // hardcode dummy data - Spring will automatically convert it to JSON
            new Topic("Spring", "Spring Framework", "a description of the Spring Framework"),
            new Topic("Java", "Core Java", "a description of core java"),
            new Topic("Javascript", "Javascript", "a description of javascript"),
            new Topic("Typescript", "Typescript", "a description of typescript")
    ));

    public List<Topic> getAllTopics() {
        // return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);  //  method ref - lambda basics
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();  // filter lambda expression
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
        // topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);

    }

    public Topic deleteTopic(String id) {
//        try {
//            topics.removeIf(t -> t.getId().equals(id));
//        } catch (Exception e) {
//            System.out.println(e + " Something went wrong!");
//        }
//        return null;

        topicRepository.deleteById(id);
        return null;
    }


}
