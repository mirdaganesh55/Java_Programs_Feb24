package com.java.feb5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ClaimDAO {
	List<Claim> showClaimDao();
	String addClaimDao(Claim claim);
	String deleteClaim(int claimId);
	Claim searchClaimDao(int claimId);
	String writeClaimFileDao() throws FileNotFoundException, IOException, FileNotFoundException, IOException;
	String readClaimFileDao() throws FileNotFoundException, IOException, ClassNotFoundException;
}
