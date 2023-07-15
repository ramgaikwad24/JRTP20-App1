package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.CitizenAppEntity;

public interface CitizenAppsRepository extends JpaRepository<CitizenAppEntity, Integer>{

}
