
SELECT * from estados;

INSERT INTO cidades (nome,area,estado_id)
VALUES('Campinas', 795, 25);

INSERT INTO cidades (nome,area,estado_id)
VALUES('Niterói', 133.9, 19);

INSERT INTO cidades 
      (nome,area,estado_id)
VALUES (
  'Carapicuiba',
  34.97,
  (SELECT id from estados WHERE sigla = 'SP')
);