ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

INSERT INTO
  empresas (nome, cnpj)
VALUES
  ('Santander', 90400888000142),
  ('Bradesco', 60746948000112),
  ('Cielo', 01027058000191);

INSERT INTO
  empresas_unidades (empresa_id, cidade_id, sede)
VALUES
  (1, 1, 1),
  (2, 2, 1)