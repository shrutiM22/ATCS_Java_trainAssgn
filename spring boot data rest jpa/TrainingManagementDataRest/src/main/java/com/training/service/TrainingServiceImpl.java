package com.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.dao.TrainingDao;
import com.training.entity.Training;

@Service
@Transactional
public class TrainingServiceImpl implements TrainingService {
	
	@Autowired
	TrainingDao dao;

	@Override
	public Training addTraining(Training t) {
		return dao.save(t);
	}

	@Override
	public Training updateTraining(Training t) {
		return dao.save(t);
	}

	@Override
	public void deleteTraining(int tid) {
		dao.deleteById(tid);
	}

	@Override
	public Optional<Training> getTraining(int tid) {
		return dao.findById(tid);
	}

	@Override
	public Iterable<Training> getAllTraining() {
		return dao.findAll();
	}
	
	

}
