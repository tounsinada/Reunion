package com.GestReunion.service;

import java.util.List;

import com.GestReunion.model.ParticipantExterne;
import com.GestReunion.repository.ReunionRepository;
import com.GestReunion.repository.ReunionRepositoryImpl;

public class ReunionServiceImpl implements ReunionService {
	
	private ReunionRepository ReunionRepo= new ReunionRepositoryImpl();
	
	
	@Override
	public List<ParticipantExterne> findAll(){
		return null;
}


	public ReunionRepository getReunionRepo() {
		return ReunionRepo;
	}


	public void setReunionRepo(ReunionRepository reunionRepo) {
		ReunionRepo = reunionRepo;
	}
}