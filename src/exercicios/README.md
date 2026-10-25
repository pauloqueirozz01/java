# EXERCÍCIOS

Resoluções de listas de exercícios, cada uma em sua própria classe dentro do package `exercicios`.
Aqui ficam o enunciado resumido, como rodar e, principalmente, **as decisões tomadas** durante a resolução.

### ÍNDICE
| Exercício | Arquivo | O que pratica |
|---|---|---|
| [CadastroEstudante](#cadastroestudante) | `CadastroEstudante.java` | Ler dados pelo terminal, converter texto em número, calcular média e exibir um resumo |

### COMO RODAR
Pelo IntelliJ, abra o arquivo e clique no ▶️ ao lado do `main`. Pelo terminal (na raiz do repositório):
```bash
javac -d out $(find src -name "*.java")
java -cp out exercicios.CadastroEstudante
```

---

## CadastroEstudante
**Arquivo:** `CadastroEstudante.java`

**Enunciado:** primeira funcionalidade de um sistema de cadastro de estudantes. Funciona só pelo terminal:
coleta nome, idade e três notas do aluno e, se o usuário quiser, calcula a média e exibe um resumo.

**Conceitos praticados:** `Scanner`, conversão de tipos (`Integer.parseInt`, `Double.parseDouble`),
`if/else`, `equalsIgnoreCase`, text blocks e `formatted()`.

### Decisão: ler números como texto e converter depois
A idade e as notas não são lidas direto como número.
Para cada uma delas uso **duas variáveis**: uma guarda o texto digitado e a outra guarda o valor já convertido.

```java
String idadeDigitada = scanner.nextLine();           // o que o usuário digitou, como texto
int idadeEstudante = Integer.parseInt(idadeDigitada); // o mesmo valor, agora como int

String notaDigitada1 = scanner.nextLine();                 // texto
double notaEstudante1 = Double.parseDouble(notaDigitada1); // double
```

**Por que não usar `scanner.nextInt()` ou `scanner.nextDouble()` direto?**
Quando testei com `nextDouble()`, a entrada não era capturada corretamente. Dois motivos explicam isso:

1. **O "Enter" fica para trás.** `nextInt()` e `nextDouble()` leem só o número e deixam a quebra de linha
   no buffer. O próximo `nextLine()` (como a pergunta "Deseja calcular a média? S ou N") lê essa linha
   vazia na hora e pula a resposta do usuário. Lendo tudo com `nextLine()`, cada linha digitada é
   consumida por inteiro e esse problema não acontece.
2. **O separador decimal depende do idioma do sistema.** Com o computador em português, `nextDouble()`
   espera vírgula (`7,5`) e falha com ponto (`7.5`). Já `Double.parseDouble()` sempre usa ponto,
   então o comportamento é o mesmo em qualquer máquina.

**Por que separar em `notaDigitada` / `notaEstudante` (e `idadeDigitada` / `idadeEstudante`)?**
- Os nomes deixam claro em que etapa o dado está: `...Digitada` é o texto cru vindo do teclado,
  `...Estudante` é o valor pronto para cálculo.
- A conversão fica visível em uma linha própria, o que facilita entender e depurar.
- O texto original continua guardado, então no futuro dá para validar a entrada (por exemplo,
  avisar o usuário se ele digitou letras no lugar de números, tratando a `NumberFormatException`)
  antes de converter.

### Decisão: aceitar "S" e "s" com `equalsIgnoreCase`
A resposta para calcular a média é comparada com `resposta.equalsIgnoreCase("s")`, então tanto `S`
quanto `s` funcionam. Strings em Java são comparadas com métodos (`equals`/`equalsIgnoreCase`), não com `==`.

### Próximos passos
- [ ] Tratar `NumberFormatException` quando o usuário digitar letras no lugar de números
- [ ] Formatar notas e média com duas casas decimais (`%.2f`)
- [ ] Fechar o `Scanner` ao final do programa

---

<!--
MODELO PARA NOVO EXERCÍCIO (copie o bloco abaixo, preencha e adicione uma linha no ÍNDICE)

## NomeDoExercicio
**Arquivo:** `NomeDoExercicio.java`

**Enunciado:** resumo do que o exercício pede.

**Conceitos praticados:** ...

### Decisão: título curto da decisão
O que foi feito, o que foi tentado antes (se houver) e por que essa escolha foi melhor.

### Próximos passos
- [ ] ...
-->
