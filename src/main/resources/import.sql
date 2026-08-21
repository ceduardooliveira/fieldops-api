-- Povoamento inicial do banco para testes (Senha padrão: 123456)
INSERT INTO tb_usuarios (nome, email, senha, perfil) 
VALUES ('Admin', 'admin@fieldops.com', '$2a$10$e88yR2u/E4E1/P8g7tL5.O1mB/g.J2oK12L3M4N5O6P7Q8R9S0T1U', 'ADMINISTRADOR');

-- Equipamento inicial para testes de campo
INSERT INTO tb_equipamentos (nome, numero_serie) 
VALUES ('Gerador a Diesel X1', 'GER-12345');