SELECT 
  cidades.nome as Cidade,
  estados.nome as Estado,
  regiao as Região

from estados inner JOIN cidades on estados.id = cidades.estado_id;