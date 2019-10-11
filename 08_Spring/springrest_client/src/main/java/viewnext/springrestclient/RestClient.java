package viewnext.springrestclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {

	private static final String URL_SRV_87 = "http://172.16.2.9:8087";
	private RestTemplate rest;
	private HttpHeaders headers;
	private HttpStatus status;

	public RestClient() {
		this.rest = new RestTemplate();
		this.headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Accept", "*/*");
	}

	public String get(String uri) {
		HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
		ResponseEntity<String> responseEntity = 
				rest.exchange(URL_SRV_87 + uri, 
					HttpMethod.GET, 
					requestEntity,
					String.class);
		this.status = responseEntity.getStatusCode();
		return responseEntity.getBody();
	}
	
	public String post(String uri,String jsonAEnviar) {
		HttpEntity<String> requestEntity = new HttpEntity<String>(jsonAEnviar, headers);
		ResponseEntity<String> responseEntity = 
				rest.exchange(URL_SRV_87 + uri, 
					HttpMethod.POST, 
					requestEntity,
					String.class);
		this.status = responseEntity.getStatusCode();
		return responseEntity.getBody();
	}

}
