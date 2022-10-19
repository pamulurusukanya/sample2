package com.associate.details.master.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.associate.details.master.entity.Associate_Details_Master;




@Repository
public interface AssocioateDetailsMasterRepo extends JpaRepository<Associate_Details_Master, Integer>{

}
