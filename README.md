# TrabalhoSpringDW

<h2>Jogador</h2>

($${\color{blue}GET}$$)
Listar todos os jogadores: http://localhost:8000/jogador/listar 
<br>
($${\color{blue}GET}$$)
Listar jogador por id: http://localhost:8000/jogador/listarId/{cod_jogador} <- <i>Substituir {cod_jogador} por id da tabela</i>
<br>
($${\color{green}POST}$$)
Cadastrar novo jogador: http://localhost:8000/jogador/create --- <i>Body da requisição: </i>
<br>
{
  "nome": "TesteTeste",
  "email": "testetesteteste@gmail.com",
  "datanasc": "2024-05-13"
}
<br>
<br>
($${\color{teal}PUT}$$)
Atualizar jogador: http://localhost:8000/jogador/update/{cod_jogador} --- <i>Body da requisição:</i>
<br>
{
  "nome": "teste",
  "email": "teste@gmail.com",
  "datanasc": "2002-05-13"
}
<br>
<br>
($${\color{red}DELETE}$$)
Deletar jogador: http://localhost:8000/jogador/delete/{cod_jogador}
<br>
($${\color{red}DELETE}$$)
Deletar todos os jogadores: http://localhost:8000/jogador/deleteAll
<hr>
<h2>Pagamentos</h2>

($${\color{blue}GET}$$)
Listar todos os pagamentos: http://localhost:8000/pagamento/listar
<br>
($${\color{blue}GET}$$)
Listar pagamentos por ano: http://localhost:8000/pagamento/listarAno/{ano} <--- <i>Substituir {ano} por um ano entre 1 e 9999</i>
<br>
($${\color{blue}GET}$$)
Listar pagamentos por mes: http://localhost:8000/pagamento/listarMes/{mes} <--- <i>Substituir {mes} por um mês entre 1 e 12</i>
<br>
($${\color{blue}GET}$$)
Listar pagamentos por jogador: http://localhost:8000/pagamento/listarJogador/{codJogador} <--- <i>Substituir {codJogador} por um ID de jogador</i>
<br>
($${\color{Green}POST}$$)
Cadastrar novo pagamento: http://localhost:8000/pagamento/create <--- <i>Body da requisição: </i>
<br>
{
  "ano": 2024,
  "mes": 10,
  "valor": 123.45,
  "codJogador": 20
}
<br>
<br>
($${\color{teal}PUT}$$)
Atualizar um pagamento: http://localhost:8000/pagamento/update/{cod_pagamento} <--- <i>Substituir cod_pagamento por ID de pagamento ---- Body da requisição: </i>
<br>
{
  "ano": 1900,
  "mes": 12,
  "valor": 6543.21,
  "codJogador": 21
}
<br>
<br>
($${\color{red}DELETE}$$)
Deletar um pagamento: http://localhost:8000/pagamento/delete/{cod_pagamento} <--- <i>Substituir cod_pagamento por ID de pagamento
<br>
($${\color{red}DELETE}$$)
Deletar todos os pagamentos: http://localhost:8000/pagamento/deleteAll
