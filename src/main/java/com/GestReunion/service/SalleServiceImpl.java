package com.GestReunion.service;

import com.GestReunion.repository.SalleRepositoryImpl;

public class SalleServiceImpl implements SalleService {
	private SalleRepositoryImpl SalleRepo=new SalleRepositoryImpl();

	public SalleRepositoryImpl getSalleRepo() {
		return SalleRepo;
	}

	public void setSalleRepo(SalleRepositoryImpl salleRepo) {
		SalleRepo = salleRepo;
	}
	
	
	
}
