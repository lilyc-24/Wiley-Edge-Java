package com.lily.model.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lily.dto.Share;

@Repository
public interface ShareDao extends JpaRepository<Share, Integer> {

}
