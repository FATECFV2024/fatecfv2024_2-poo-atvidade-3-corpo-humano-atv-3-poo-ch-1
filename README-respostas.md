# Simulação de Modificadores de Acesso - Classe Corpo Humano

### Descrição

Este projeto simula o uso de modificadores de acesso e métodos getters/setters em uma classe que representa o Corpo Humano. A classe inclui atributos como altura, peso, volume, densidade, além de métodos para calcular o IMC (Índice de Massa Corporal) e classificar o indivíduo de acordo com seu IMC.

O projeto também contém testes unitários para validar o comportamento dos métodos da classe.

### Funcionalidades

Encapsulamento: Utilização de modificadores de acesso private e public para proteger e controlar o acesso aos atributos da classe.
Cálculo de Volume: Cálculo automático do volume corporal aproximado com base na altura.
Cálculo de Densidade: Cálculo da densidade corporal com base no peso e volume.
Cálculo do IMC: Cálculo do Índice de Massa Corporal e sua classificação.
Testes Unitários: Testes para verificar o comportamento dos getters/setters e os cálculos de volume, densidade e IMC.
Estrutura do Código

### Classe CorpoHumano
A classe CorpoHumano contém os seguintes atributos:

altura: Altura do corpo em metros (privado).
peso: Peso do corpo em kg (privado).
volume: Volume do corpo em metros cúbicos, calculado automaticamente (privado).
densidade: Densidade corporal em kg/m³, calculada automaticamente (privado).
Métodos

Getters/Setters: Para acessar e modificar os valores de altura e peso.
Cálculo de Volume: Calcula o volume corporal aproximado com base na altura.
Cálculo de Densidade: Calcula a densidade corporal com base no peso e volume.
Cálculo do IMC: Calcula o IMC e classifica de acordo com o valor.
Classe Main
A classe App recebe dados de entrada do usuário (altura e peso) e exibe as informações calculadas do corpo humano, incluindo volume, densidade, IMC e classificação do IMC.
### Testes Unitários
A classe CorpoHumanoTest utiliza JUnit para validar:

### Getters e Setters.
Cálculo do IMC e suas classificações.
Cálculo de volume e densidade.
Encapsulamento e Modificadores de Acesso

### Modificador private
O uso de private nos atributos protege os dados internos da classe e impede o acesso direto aos mesmos. Isso garante que a manipulação dos atributos se dê apenas através de métodos controlados (getters e setters), prevenindo atribuições incorretas.

### Perguntas e Respostas
O que acontece se tentarmos atribuir c1.massa = "2";?
* Ocorrência: O código não compilará, pois massa é um atributo privado. A tentativa de acessar diretamente um atributo privado gera um erro de compilação.
* Conclusão: Modificadores de acesso como private protegem os dados de acesso externo, garantindo que só sejam alterados por meio de métodos controlados.
O que acontece se mudarmos private float Massa para public float Massa?
* Ocorrência: O código compilará, e agora o atributo Massa poderá ser alterado diretamente, mesmo com valores inválidos.
* Conclusão: Modificadores public permitem acesso direto ao atributo, violando o encapsulamento e potencialmente gerando inconsistências.
O que acontece se mudarmos public setVolume(float volume) para private setVolume(float volume)?
* Ocorrência: O método setVolume não poderá ser acessado fora da classe CorpoHumano, impedindo que o volume seja alterado diretamente.
* Conclusão: Modificadores private protegem a lógica interna de como os valores são alterados, garantindo maior controle sobre as mudanças nos atributos.

### Conclusão

Esse projeto demonstra o uso prático de modificadores de acesso para encapsular dados e controlar o acesso aos atributos de uma classe, mostrando como getters e setters desempenham um papel essencial no gerenciamento de estado de objetos.

