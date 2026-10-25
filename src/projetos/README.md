# PROJETOS

Projetos independentes. Cada um é um **package** dentro de `src/projetos/` com sua própria classe `Main`,
então todos convivem no mesmo repositório mas rodam separadamente.

### ÍNDICE
| Projeto | Tipo | Pasta | Classe principal | Status |
|---|---|---|---|---|
| [Terminalia](#terminalia) | Terminal | `terminalia/` | `projetos.terminalia.Main` | Iniciado |
| [Desktop](#desktop) | Janela (Swing) | `desktop/` | `projetos.desktop.Main` | Iniciado |
| [GameJava](#gamejava) | A definir | `gamejava/` | `projetos.gamejava.Main` | Em construção |

### COMO RODAR
Pelo IntelliJ, escolha a configuração no seletor do canto superior direito e clique em ▶️ Run.
Pelo terminal (na raiz do repositório):
```bash
javac -d out $(find src -name "*.java")
java -cp out projetos.terminalia.Main
```

### COMO CRIAR UM NOVO PROJETO
1. Crie a pasta `src/projetos/<nome>`.
2. Adicione uma classe `Main` com `package projetos.<nome>;` na primeira linha e um método `main`.
3. Adicione o projeto no ÍNDICE acima e uma seção com o modelo do final deste arquivo.

---

## Decisões gerais

### Um package por projeto, cada um com seu `Main`
Em vez de criar um repositório para cada projeto, todos ficam aqui separados por package. Assim o histórico
de aprendizado fica em um lugar só, e o nome do package (`projetos.terminalia`, `projetos.desktop`...)
evita conflito entre as várias classes chamadas `Main`.

---

## Terminalia
**Pasta:** `terminalia/` · **Tipo:** programa de terminal

**Objetivo:** programa de terminal que conversa com o usuário.

**Packages usados:** `java.util.Scanner`

### Decisões
- **Fechar o `Scanner` no final** (`scanner.close()`): libera o recurso quando o programa não precisa mais ler o teclado.

---

## Desktop
**Pasta:** `desktop/` · **Tipo:** aplicação com janela (Swing)

**Objetivo:** primeira aplicação com interface gráfica.

**Packages usados:** `javax.swing.JFrame`, `JLabel`, `SwingConstants`, `SwingUtilities`

### Decisões
- **Swing em vez de JavaFX:** o Swing já vem dentro do JDK e funciona sem configurar nada, o que é ótimo para
  começar. O JavaFX é mais moderno, mas precisa ser baixado e configurado à parte.
- **Criar a janela dentro de `SwingUtilities.invokeLater()`:** toda interface Swing deve ser criada na thread
  de eventos (EDT). Isso evita travamentos e bugs visuais.
- **`SwingConstants.CENTER` em vez de números:** deixa o alinhamento legível, sem números "mágicos".
- **`setLocationRelativeTo(null)`:** abre a janela centralizada na tela.

---

## GameJava
**Pasta:** `gamejava/` · **Tipo:** a definir

**Objetivo:** *(em construção)*

---

<!--
MODELO PARA NOVO PROJETO (copie o bloco abaixo, preencha e adicione uma linha no ÍNDICE)

## NomeDoProjeto
**Pasta:** `nome/` · **Tipo:** terminal | desktop | ...

**Objetivo:** o que o projeto faz.

**Packages usados:** ...

### Decisões
- **Decisão tomada:** por que essa escolha e quais alternativas foram consideradas.

### Próximos passos
- [ ] ...
-->
