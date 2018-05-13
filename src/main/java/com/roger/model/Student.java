package com.roger.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

	private static final long serialVersionUID = 6415166769083628097L;

	private Integer id;
	private String name;
	private Integer age;
}
