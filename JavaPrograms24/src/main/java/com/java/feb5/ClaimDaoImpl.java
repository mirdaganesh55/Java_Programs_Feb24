package com.java.feb5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClaimDaoImpl implements ClaimDAO{
	
static List<Claim> claimList;
private Map<Integer, Claim> claimMap;
	
	static {
		claimList = new ArrayList<Claim>();
	}

	    public ClaimDaoImpl() {
	        this.claimMap = new HashMap<>();
	    }
	
	@Override
	public List<Claim> showClaimDao() {
		return claimList;
	}
	
	

	@Override
	public String addClaimDao(Claim claim) {
		claimList.add(claim);
		return "Record Inserted Successfully...";
	}

	@Override
	public String deleteClaim(int claimId) {
		Claim cliamFound = searchClaimDao(claimId);
		System.err.println("Called Delete method...");
		System.out.println(claimId);
		if(cliamFound!=null) {
		claimMap.remove(claimId);
		return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public Claim searchClaimDao(int claimId) {
		Claim claimFound = null;
		for (Claim claim : claimList) {
			if (claim.getClaimId() == claimId) {
				claimFound = claim;
				break;
			}
		}
		return claimFound;
	}

	@Override
	public String writeClaimFileDao() throws FileNotFoundException, IOException {
		FileOutputStream fout = 
				new FileOutputStream("d:/files/ClaimProject.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(claimList);
			objout.close();
			fout.close();
			return " *** Data Stored in File ***";
	}

	@Override
	public String readClaimFileDao() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("d:/files/ClaimProject.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		claimList = (List<Claim>)objin.readObject();
		objin.close();
		fin.close();
		return "*** Data Retrieved From File ***";
	}

}
