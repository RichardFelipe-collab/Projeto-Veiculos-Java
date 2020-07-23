
CREATE DATABASE projeto;
USE `projeto`;


CREATE TABLE `marcas`
(nomemarca VARCHAR(15) NOT NULL,
PRIMARY KEY (nomemarca)
);

INSERT INTO marcas (nomemarca)VALUES('VW'),('Renault'),('Fiat'),('Citroen'),('Chevrolet'),('Ford');


CREATE TABLE modelos
(nomemarca VARCHAR(15) NOT NULL,
nomemodelo VARCHAR(15) NOT NULL,
FOREIGN KEY(nomemarca) REFERENCES marcas(nomemarca)
);

INSERT INTO modelos (nomemarca, nomemodelo)VALUES('Chevrolet', 'Prisma'),('Renault', 'Sandero'),('Ford','Focus'),('Ford','Fusion'),('Fiat','Argo'),
('Fiat','Torus'),('VW','Voyage'),('Chevrolet','Spin'),('Renault','Duster'),('Fiat','Siena'),('Chevrolet','Cruze'),('Ford','EcoSport'),('Ford','Ká'),
('Citroen','C4'),('Citroen','Aircross'),('VW','Gol'),('VW','Jetta');


CREATE TABLE estado
(nomeestado VARCHAR(15) NOT NULL,
PRIMARY KEY (nomeestado));

INSERT INTO estado (nomeestado)VALUES('SP-São Paulo'),('MG-Minas Gerais'),('BH-Bahia'),('PR-Parana'),('RS-Rio Grande do Sul');

CREATE TABLE loja
(idloja VARCHAR(15) NOT NULL,
nomeloja VARCHAR(30) NOT NULL
);

INSERT INTO loja (idloja, nomeloja)VALUES('ljbelém','granmotors belém'),('ljBiritiba','Romeo Biritiba'),('ljPaulista','AlphaM Paulista'),
('ljHnópolis','SpVeiculos Hnópolis'),('ljSM','Pcar São miguel');

CREATE TABLE veiculos
(modelo VARCHAR(15)NOT NULL,
marca VARCHAR(15)NOT NULL,
placa VARCHAR(15)NOT NULL,
ano VARCHAR(15)NOT NULL,
preco NUMERIC(7)NOT NULL,
estado VARCHAR(15)NOT NULL,
loja VARCHAR(30)NOT NULL,
FOREIGN KEY(marca) REFERENCES marcas(nomemarca),
FOREIGN KEY(estado) REFERENCES estado(nomeestado)
);
INSERT INTO veiculos(modelo, marca, placa, ano, preco, estado, loja)VALUES('Duster','Renault','kle2s95','2014',32000,'MG-Minas Gerais','Romeo Biritiba');
INSERT INTO veiculos(modelo, marca, placa, ano, preco, estado, loja)VALUES('Focus','Ford','jkw3j91','2014',49000,'PR-Parana','AlphaM Paulista');
INSERT INTO veiculos(modelo, marca, placa, ano, preco, estado, loja)VALUES('Sandero','Renault','lkj8j91','2016',30000,'RS-Rio Grande do Sul','Pcar São miguel');
INSERT INTO veiculos(modelo, marca, placa, ano, preco, estado, loja)VALUES('Jetta','VW','kci8p82','2018',50000,'SP-São Paulo','SpVeiculos Hnópolis');
INSERT INTO veiculos(modelo, marca, placa, ano, preco, estado, loja)VALUES('Cruze','Chevrolet','ldo2g20','2016',38000,'RS-Rio Grande do Sul','Pcar São miguel');





CREATE TABLE usuario
(login VARCHAR(15) NOT NULL,
senha VARCHAR(15) NOT NULL
);
INSERT INTO usuario(login, senha)VALUES('projeto','projeto');





