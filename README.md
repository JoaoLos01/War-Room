# War-Room

# Simulação de War Room com Grafos: Vertex Cover

Este repositório contém a solução em Java para o desafio do War Room, desenvolvido para a disciplina de Estruturas de Dados II (5º Semestre de Engenharia de Software). O objetivo é encontrar a Cobertura de Vértices (*Vertex Cover*) mínima para uma rede de infraestrutura crítica comprometida por um ataque cibernético.

## 🚀 Como Compilar e Executar

Abra o seu terminal (CMD ou PowerShell) no Windows e navegue até a pasta onde o arquivo está salvo. Em seguida, execute os comandos:

```bash
# Compile o código Java
javac WarRoomGraph.java

# Execute o programa
java WarRoomGraph
💻 Como Inserir os Valores (Entrada Dinâmica)
Ao executar o programa, o terminal fará duas solicitações de dados. Siga os passos abaixo para mapear a rede afetada:

Passo 1: Quantidade de Conexões
O sistema perguntará: Quantas conexões (arestas) a rede possui?

Digite o número total de ligações entre os dispositivos e aperte Enter.

Passo 2: Mapeamento da Rede
Em seguida, aparecerá: Digite as conexões:

Para cada conexão, digite o número do dispositivo de origem, dê um espaço, digite o número do dispositivo de destino e aperte Enter.

Repita esse processo até inserir todas as conexões informadas no Passo 1.

📌 Exemplo Prático de Uso
Imagine uma rede onde:

O dispositivo 1 está conectado ao 2

O dispositivo 1 está conectado ao 3

O dispositivo 2 está conectado ao 4

No terminal, você digitará exatamente assim:

--- Sistema de Resposta a Incidentes (War Room) ---
Quantas conexões (arestas) a rede possui? 3
Digite as conexões (ex: 1 2, indicando conexão do dispositivo 1 ao 2):
1 2
1 3
2 4
