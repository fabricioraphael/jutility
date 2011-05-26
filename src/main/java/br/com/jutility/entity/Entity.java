package br.com.jutility.entity;

import java.util.Calendar;

public class Entity {

	//private int id;
	private Calendar date;
	private String email;
	private Integer phone;
	private String cpf;
	private String cnpj;
	
	public Entity(){super();}
	
	public Entity(Calendar date, String email, Integer phone, String cpf, String cnpj){
		this.setDate(date);
		this.setEmail(email);
		this.setPhone(phone);
		this.setCpf(cpf);
		this.setCnpj(cnpj);
	}
	
	public String toString(){
		return ("Date: " + getDate() +" E-mail: " + getEmail() + " Phone: " + getPhone() + " CPF: " + getCpf() + " CNPJ: " + getCnpj());
	}
	
	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
		
}
