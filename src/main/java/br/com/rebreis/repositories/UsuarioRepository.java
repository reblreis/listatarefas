package br.com.rebreis.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.rebreis.entities.Usuario;
import br.com.rebreis.factories.ConnectionFactory;

public class UsuarioRepository {

	public void create(Usuario usuario) throws Exception {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.getConnection();

		PreparedStatement statement = connection
				.prepareStatement("insert into usuario(nome, email, senha) values(?, ?, ?)");
		statement.setString(1, usuario.getNome());
		statement.setString(2, usuario.getEmail());
		statement.setString(3, usuario.getSenha());
		statement.execute();

		connection.close();
	}
}