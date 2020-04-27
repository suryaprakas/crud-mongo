package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends MongoRepository<Course, Long> {

}
