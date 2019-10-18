package com.editique.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data
@Entity
public class Demande implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iddme;
	private String moddme;
	private String coddmn;
	private Integer codintmdl;
	private String matges;
	private Date datrec;
	private String iddes;
	private String typdes;
	private String codgrp;
	private String codsoc;
	private String codcnt;
	private Integer notifenv;
	private Integer notifged;
	private Integer notiferr;
	public Long getIddme() {
		return iddme;
	}
	public void setIddme(Long iddme) {
		this.iddme = iddme;
	}
	public String getModdme() {
		return moddme;
	}
	public void setModdme(String moddme) {
		this.moddme = moddme;
	}
	public String getCoddmn() {
		return coddmn;
	}
	public void setCoddmn(String coddmn) {
		this.coddmn = coddmn;
	}
	public Integer getCodintmdl() {
		return codintmdl;
	}
	public void setCodintmdl(Integer codintmdl) {
		this.codintmdl = codintmdl;
	}
	public String getMatges() {
		return matges;
	}
	public void setMatges(String matges) {
		this.matges = matges;
	}
	public Date getDatrec() {
		return datrec;
	}
	public void setDatrec(Date datrec) {
		this.datrec = datrec;
	}
	public String getIddes() {
		return iddes;
	}
	public void setIddes(String iddes) {
		this.iddes = iddes;
	}
	public String getTypdes() {
		return typdes;
	}
	public void setTypdes(String typdes) {
		this.typdes = typdes;
	}
	public String getCodgrp() {
		return codgrp;
	}
	public void setCodgrp(String codgrp) {
		this.codgrp = codgrp;
	}
	public String getCodsoc() {
		return codsoc;
	}
	public void setCodsoc(String codsoc) {
		this.codsoc = codsoc;
	}
	public String getCodcnt() {
		return codcnt;
	}
	public void setCodcnt(String codcnt) {
		this.codcnt = codcnt;
	}
	public Integer getNotifenv() {
		return notifenv;
	}
	public void setNotifenv(Integer notifenv) {
		this.notifenv = notifenv;
	}
	public Integer getNotifged() {
		return notifged;
	}
	public void setNotifged(Integer notifged) {
		this.notifged = notifged;
	}
	public Integer getNotiferr() {
		return notiferr;
	}
	public void setNotiferr(Integer notiferr) {
		this.notiferr = notiferr;
	}
	
	

}
