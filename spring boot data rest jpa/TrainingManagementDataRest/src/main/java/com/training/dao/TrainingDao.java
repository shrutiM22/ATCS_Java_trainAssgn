package com.training.dao;

import org.springframework.data.repository.CrudRepository;

import com.training.entity.Training;

public interface TrainingDao extends CrudRepository<Training, Integer>{

}
