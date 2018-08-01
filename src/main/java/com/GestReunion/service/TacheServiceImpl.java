package com.GestReunion.service;

import com.GestReunion.repository.TacheRepositoryImpl;

public class TacheServiceImpl implements TacheService {
	
	private TacheRepositoryImpl tacheRepo =new TacheRepositoryImpl();

	public TacheRepositoryImpl getTacheRepo() {
		return tacheRepo;
	}

	public void setTacheRepo(TacheRepositoryImpl tacheRepo) {
		this.tacheRepo = tacheRepo;
	}

}
