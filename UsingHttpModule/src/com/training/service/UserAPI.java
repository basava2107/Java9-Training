package com.training.service;

import java.net.URI;
import java.util.concurrent.CompletableFuture;

import jdk.incubator.http.*;
import jdk.incubator.http.HttpRequest.BodyPublisher;

public class UserAPI {
	
	private URI uri = null;
	
	HttpClient client = HttpClient.newHttpClient();
	
	public  UserAPI() throws Exception {
		uri = new  URI("http://jsonplaceholder.typicode.com/users");
		//uri = new  URI("http://ceo.karnataka.gov.in/RollSearch/Part_List_2018.aspx?ACNO=174");
		//uri = new  URI("http://jsonplaceholder.typicode.com/posts");
	}
	public  void findAll() throws Exception {
		
		//HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request  = HttpRequest.newBuilder().uri(uri).GET().build();
		
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandler.asString());
		
		System.out.println(response.body());
		
		System.out.println(response.statusCode());
		
	}
	
	public void findAsync() throws Exception{
		HttpRequest request  = HttpRequest.newBuilder().uri(uri).GET().build();
		CompletableFuture<String> resp = client.sendAsync(request, HttpResponse.BodyHandler.asString()).thenApply(r->r.body());
		
		System.out.println(resp.get());
		
	}
	
	public void add(String data) throws Exception{
		
		
		BodyPublisher body = BodyPublisher.fromString(data);
		
		HttpRequest request  = HttpRequest.newBuilder().uri(uri).header("Content-Type", "application/json").POST(body).build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandler.asString());
		
		System.out.println(response.statusCode());

	}
	
}
