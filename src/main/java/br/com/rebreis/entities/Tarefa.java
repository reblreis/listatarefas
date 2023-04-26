package br.com.rebreis.entities;

import java.util.Date;

public class Tarefa {

	private Integer idTarefa;
	private String descricao;
	private Boolean concluido;
	private Date dataCriacao;
	private Date dataConcluida;
	private Integer idUsuario;
	private Usuario usuario;

	public Tarefa() {
		// TODO Auto-generated constructor stub
	}

	public Tarefa(Integer idTarefa, String descricao, Boolean concluido, Date dataCriacao, Date dataConcluida,
			Integer idUsuario, Usuario usuario) {
		super();
		this.idTarefa = idTarefa;
		this.descricao = descricao;
		this.concluido = concluido;
		this.dataCriacao = dataCriacao;
		this.dataConcluida = dataConcluida;
		this.idUsuario = idUsuario;
		this.usuario = usuario;
	}

	public Integer getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(Integer idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getConcluido() {
		return concluido;
	}

	public void setConcluido(Boolean concluido) {
		this.concluido = concluido;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataConcluida() {
		return dataConcluida;
	}

	public void setDataConcluida(Date dataConcluida) {
		this.dataConcluida = dataConcluida;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Tarefa [idTarefa=" + idTarefa + ", descricao=" + descricao + ", concluido=" + concluido
				+ ", dataCriacao=" + dataCriacao + ", dataConcluida=" + dataConcluida + ", idUsuario=" + idUsuario
				+ ", usuario=" + usuario + "]";
	}
}