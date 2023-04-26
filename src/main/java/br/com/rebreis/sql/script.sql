create table usuario(
	idusuario 	serial 			primary key,
	nome 		varchar(100) 	not null,
	email 		varchar(50) 	not null unique,
	senha 		varchar(40) 	not null
);

create table tarefa(
	idtarefa 		serial 			primary key,
	descricao 		varchar(100) 	not null,
	concluido		boolean			not null,
	datacriacao		timestamp	 	not null,
	dataconcluida 	timestamp,
	idusuario 		integer 		not null,
	foreign key(idusuario) references usuario(idusuario)
);