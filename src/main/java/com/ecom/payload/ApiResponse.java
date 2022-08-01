package com.ecom.payload;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
import org.springframework.http.HttpStatus;


//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class ApiResponse {
    public ApiResponse(String string, boolean b, HttpStatus ok) {
		// TODO Auto-generated constructor stub
	}
	private String message;
    private Boolean success;
    private HttpStatus status;
	public void setMessage(String message2) {
		// TODO Auto-generated method stub
		
	}
	public void setSuccess(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public void setStatus(HttpStatus badRequest) {
		// TODO Auto-generated method stub
		
	}
}
