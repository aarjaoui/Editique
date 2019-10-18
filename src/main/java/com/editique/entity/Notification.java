package com.editique.entity;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Notification {

	private Integer idnotif;
	private Integer iddme;
	private String moddme;
	private Date datnotif;
	private String infolbr;
	private Integer typnotif;

}