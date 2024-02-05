package com.java.feb5;

import java.io.Serializable;
import java.util.Date;

public class Claim implements Serializable{
	
		private int claimId;
	    private String patientName;
	    private String providerName;
	    private Date dateOfService;
	    private double totalClaimAmount;
	    private boolean isApproved;
	    
		public int getClaimId() {
			return claimId;
		}
		public void setClaimId(int claimId) {
			this.claimId = claimId;
		}
		public String getPatientName() {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public String getProviderName() {
			return providerName;
		}
		public void setProviderName(String providerName) {
			this.providerName = providerName;
		}
		public Date getDateOfService() {
			return dateOfService;
		}
		public void setDateOfService(Date dateOfService) {
			this.dateOfService = dateOfService;
		}
		public double getTotalClaimAmount() {
			return totalClaimAmount;
		}
		public void setTotalClaimAmount(double totalClaimAmount) {
			this.totalClaimAmount = totalClaimAmount;
		}
		public boolean isApproved() {
			return isApproved;
		}
		public void setApproved(boolean isApproved) {
			this.isApproved = isApproved;
		}
		@Override
		public String toString() {
			return "Claim [claimId=" + claimId + ", patientName=" + patientName + ", providerName="
					+ providerName + ", dateOfService=" + dateOfService + ", totalClaimAmount=" + totalClaimAmount
					+ ", isApproved=" + isApproved + "]";
		}
		public Claim(int claimId, String patientName, String providerName, Date dateOfService,
				double totalClaimAmount, boolean isApproved) {
			super();
			this.claimId = claimId;
			this.patientName = patientName;
			this.providerName = providerName;
			this.dateOfService = dateOfService;
			this.totalClaimAmount = totalClaimAmount;
			this.isApproved = isApproved;
		}
		public Claim() {
			super();
			// TODO Auto-generated constructor stub
		}
}
