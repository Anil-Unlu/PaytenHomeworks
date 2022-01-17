package com.homework3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.homework3.Dao.RedisDao;
import com.homework3.Dao.WatchListDao;
import com.homework3.Model.WatchList;
import com.homework3.Repository.WatchListJpaRepository;

public class WatchListIntegrationTest extends BaseIntegrationTest{
	
	@Test
    public void should_create_watchList() {
		
		
		//given
		WatchList watchList = new WatchList();
		ArrayList<Long> arrayList = new ArrayList<Long>();
		arrayList.add(10L);
		arrayList.add(20L);
		watchList.setMemberId("60");
		watchList.setMovieId(arrayList);
		
		//when
		ResponseEntity<WatchList> response = testRestTemplate.postForEntity("/WatchList", watchList, WatchList.class);
		
		
		//Then
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
		assertThat(response.getBody()).isNotNull();
		assertThat(response.getBody().getId()).isNotNull();
		
		
	}

}
