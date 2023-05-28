Trabalho 3 - Disciplina de Estrutura Pesquisa e Ordenação de Dados
-------------------------------
Curso de Graduação em Sistemas para Internet - UTFPR TD.

DESCRIÇÃO: Arquivo original [aqui](pdf/trabalho3.pdf)

Estrutura, Pesquisa e Ordenação de Dados (TSI32B)
Professor: Ivan Luiz Salvadori
Trabalho 03
Atenção: Esta atividade será avaliada e corresponderá nota de acordo com o plano de
ensino da disciplina.

Desenvolva um programa em Java capaz de ler um arquivo de texto (.txt) que representa o livro supracitado e fazer a contagem de palavras com maior ocorrência no texto. As palavras devem ser ordenadamente organizadas de forma decrescente, apresentando as palavras de maior ocorrência no início da listagem. Palavras escritas de forma maiúscula ou minúscula devem ser consideradas uma mesma palavra. Ou seja, não deve haver diferenciação quanto ao uso de maiúscula ou minúscula. Além disso, para que o programa seja mais efetivo na contagem de palavras, deve-se ignorar os seguintes caracteres:

* “,” (vírgula)
*  “.” (ponto)
*“-” (traço)
* “:” (dois pontos)
* “;” (ponto e vírgula)
* “?” (interrogação)
* “\””(aspas)

O programa deverá ser implementado com o uso da estrutura de dados correspondente a tabela de espalhamento. O programa deverá apresentar o número de palavras únicas, seguido da listagem das 20 palavras de maior ocorrência.


Para executar o release insira no terminal
``java -jar contadorPalavras.jar``

Requer Java 11.0