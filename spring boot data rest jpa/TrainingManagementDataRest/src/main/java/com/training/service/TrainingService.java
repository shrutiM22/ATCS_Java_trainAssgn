package com.training.service;

import java.util.List;
import java.util.Optional;

import com.training.entity.Training;

public interface TrainingService {
	
	Training addTraining(Training t);
	
	Training updateTraining(Training t);
	
	void deleteTraining(int tid);
	
	Optional<Training> getTraining(int tid);
	
	Iterable<Training> getAllTraining();
	
	
	

}
