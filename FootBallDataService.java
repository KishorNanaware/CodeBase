package com.crudDemo.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import org.json.JSONArray;
import org.json.JSONObject;

@Service
public class FootBallDataService {

	public String getTeamWins(int year, String teamName) {
		RestTemplate restTemplate= new RestTemplate();
		int win=0;
		int page=1;
		boolean hasMorePages=true;
		String baseUrl ="https://jsonmock.hackerrank.com/api/football_matches?year=%d&team1=%s&page=%d";
    System.out.println(year+" "+teamName);
		while(hasMorePages) {
			String url =String.format(baseUrl, year,teamName,page);
			String response = restTemplate.getForObject(url, String.class);
			
			JSONObject jsonObj = new JSONObject(response);
			JSONArray data =jsonObj.getJSONArray("data");
			System.out.println(" "+data);
			for(int i=0;i<data.length();i++) {
				JSONObject matchObj=data.getJSONObject(i);
				if(matchObj.getInt("team1goals") > matchObj.getInt("team2goals")) {
					win++;
				}
			}
			page++;
			hasMorePages = page<=jsonObj.getInt("total_pages");
		}
		return ""+win;
	}
}
