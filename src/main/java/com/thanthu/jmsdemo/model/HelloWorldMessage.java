package com.thanthu.jmsdemo.model;

import java.io.Serializable;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorldMessage implements Serializable {

	private static final long serialVersionUID = -8901032227151661376L;

	private UUID id;
	private String message;

}
