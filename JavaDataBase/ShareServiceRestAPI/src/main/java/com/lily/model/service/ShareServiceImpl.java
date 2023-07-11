package com.lily.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lily.dto.Share;
import com.lily.model.persistance.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareDao shareDao;
	
	@Override
	public Share getShareByID(int id) {
		return shareDao.findById(id).orElse(null);
	}

	@Override
	public List<Share> getAllShares() {
		return shareDao.findAll();
	}

}
