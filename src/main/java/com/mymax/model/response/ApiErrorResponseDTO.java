package com.mymax.model.response;

import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiErrorResponseDTO {

	private String timestamp;
	private int status;
	private HttpStatus error;
    private String message;
//    private String path;
    private List<String> details;
    
	public ApiErrorResponseDTO() {
		super();
	}
	
	public ApiErrorResponseDTO(String timestamp, int status, HttpStatus error, String message,
			List<String> details) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
//		this.path = path;
		this.details = details;
	}

//	public String getPath() {
//		return path;
//	}
//	public void setPath(String path) {
//		this.path = path;
//	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public HttpStatus getError() {
		return error;
	}
	public void setError(HttpStatus error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ApiErrorResponseDTO [timestamp=" + timestamp + ", status=" + status + ", error=" + error + ", message="
				+ message + ", details=" + details + "]";
	}
	    
}
