package com.lily.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lily.dto.Share;
import com.lily.dto.ShareList;
import com.lily.model.service.ShareService;

@RestController
public class ShareResource {
	
	@Autowired
	private ShareService shareService;
	
	@GetMapping(path = "/shares/{shareID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Share> getShareByID(@PathVariable("shareID") int id){
		Share share = shareService.getShareByID(id);
		
		if (share != null) {
			return new ResponseEntity<Share>(share, HttpStatus.FOUND);
		}else {
			return new ResponseEntity<Share>(share, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(path = "/shares", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ShareList> getAllShares(){
		ShareList shareList = new ShareList(shareService.getAllShares());
		
		if (shareList.getShareList().size()>0) {
			return new ResponseEntity<ShareList>(shareList, HttpStatus.FOUND);
		}else {
			return new ResponseEntity<>(shareList, HttpStatus.NOT_FOUND);
		}
	}

}
