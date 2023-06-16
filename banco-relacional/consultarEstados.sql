SELECT * FROM estados;

SELECT nome, sigla from estados

SELECT Sigla, nome as 'Nome do Estado' from estados
WHERE regiao = 'Sudeste';

SELECT nome, regiao from estados
WHERE populacao >= 10 order by populacao desc;