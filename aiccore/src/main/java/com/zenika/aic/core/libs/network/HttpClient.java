package com.zenika.aic.core.libs.network;

import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public final class HttpClient {	
	private String host;
	private String data;

	/**
	 * Create an http client which will try to connect to the remote host and send data
	 * @param host Remote host. The host must include the port number if required
	 * @param data Data to send. Data must be a string.
	 */
	public HttpClient(String host, String data) {
		this.host = host;
		this.data = data;
	}

	/**
	 * Send data using http POST request method.
	 * @param service Service to address. The service can be an url ex : api/example/create
	 * @throws IOException
	 * @throws URISyntaxException
	 * @throws HttpException
	 */
	public final void sendPost(String service) throws IOException, URISyntaxException, HttpException {
		if(!service.isEmpty())
			this.host += "/" + service;

		DefaultHttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(host);
        post.setHeader("Content-Type", "application/json");
        HttpEntity entity = new StringEntity(data);
        post.setEntity(entity);
        HttpResponse response = client.execute(post);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
	}

	/**
	 * Send data using http POST request method.
	 * @throws IOException
	 * @throws URISyntaxException
	 * @throws HttpException
	 */
	public final void sendPost() throws IOException, URISyntaxException, HttpException {
		this.sendPost("");
	}
}
