package com.crudDemo.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;
import org.json.JSONArray;
@Service
public class ResultConsumerService {

	
	public static int getNumberOfDraw(int year) {
		RestTemplate restTemplate = new RestTemplate();
		int page=1;
		int draws=0;
		boolean hasMorePage=true;
		String baseUrl="https://jsonmock.hackerrank.com/api/football_matches?year=%d&page=%d";
		while(hasMorePage) {
			String Uri =String.format(baseUrl, year,page);
			String response =restTemplate.getForObject(Uri,String.class);
			JSONObject jsonObj = new JSONObject(response);
			JSONArray data =jsonObj.getJSONArray("data");
			for(int i=0;i<data.length();i++) {
				JSONObject match = data.getJSONObject(i);
                if (match.getInt("team1goals") == match.getInt("team2goals")) {
                    draws++;
                }
			}
			 page++;
			 hasMorePage = page <= jsonObj.getInt("total_pages");
		}
		return draws;
	}
}
