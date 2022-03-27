package com.training.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.entity.Training;
import com.training.service.TrainingService;

@RestController
@RequestMapping("/ttt")
public class TrainingController {
	
	@Autowired
	TrainingService service;
	
	@PostMapping("/addTraining")          // http://localhost:2703/ttt/addTraining
	public Training addTraining(@RequestBody Training t) {
		return service.addTraining(t);
	}
	
	
	@PutMapping("/updateTraining")          // http://localhost:2703/ttt/updateTraining
	public Training updateTraining(@RequestBody Training t) {
		return service.updateTraining(t);
	}
	
	
	@GetMapping("/getTraining/{tid}")          // http://localhost:2703/ttt/getTraining/tid
	public Optional<Training> getTraining(@PathVariable("tid") int tid) {
		return service.getTraining(tid);
	}
	
	@GetMapping("/getAllTraining")          // http://localhost:2703/ttt/getAllTraining
	public Iterable<Training> getAllTraining() {
		return service.getAllTraining();
	}
	
	
	@DeleteMapping("/deleteTraining/{tid}")          // http://localhost:2703/ttt/deleteTraining/tid
	public void deleteTraining(@PathVariable("tid") int tid) {
		service.deleteTraining(tid);
	}
	
	
	

}
