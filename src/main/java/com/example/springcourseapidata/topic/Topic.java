package com.example.springcourseapidata.topic;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;

    protected Topic() {}

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Getter
    public String getId() {
        return id;
    }

    @Setter
    public void setId(String id) {
        this.id = id;
    }

    @Getter
    public String getName() {
        return name;
    }

    @Setter
    public void setName(String name) {
        this.name = name;
    }

    @Getter
    public String getDescription() {
        return description;
    }

    @Setter
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
