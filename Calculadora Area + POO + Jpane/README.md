## Getting Started

Esse é um código simples que implementa uma calculadora de áreas usando programação orientada a objetos em Java. O projeto é dividido em duas classes:
CalculadoraAreasJopObjeto: É responsável pela interface com o usuário e a lógica principal. Apresenta um menu com opções de formas geométricas para cálculo de área, usando caixas de diálogo com imagens. Dependendo da escolha do usuário, chama métodos da classe contas para calcular a área da forma selecionada. Após o cálculo, exibe uma mensagem perguntando se o usuário deseja realizar outro cálculo ou encerrar o programa.

contas: Contém métodos para calcular a área de diferentes formas geométricas (quadrado, triângulo, trapézio, retângulo, paralelogramo e círculo). Cada método solicita ao usuário as medidas necessárias e exibe o resultado do cálculo.

A interação é feita com o usuário através de caixas de diálogo do Swing, e o programa usa loops para repetir o processo até que o usuário decida encerrar. 

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
