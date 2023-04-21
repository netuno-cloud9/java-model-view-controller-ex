# MVC (Model – View – Controller)

Objetivo é separar o projeto em três camadas independentes, que são o modelo, a visão e o controlador. Essa separação de camadas ajuda na redução de acoplamento e promove o  aumento de coesão nas classes do projeto.

Acoplamento É o grau em que uma classe conhece a outra. Se o conhecimento da classe A sobre a classe B for através de sua interface, temos um baixo acoplamento, e isso é bom. Por outro lado, se a classe A depende de membros da classe B que não fazem parte da interface de B, então temos um alto acoplamento, o que é ruim.

Coesão - Quando temos uma classe elaborada com um único e bem focado propósito, dizemos que ela tem alta coesão, e isso é bom.

Quando temos uma classe com propósitos que não pertencem apenas a ela, temos uma baixa coesão, o que é ruim.

Isolamento das regras de negócios da lógica de apresentação, que é a interface com o usuário. Isto possibilita a existência de várias interfaces com o usuário
Que podem ser modificadas sem a necessidade de alterar as regras de negócios, proporcionando muito mais flexibilidade.

Pode ser utilizado em vários tipos de projetos como, por exemplo, desktop, web e mobile.

MVC (Model – View – Controller)

A comunicação entre interfaces e regras de negócios é definida através de um controlador, que separa as camadas.

Quando um evento é executado na interface gráfica... Como um clique em um botão; A interface se comunicará com o controlador; Que por sua vez se comunica com as regras de negócios.

Exemplo – Aplicação Financeira usando Swing

Realiza cálculos de diversos tipos, como os de juros.Você pode inserir valores para os cálculos e também escolher que tipo de cálculo será realizado. Isto tudo é feito pela interface gráfica, que para o modelo MVC é conhecida como View. No entanto, o sistema precisa saber que você está requisitando umcálculo, e para isso, terá um botão no sistema que quando clicado gera um evento. Este evento pode ser uma requisição para um tipo de cálculo específico como o de juros simples ou juros compostos.
Fazem parte da requisição os valores digitados no formulário e a seleção do tipo de cálculo que o usuário quer executar sobre o valor informado.

O evento do botão é como um pedido a um intermediador (Controller) que prepara as informações para então enviá-las para o cálculo.

O controlador é o único no sistema que conhece o responsável pela execução do cálculo, neste caso, a camada que contém as regras de negócios.

Esta operação matemática será realizada pelo Model assim que ele receber um pedido do Controller.


O Model realiza a operação matemática e retorna o valor calculado para o Controller que também é o único que possui conhecimento da existência da camada de visualização. Tendo o valor em mãos, o intermediador o repassa para a interface gráfica que exibirá para o usuário.

Caso esta operação deva ser registrada em uma base de dados, o Model se encarrega também desta tarefa.

Processo de fluxo MVC || Utilidade do Controller

O usuário interage com a interface gráfica que é a camada View. A interface gráfica interage com um intermediador que é o Controller e este interage com o Model que executa as regras de negócios do sistema. Mas por que usar a camada Controller? Não seria possível fazer a comunicação direta entre View e Model? Sim, seria possível, mas esta prática não é recomendada por algumas razões.

A ligação direta entre as duas camadas acarretaria para o código da interface duas responsabilidades (Redução da Coesão):

Gerenciar a interface e também lidar com a lógica da camada Model.

Isto deixaria as duas camadas muito dependentes (Aumento do acoplamento):

Não seria possível a reutilização da interface com outro Model sem que fosse preciso modificar a camada de visualização.

Quando se utiliza a camada Controller, a dependência entre o Model e a View são reduzidas ao máximo, possibilitando um projeto mais flexível e expansível.
