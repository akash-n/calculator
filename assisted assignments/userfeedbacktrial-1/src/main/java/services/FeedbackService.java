package services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Feedback;
import repositiries.FeedbackRepository;
import repositiries.*;

@SuppressWarnings("unused")
@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public Iterable<Feedback> GetAllFeedback() {
		return feedbackRepository.findAll();
	}
	

}
