CREATE DATABASE palestra CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE produto(
  id NUMBER PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(255) NOT NULL,
  preco DECIMAL(6,2) NOT NULL,
  quantidade INTEGER NOT NULL
);

INSERT INTO produto(nome, preco, quantidade) VALUES
  ('MacBook Pro', 10000.00, 5),
  ('iPhone', 8000.00, 10),
  ('Nokia N97 raro para colecionadores', 5000.00, 1),
  ('Patinete elétrico', 3500.00, 5),
  ('Robô da Xiaomi', 600.00, 50),
  ('Aspirador de pó da Xiaomi', 2500.00, 3);
