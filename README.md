# APRENDIZADO EM JAVA - INICIANDO E AVANÇANDO

<p align="left">
  <img src="https://img.shields.io/badge/Java-25-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 25"/>
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white" alt="IntelliJ IDEA"/>
  <img src="https://img.shields.io/badge/Swing-Desktop-5382A1?style=for-the-badge&logo=openjdk&logoColor=white" alt="Swing"/>
  <img src="https://img.shields.io/badge/status-em_aprendizado-blueviolet?style=for-the-badge" alt="Status: em aprendizado"/>
</p>

<p align="left">
  <img src="https://img.shields.io/github/last-commit/pauloqueirozz01/java?style=flat-square" alt="Último commit"/>
  <img src="https://img.shields.io/github/commit-activity/m/pauloqueirozz01/java?style=flat-square" alt="Commits por mês"/>
  <img src="https://img.shields.io/github/languages/top/pauloqueirozz01/java?style=flat-square" alt="Linguagem principal"/>
  <img src="https://img.shields.io/github/repo-size/pauloqueirozz01/java?style=flat-square" alt="Tamanho do repositório"/>
</p>

No repositório atual, você conseguirá visualizar parte da minha trilha de aprendizado de Java e Sintaxe,
junto com isso, também adicionei listas de exercicios com topicos separados,
dentro da pasta src/estudos/ existem algumas classes criadas para exploração do Java e do IntelliJ IDEA.

### INTUITO DO REPOSITÓRIO
Este repositório registra o início e a evolução da minha jornada com Java: dos primeiros
conceitos de sintaxe e orientação a objetos até projetos completos rodando no terminal e no desktop.
A ideia é que qualquer pessoa (inclusive eu no futuro) consiga ver o caminho percorrido.

### ESTRUTURA DO REPOSITÓRIO
```
src/
├── Conta.java              → estudo de orientação a objetos (classes e objetos)
├── ScreenMatch.java        → estudo de variáveis e tipos
├── estudos/                → classes de estudo (sintaxe, operadores, strings...)
├── exercicios/             → resoluções de listas de exercícios
└── projetos/               → projetos independentes, cada um com seu próprio Main
    ├── terminalia/         → programa de terminal
    └── desktop/            → aplicação com janela (Swing)
```

Cada projeto dentro de `src/projetos/` é um **package** com sua própria classe `Main`,
então todos convivem no mesmo repositório mas rodam de forma independente.

### COMO RODAR NA SUA MÁQUINA

**Pré-requisitos:** [JDK 25](https://adoptium.net/) (Temurin recomendado) e, opcionalmente, o [IntelliJ IDEA](https://www.jetbrains.com/idea/).

```bash
git clone https://github.com/pauloqueirozz01/java.git
cd java
```

**Pelo IntelliJ IDEA:** abra a pasta do projeto, escolha a configuração no seletor do canto
superior direito (`Terminalia` ou `Desktop`) e clique em ▶️ Run. Para as classes de estudo,
abra o arquivo e clique no ▶️ ao lado do método `main`.

**Pelo terminal:**
```bash
# compila tudo
javac -d out $(find src -name "*.java")

# roda o projeto desejado
java -cp out projetos.terminalia.Main
java -cp out projetos.desktop.Main
```

### EXERCICIOS PARA QUEM SE INTERESSAR EM PRATICAR E SUAS RESOLUÇÕES
As resoluções ficam em `src/exercicios/`, organizadas por tópico.
Passar o caminho e explicar o que esperar dentro dos exercícios do repositório

### PROJETOS DESENVOLVIDOS DENTRO DO REPOSITÓRIO
| Projeto | Tipo | Caminho | Classe principal |
|---|---|---|---|
| Terminalia | Terminal | `src/projetos/terminalia` | `projetos.terminalia.Main` |
| Desktop | Janela (Swing) | `src/projetos/desktop` | `projetos.desktop.Main` |

**Para criar um novo projeto:** crie uma pasta em `src/projetos/<nome>`, adicione uma classe
`Main` com `package projetos.<nome>;` na primeira linha e um método `main`.

### TECNOLOGIAS, PACKAGES E DECISÕES TOMADAS DURANTE O APRENDIZADO DA LINGUAGEM
#### Ferramentas
| Tecnologia | Para que serve | Por que escolhi |
|---|---|---|
| **Java 25 (Temurin)** | Linguagem e JDK usados no repositório | Versão LTS mais recente: suporte longo e recursos modernos da linguagem |
| **IntelliJ IDEA** | IDE para escrever, rodar e depurar o código | Autocompletar, depurador e Run Configurations prontas para cada projeto |

#### Packages e classes utilizadas
Todos os packages abaixo já vêm no JDK, então não é preciso instalar nenhuma dependência externa.

| Package / Classe | Onde é usado | O que faz | Por que escolhi |
|---|---|---|---|
| `java.util.Scanner` | `projetos/terminalia` | Lê o que o usuário digita no terminal (`nextLine()`, `nextInt()`...) | Forma mais simples de ler dados do teclado, ideal para programas de terminal e exercícios |
| `javax.swing.JFrame` | `projetos/desktop` | Cria a janela da aplicação (título, tamanho, botão de fechar) | É a base de toda aplicação Swing: tudo é colocado dentro de um `JFrame` |
| `javax.swing.JLabel` | `projetos/desktop` | Exibe um texto (ou imagem) dentro da janela | Componente mais simples para mostrar informação na tela |
| `javax.swing.SwingConstants` | `projetos/desktop` | Constantes de alinhamento, como `CENTER` | Deixa o código mais legível do que usar números "mágicos" |
| `javax.swing.SwingUtilities` | `projetos/desktop` | `invokeLater()` cria a interface na thread de eventos (EDT) | Boa prática do Swing: evita travamentos e bugs visuais |

> **Por que Swing e não JavaFX?** O Swing já vem dentro do JDK e funciona sem configurar nada, o que é ótimo para começar.
> O JavaFX é mais moderno, mas precisa ser baixado e configurado à parte.

### AUTOR
**Paulo André Santos Queiroz**

[![GitHub](https://img.shields.io/badge/GitHub-pauloqueirozz01-181717?style=flat-square&logo=github)](https://github.com/pauloqueirozz01)
