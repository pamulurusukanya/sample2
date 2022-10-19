package com.associate.details.master.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.associate.details.master.entity.Associate_Details_Master;
import com.associate.details.master.repo.AssocioateDetailsMasterRepo;




@Service
public class Associate_Details_Master_Service_Impl implements Associate_Details_Master_Service {
	
	@Autowired
	AssocioateDetailsMasterRepo associateDetailsMasterRepo;
	
	@Override
	public void addAssociate_Details_Master(Associate_Details_Master associate_Details_Master) {
		
	}

	@Override
	public List<Associate_Details_Master> getAssocioateDetailsMasterServiceList() {
		return associateDetailsMasterRepo.findAll();
	}

	
}
