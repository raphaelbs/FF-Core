package br.com.ecvtec.corelibrary.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Classe FORM.<br>
 * Representa a tabela t201 do banco de dados.<br>
 * Arquivo auto-gerado pelo GERATIME da Find.
 * @author Juliano Ribeiro, Pedro Henrique, Raphael Brandão
 */ 
@Entity
@Table(name = "t201")
@JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class T201Detalhe implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campo ID - CHAVE SEQUENCIAL (c1_201) da tabela FORM (t201) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int c1_201;

	/** Campo DESCRIÇÃO (c2_201) da tabela FORM (t201) */
	@Size(max = 400, message = "DESCRIÇÃO deve possuir no máximo {max} caracteres.")
	@NotNull
	private String c2_201;

	/** Campo TIPO DO FORM (c3_201_5002) da tabela FORM (t201) */
	@ManyToOne
	@JoinColumn(name = "c3_201_5002", foreignKey = @ForeignKey(name = "r3_201_5002"))
	private T5002 c3_201_5002;

	/** Campo TÍTULO DO FORM (c4_201_801) da tabela FORM (t201) */
	@ManyToOne
	@JoinColumn(name = "c4_201_801", foreignKey = @ForeignKey(name = "r4_201_801"))
	private T801 c4_201_801;

	/** Busca valor do campo ID - CHAVE SEQUENCIAL (c1_201) da tabela FORM (t201) */
	public int getC1_201(){
		return this.c1_201;
	}

	/** Define valor do campo ID - CHAVE SEQUENCIAL (c1_201) da tabela FORM (t201) */
	public void setC1_201(int c1_201){
		this.c1_201 = c1_201;
	}

	/** Busca valor do campo DESCRIÇÃO (c2_201) da tabela FORM (t201) */
	public String getC2_201(){
		return this.c2_201;
	}

	/** Define valor do campo DESCRIÇÃO (c2_201) da tabela FORM (t201) */
	public void setC2_201(String c2_201){
		this.c2_201 = c2_201;
	}

	/** Busca valor do campo TIPO DO FORM (c3_201_5002) da tabela FORM (t201) */
	public T5002 getC3_201_5002(){
		return this.c3_201_5002;
	}

	/** Define valor do campo TIPO DO FORM (c3_201_5002) da tabela FORM (t201) */
	public void setC3_201_5002(T5002 c3_201_5002){
		this.c3_201_5002 = c3_201_5002;
	}

	/** Busca valor do campo TÍTULO DO FORM (c4_201_801) da tabela FORM (t201) */
	public T801 getC4_201_801(){
		return this.c4_201_801;
	}

	/** Define valor do campo TÍTULO DO FORM (c4_201_801) da tabela FORM (t201) */
	public void setC4_201_801(T801 c4_201_801){
		this.c4_201_801 = c4_201_801;
	}

	@Override
	public String toString() {
		return "FORM (t201) ["
			+ "\n\t\tID - CHAVE SEQUENCIAL (c1_201)=" + c1_201
			+ "\n\t\tDESCRIÇÃO (c2_201)=" + c2_201
			+ "]";
	}


}
