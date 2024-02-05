package com.java.feb5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ClaimBAL {
	
	static StringBuilder sb;
	static ClaimDAO dao;
	
	static {
		sb = new StringBuilder();
		dao = new ClaimDaoImpl();
	}
	public List<Claim> showClaimBal() {
		return dao.showClaimDao();
	}
		
	public String addClaimBal(Claim claim) throws Exception {
		if (validateClaim(claim)==true) {
			return dao.addClaimDao(claim);
		}
		throw new Exception(sb.toString());
	}
	
	public String readClaimFileBal() throws FileNotFoundException, ClassNotFoundException, IOException {
		return dao.readClaimFileDao();
	}
	
	public String writeClaimFileBal() throws FileNotFoundException, IOException {
		return dao.writeClaimFileDao();
	}
	public String deleteClaimBal(int empno) {
		return dao.deleteClaim(empno);
	}
	
	public boolean validateClaim(Claim claim) {
		boolean flag = true;
		if (claim.getClaimId() <= 0) {
			flag = false;
			sb.append("ClaimID cannnot be Zero/Negative Number");
		}
		else if(claim.getPatientName().length() < 4) {
			flag = false;
			sb.append("Patient name should contains atleast 4 characters");
		}
		else if (claim.getProviderName().length() < 4) {
			flag = false;
			sb.append("Provider name should contains atleast 4 characters");
		}
		return flag;
	}
}
