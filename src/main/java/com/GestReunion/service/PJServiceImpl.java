package com.GestReunion.service;

import com.GestReunion.repository.PJRepositoryImpl;

public class PJServiceImpl implements PJService {
	private PJRepositoryImpl PJRepo = new PJRepositoryImpl();

	public PJRepositoryImpl getPJRepo() {
		return PJRepo;
	}

	public void setPJRepo(PJRepositoryImpl pJRepo) {
		PJRepo = pJRepo;
	}

}
