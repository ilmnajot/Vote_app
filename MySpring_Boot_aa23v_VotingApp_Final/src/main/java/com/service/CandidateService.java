package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Candidate;
import com.repository.CandidateRepository;

@Service
public class CandidateService {
	

	private final CandidateRepository canRepo;

    public CandidateService(CandidateRepository canRepo) {
        this.canRepo = canRepo;
    }

    public Candidate addCandidate(Candidate can)
	{
		
		return this.canRepo.save(can);
	}
	
	
	public List<Candidate> getAllCandidates()
	{
		return this.canRepo.findAll();
	}
	
	public Candidate getCandidateById(int id)
	{
		return this.canRepo.getById(id);
	}
	
	public void deleteCandidate(int id)
	{
		this.canRepo.deleteById( id);
	}
	
	public int getNumOfVotes(String candidate)
	{
		return this.canRepo.getNumOfVotes(candidate);
	}

	public Candidate getCandidateByCandidate(String candidate)
	{
		return this.canRepo.getCandidateByCandidate(candidate);
	}
	
	
}
