package com.associate.details.master.controller;

import java.io.IOException;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.associate.details.master.entity.Associate_Details_Master;
import com.associate.details.master.pdfgenerator.PdfGenerator;
import com.associate.details.master.service.Associate_Details_Master_Service;
import com.lowagie.text.DocumentException;

@Controller
public class Associate_Details_MasterController {
	
	 @Autowired

	  private Associate_Details_Master_Service associate_Details_Master_Service;

	  @GetMapping("/export-to-pdf")

	  public void generatePdfFile(HttpServletResponse response) throws DocumentException, IOException {

	    response.setContentType("application/pdf");

	    DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");

	    String currentDateTime = dateFormat.format(new Date());

	    String headerkey = "Content-Disposition";

	    String headervalue = "attachment; filename=student" + currentDateTime + ".pdf";

	    response.setHeader(headerkey, headervalue);

	    List < Associate_Details_Master > listofAssocioateDetailsMaster = associate_Details_Master_Service.getAssocioateDetailsMasterServiceList();

	    PdfGenerator generator = new PdfGenerator();

	    generator.generate(listofAssocioateDetailsMaster, response);

	  }

}
