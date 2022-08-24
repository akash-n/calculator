package repositiries;

import org.springframework.data.repository.CrudRepository;

import entities.*;

import entities.Feedback;

@SuppressWarnings("unused")
public interface FeedbackRepository extends CrudRepository<Feedback, Integer>{

}