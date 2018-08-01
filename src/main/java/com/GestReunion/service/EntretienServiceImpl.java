package com.GestReunion.service;

import com.GestReunion.repository.EntretienRepository;
import com.GestReunion.repository.EntretienRepositoryImpl;

public class EntretienServiceImpl implements EntretienService {

	private EntretienRepository entretienRepo=new EntretienRepositoryImpl();

	public EntretienRepository getEntretienRepo() {
		return entretienRepo;
	}

	public void setEntretienRepo(EntretienRepository entretienRepo) {
		this.entretienRepo = entretienRepo;
	}
	
	
}
