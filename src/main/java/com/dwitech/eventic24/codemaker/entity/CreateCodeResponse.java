package com.dwitech.eventic24.codemaker.entity;

import com.dwitech.eventic24.CoreResponse;

import javax.validation.ConstraintViolation;
import java.util.Set;

public class CreateCodeResponse extends CoreResponse {
	private String codePath;

	public CreateCodeResponse(Set<? extends ConstraintViolation<?>> violations) {
		super(violations);
	}

	public CreateCodeResponse() {}

	public String getCodePath() { return codePath; }
	public void setCodePath(String codePath) { this.codePath = codePath; }

	@Override
	public String toString() {
		return "CreateCodeResponse{" +
				       "codePath=" + codePath +
				       ", success=" + success +
				       ", status='" + status + '\'' +
				       ", message='" + message + '\'' +
				       '}';
	}
}
