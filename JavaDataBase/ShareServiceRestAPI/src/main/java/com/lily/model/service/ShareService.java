package com.lily.model.service;

import java.util.List;

import com.lily.dto.Share;

public interface ShareService {
	
	public Share getShareByID(int id);
	public List<Share> getAllShares();

}
