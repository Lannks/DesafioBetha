package net.betha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees" )
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "problema")
	private String problema;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "inicio")
	private String inicio;
	
	@Column(name = "fim")
	private String fim;
	
	@Column(name = "pendente_fl")
	private String pendente_fl;
	
	public Employee() {
		
	}
	
	public Employee(String nome, String endereco, String telefone, String email, String problema, String tipo,
			String marca, String inicio, String fim, String pendente_fl) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.problema = problema;
		this.tipo = tipo;
		this.marca = marca;
		this.inicio = inicio;
		this.fim = fim;
		this.pendente_fl = pendente_fl;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	public String getFim() {
		return fim;
	}
	public void setFim(String fim) {
		this.fim = fim;
	}
	public String getPendente_fl() {
		return pendente_fl;
	}
	public void setPendente_fl(String pendente_fl) {
		this.pendente_fl = pendente_fl;
	}
}
