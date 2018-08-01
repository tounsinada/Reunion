package com.GestReunion.repository;

import java.util.List;

import com.GestReunion.model.ParticipantExterne;

public interface ReunionRepository {
	List<ParticipantExterne> findAll();

}