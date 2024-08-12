# trabalho-de-design

## Autores

- Natael Pontarolo Gomes
- Gabriel Simon Batista Ribeiro
- Inaiê Moscal Zambonin
- Vinícius Fontoura de Abreu

## Diagrama de classes de visão de projeto

Para este projeto, foi criado um diagrama de classes para visualizar a estrutura do projeto. O diagrama de classes foi criado utilizando a ferramenta [Lucidchart](https://www.lucidchart.com/).

![Diagrama de classes](./Diagrama%20de%20Classes_%20Park%20Pass.png)

## Verificação dos diagramas

Foram necessárias algumas correções nas chamadas de métodos e atributos, em relação ao trabalho 1, para que o diagrama de classes estivesse correto e fosse possível implementar o projeto. As correções foram feitas e estão refletidas no diagrama de classes.

Algumas das alterações foram:

- Mudança nos tipos de retorno de alguns métodos(para void pois não era necessário retornar nada);
- Mudança nos tipos de parâmetros de alguns métodos;
- Mudança em alguns atributos do sistema e Cliente para que fosse possível implementar o projeto.

Apesar das alterações, o diagrama de classes está correto e reflete a estrutura do projeto.

## Compilando

Para compilar o projeto, basta executar o comando `javac *.main` na raiz do projeto.

```bash
javac *.java
```

Um arquivo `.class` será gerado para cada arquivo `.java` presente no diretório.

## Como executar

Para executar o projeto, basta executar o comando `java Main` na raiz do projeto.

```bash
java Main
```

## Testando o projeto

Ao iniciar, o programa irá solicitar uma senha de login. A senha fictícia criada é `123456`. Você verá a seguinte mensagem:

```text
Bem-vindo ao estacionamento do Natael
Faça login para continuar
Digite a senha do usuário: 
123456
```

Após digitar a senha correta, você verá o menu principal:

```text
Escolha uma opção: 
1 - Reservar vaga
2 - Cancelar reserva
3 - Minhas reservas
4 - Meus veículos
5 - Ver estacionamentos
9 - Sair
```

A partir daqui, você pode escolher uma das opções digitando o número correspondente e pressionando `Enter`.

## Reservar vaga

Para reservar uma vaga, basta escolher a opção `1` no menu principal. Você verá a seguinte mensagem:

```text
ID: 0
Nome: Estacionamento do Natael

ID: 1
Nome: Estacionamento do João

ID: 2
Nome: Estacionamento do Maria

Escolha um estacionamento:
```

Aqui, você pode escolher um dos estacionamentos listados digitando o número do ID e pressionando `Enter`. Em seguida, você verá a seguinte mensagem:

```text
Seus veiculos: 
Veiculos de Natael
Veiculo [id=1, placa=VCIXAOD, tipoVeiculo=CARRO, ano=2012]
Escolha um veículo:
```

Aqui, você pode escolher um dos veículos listados digitando o número do ID e pressionando `Enter`. Em seguida, você verá a seguinte mensagem:

```text
VAGAS DISPONIVEIS TIPO CARRO
____________________________________________________
ID da Vaga: 5 
Tipo da Vaga: ESPECIAL 
Tipo de Veículo: CARRO 
Status: Disponível 
____________________________________________________
ID da Vaga: 7 
Tipo da Vaga: SIMPLES 
Tipo de Veículo: CARRO 
Status: Disponível 
____________________________________________________
ID da Vaga: 12 
Tipo da Vaga: ESPECIAL 
Tipo de Veículo: CARRO 
Status: Disponível 
____________________________________________________
ID da Vaga: 15 
Tipo da Vaga: SIMPLES 
Tipo de Veículo: CARRO 
Status: Disponível 
____________________________________________________
Escolha a vaga desejada:
```

Ao escolher a vaga, você verá a seguinte mensagem:

```text
Reserva realizada com sucesso!
```

## Minhas reservas

Após ter feito uma reserva, você pode visualizá-la escolhendo a opção `3` no menu principal. Você verá a seguinte mensagem com as reservas ativas:

```text
ID da Reserva: 1
Nome do Estacionamento: Estacionamento do Natael
Numero da Vaga: 7
Data: 2024-08-12
Hora: 12:56:28.015245455
Tipo de Veículo: CARRO
```

## Cancelar reserva

Após ter feito uma reserva, você pode cancelá-la escolhendo a opção `2` no menu principal. Você verá a seguinte mensagem com as reservas ativas:

```text
ID da Reserva: 0
Nome do Estacionamento: Estacionamento do Natael
Numero da Vaga: 15
Data: 2024-08-12
Hora: 12:54:52.945989858
Tipo de Veículo: CARRO

Digite o id da reserva que deseja cancelar:
```

Aqui, você pode escolher a reserva que deseja cancelar digitando o número do ID e pressionando `Enter`. Em seguida, você verá a seguinte mensagem:

```text
Reserva cancelada com sucesso!
```

## Meus veículos

Você pode visualizar os veículos cadastrados escolhendo a opção `4` no menu principal. Você verá a seguinte mensagem com os veículos cadastrados:

```text
Veiculos de Natael
Veiculo [id=1, placa=VCIXAOD, tipoVeiculo=CARRO, ano=2012]
```

Vale ressaltar que os veículos são cadastrados automaticamente ao iniciar o programa, de forma aleatório entre 1 e 3 veículos.

## Ver estacionamentos

Você pode visualizar os estacionamentos cadastrados escolhendo a opção `5` no menu principal. Você verá a seguinte mensagem com os estacionamentos cadastrados:

```text
ID: 0
Nome: Estacionamento do Natael

ID: 1
Nome: Estacionamento do João

ID: 2
Nome: Estacionamento do Maria

Digite o id do estacionamento que deseja ver os detalhes:
```

Aqui, você pode escolher o estacionamento que deseja visualizar digitando o número do ID e pressionando `Enter`. Em seguida, você verá a seguinte mensagem com os detalhes do estacionamento:

```text
ID: 0
Nome: Estacionamento do Natael
CNPJ: 123456789
Responsável: Natael
Endereço: Rua dos Bobos, 0
Telefone: 123456789
Email: natael@gmail.com
Horário de Funcionamento: 08:00 - 18:00
```

## Conclusão

O projeto foi implementado com sucesso e as funcionalidades estão de acordo com o que foi proposto. O diagrama de classes foi de grande ajuda para visualizar a estrutura do projeto e implementá-lo de forma correta. Além disso, o diagrama foi muito importante para identificar e corrigir possíveis erros antes de implementar o projeto.
