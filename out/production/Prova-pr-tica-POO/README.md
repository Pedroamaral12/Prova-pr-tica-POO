# Prova-pr-tica-POO

Universidade Federal da Bahia
Instituto de Computa¸c˜ao
Departamento de Ciˆencia da Computa¸c˜ao
MATA55 - PROGRAMAC¸AO ORIENTADA A ˜
OBJETOS
Segunda Avalia¸c˜ao
Prof. Felipe Fernandes
09 novembro de 2022
——————————- LEIA COM ATENC¸AO——————— ˜
—————
I A atividade ´e composta por uma quest˜ao-problema.
II A atividade vale 10,0 e corresponde a 100% da nota da segunda
unidade.
III A atividade ´e individual.
IV Os c´odigos devem ser escritos em Java.
V A tarefa deve ser submetida at´e 23h59 do dia 09/11/2022 via
tarefa do AVA.
VI O(A) aluno(a) deve submeter um link para um reposit´orio do
GitHub contendo os c´odigos.
VII Nos dias 07/11/2022 e 09/11/2022, n˜ao haver´a aula presencial.
O(A) aluno(a) receber´a presen¸ca em ambos os dias se, e somente
se, submeter a atividade no prazo correto.
VIII N˜ao ser´a tolerado qualquer tipo de fraude nessa avalia¸c˜ao. E´
considerado fraude copiar todo ou parte de c´odigos da internet
ou de colegas, o que configura pl´agio.
1
IX Ser´a atribu´ıda nota zero (0,0) `a atividade em que for detectada
fraude.
X Se for detectado pl´agio entre duas submiss˜oes, ent˜ao ambas
ter˜ao nota 0.0 (zero).
XI Boa prova!
———————————————————————————-
——————- CRITERIOS DE AVALIAC¸ ´ AO ——————- ˜
I Emprego correto dos conceitos e t´ecnicas de Orienta¸c˜ao a Objeto em Java (abstra¸c˜ao, classes, m´etodos, heran¸ca, associa¸c˜oes
entre objetos, encapsulamento, exce¸c˜oes, cole¸c˜oes, sobrecarga,
sobre-escrita, e polimorfismo).
II Modelagem correta do problema de acordo com o Paradigma
de Orienta¸c˜ao a Objeto.
III Corretude da solu¸c˜ao. Ou seja, o programa implementado responde aos requisitos do problema.
IV Funcionalidade, efic´acia e eficiˆencia da solu¸c˜ao.
V O emprego apropriado de cole¸c˜oes para simular a persistˆencia
de dados.
VI Fluxo de cen´arios de execu¸c˜ao. Tratamento de exce¸c˜oes.
VII C´odigo devidamente organizado, indentado, modularizado, comentado e reutiliz´avel.
——————————————————————————————
———
O Congresso Brasileiro de Programa¸c˜ao Orientada a Objeto (CBPOO)
precisa de um sistema para gerenciar suas atividades. Trˆes tipos de
pessoas est˜ao envolvidos no CBPOO: participantes, organizadores e
especialistas. Os participantes s˜ao aqueles que se inscrevem e, consequentemente, tˆem direito a assistir `as palestras. Os organizadores
s˜ao aqueles que se envolvem diretamente na organiza¸c˜ao do evento
e se dividem em duas categorias: program chairs e general chairs.
O program chair ´e encarregado pela curadoria do conte´udo que ser´a
apresentado no congresso. O general chair ´e encarregado de atividades administrativas. Os especialistas podem ser de dois tipos:
2
autor de artigo ou revisor de artigo. O autor submete um trabalho
escrito ao congresso. Cada artigo deve ter entre 1 e 5 autores, dos
quais, pelo menos um ´e participante do congresso. O revisor analisa
o m´erito do trabalho submetido e envia sua avalia¸c˜ao para o program chair. Cada artigo deve ter entre 2 e 5 revisores. O program
chair tem acesso `a lista dos especialistas, mas n˜ao sabe qual deles
´e participante ou n˜ao. Com base na avalia¸c˜ao dos revisores, o program chair pode rejeitar ou aceitar um artigo. O general chair tem
acesso apenas `a lista de participantes do evento, e n˜ao sabe qual
deles eventualmente ´e autor ou revisor. Com isso, o general chair
pode validar ou invalidar a inscri¸c˜ao de um participante e emitir certificado. Cada pessoa ´e identificada por seu CPF, a apresenta outros
atributos como nome, data de nascimento, titula¸c˜ao acadˆemica, institui¸c˜ao de v´ınculo e senha para login. Para cada especialista se
conhece sua ´area de especialidade. Cada artigo possui um identificador num´erico, t´ıtulo, abstract, palavras-chaves, quantidade de
p´aginas e data de submiss˜ao.
Implemente um programa em Java para atender aos requisitos
do CBPOO. O programa deve mostrar um menu textual. O menu
consiste em uma enumera¸c˜ao de op¸c˜oes. Cada op¸c˜ao possui um
n´umero (1, 2, 3 ... ). O usu´ario deve digitar o n´umero v´alido para
uma op¸c˜ao escolhida. O programa deve solicitar a entrada do
teclado para a executar a opera¸c˜ao e deve mostrar o resultado na
tela. Em seguida, o programa volta para o menu. Esses passos se
repetem at´e que o usu´ario escolha a op¸c˜ao sair. O programa deve
possibilitar as seguintes opera¸c˜oes:
1. Fazer login. O usu´ario deve digitar seu CPF e senha.
2. Inscrever participante. O usu´ario fornece os dados e a inscri¸c˜ao
   fica pendente de valida¸c˜ao.
3. Validar inscri¸c˜ao de participante (exclusivo para o general chair ).
4. Invalidar inscri¸c˜ao de participante (exclusivo para o general
   chair ).
5. Emitir certificado para participante (exclusivo para o general
   chair ).
6. Submeter artigo. Um dos autores fornece os dados do artigo, os
   seus pr´oprios dados e os dados dos demais autores do trabalho.
   3
7. Enviar avalia¸c˜ao de artigo (exclusivo para revisores).
8. Ver avalia¸c˜oes de um artigo. O program chair pode ver todas
   as avalia¸c˜oes de todos os artigos. Um revisor pode ver apanas
   as suas avalia¸c˜oes para os artigos que ele analisou. Um autor
   pode ver todas as avalia¸c˜oes para os seus artigos.
9. Aceitar artigo (exclusivo para o program chair ).
10. Rejeitar artigo (exclusivo para o program chair ).
11. Listar artigos aceitos em ordem alfab´etica. Pode ser executado
    por qualquer pessoa.
12. Listar artigos negados em ordem alfab´etica. Pode ser executado
    por qualquer pessoa.
13. Ver dados de um artigo. Pode ser executado por qualquer pessoa.
14. Listar participantes do evento em ordem alfab´etica.
15. Sair. Encerrar o programa.