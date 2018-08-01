package com.GestReunion.service;

import java.util.List;

import com.GestReunion.model.ParticipantExterne;

public interface ReunionService {

	List<ParticipantExterne> findAll();

}