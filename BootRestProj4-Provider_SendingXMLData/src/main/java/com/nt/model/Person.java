package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Person {
		private Integer id;
		private String name;
		private String addrs;
		private double income;
		private String[] favcolors;
		private List<String> friends;
		private Set<Long> phonenumbers;
		private Map<String,Object> identity;
		private IrctcDetails irctcd;
}
