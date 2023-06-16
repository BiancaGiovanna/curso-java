SELECT
  empresas.nome,
  cidades.nome
FROM
  empresas,
  empresas_unidades,
  cidades
WHERE
  empresas.id = empresas_unidades.empresa_id
  and cidades.id = empresas_unidades.cidade_id