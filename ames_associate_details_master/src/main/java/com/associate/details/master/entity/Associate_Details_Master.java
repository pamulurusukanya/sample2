package com.associate.details.master.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.lowagie.text.pdf.PdfPCell;

@Entity
public class Associate_Details_Master {
	
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int associate_Id;
		private String batch_Code;
		private String associate_Name;
		private double assessor_Mark;
		private double mentor_Mark;
		private String assessor_Remarks;
		private String mentor_Remarks;
	
		public Associate_Details_Master() {
			super();
		}

		public Associate_Details_Master(int associate_Id, String batch_Code, String associate_Name,
				double assessor_Marks, double mentor_Marks, String assessor_Remarks, String mentor_Remarks) {
			super();
			this.associate_Id = associate_Id;
			this.batch_Code = batch_Code;
			this.associate_Name = associate_Name;
			this.assessor_Mark = assessor_Marks;
			this.assessor_Remarks = assessor_Remarks;
			this.mentor_Remarks = mentor_Remarks;
		}

		public int getAssociate_Id() {
			return associate_Id;
		}

		public void setAssociate_Id(int associate_Id) {
			this.associate_Id = associate_Id;
		}

		public String getBatch_Code() {
			return batch_Code;
		}

		public void setBatch_Code(String batch_Code) {
			this.batch_Code = batch_Code;
		}

		public String getAssociate_Name() {
			return associate_Name;
		}

		public void setAssociate_Name(String associate_Name) {
			this.associate_Name = associate_Name;
		}

		public double getAssessor_Marks() {
			return assessor_Mark;
		}

		public void setAssessor_Marks(double assessor_Marks) {
			this.assessor_Mark = assessor_Marks;
		}

		public double getMentor_Marks() {
			return mentor_Mark;
		}

		public void setMentor_Marks(double mentor_Marks) {
			this.mentor_Mark = mentor_Marks;
		}

		public String getAssessor_Remarks() {
			return assessor_Remarks;
		}

		public void setAssessor_Remarks(String assessor_Remarks) {
			this.assessor_Remarks = assessor_Remarks;
		}

		public String getMentor_Remarks() {
			return mentor_Remarks;
		}

		public void setMentor_Remarks(String mentor_Remarks) {
			this.mentor_Remarks = mentor_Remarks;
		}

		@Override
		public String toString() {
			return "Associate_Details_Master [associate_Id=" + associate_Id + ", batch_Code=" + batch_Code
					+ ", associate_Name=" + associate_Name + ", assessor_Mark=" + assessor_Mark + ", mentor_Mark="
					+ mentor_Mark + ", assessor_Remarks=" + assessor_Remarks + ", mentor_Remarks=" + mentor_Remarks
					+ "]";
		}
		
		
		
		
		
		
	
	  
	  

}
