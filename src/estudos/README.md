# ESTUDOS

Classes curtas para explorar a sintaxe do Java e o IntelliJ IDEA. Cada arquivo foca em um assunto
e tem comentários explicando o que está acontecendo. Aqui ficam o índice e **o que aprendi / decidi** em cada estudo.

### ÍNDICE
| Estudo | Arquivo | Assunto |
|---|---|---|
| Perfil | `Perfil.java` | Primeiro programa: `System.out.println` |
| Estudos | `Estudos.java` | Variáveis, atribuição (`=`, `+=`) e operadores aritméticos |
| Soma / Subtracao | `Soma.java`, `Subtracao.java` | Operações simples impressas no terminal |
| OperadorAritmetico | `OperadorAritmetico.java` | Operadores aritméticos *(em construção)* |
| OperadorRelacional | `OperadorRelacional.java` | `==`, `!=`, `>`, `<`, `&&`, `\|\|`, `!` e `if/else` |
| OperadoresLogicos | `OperadoresLogicos.java` | Operadores lógicos *(em construção)* |
| OperadoresIncrementadores | `OperadoresIncrementadores.java` | Pré-incremento (`++x`) x pós-incremento (`x++`) |
| StringsTextBlocks | `StringsTextBlocks.java` | Comparação de Strings, text blocks, `String.format` e `formatted()` |
| Scaning | `Scaning.java` | Ler dados do teclado com `Scanner` |
| Casting | `Casting.java` | Conversão de tipos: casting implícito (widening) e explícito (narrowing) |
| Functions | `Functions.java` | Métodos/funções *(em construção)* |

### COMO RODAR
Pelo IntelliJ, abra o arquivo e clique no ▶️ ao lado do `main`. Pelo terminal (na raiz do repositório):
```bash
javac -d out $(find src -name "*.java")
java -cp out estudos.StringsTextBlocks
```

---

## Aprendizados e decisões

### `main` sem `String[] args` e `void main()` solto (Java 25)
Alguns estudos usam `public static void main()` sem parâmetros, e `Estudos.java` usa só `void main()`
sem nem declarar uma classe. Isso é possível porque o Java 25 trouxe os **métodos `main` de instância**
e os **arquivos com classe implícita**: para estudos rápidos, dá para escrever menos código cerimonial.
Nos exercícios e projetos mantenho a forma tradicional `public static void main(String[] args)`,
que é a que aparece em qualquer código Java existente.

### Comparar Strings com `equals()` e não com `==` (`StringsTextBlocks`)
No estudo testei as duas formas. `==` compara se as duas variáveis apontam para **o mesmo objeto** na
memória; `equals()` compara **o conteúdo**. O `==` até funcionou no exemplo porque textos literais iguais
são reaproveitados pelo Java, mas com textos vindos do teclado (`Scanner`) ele falha.
**Decisão:** sempre usar `equals()` (ou `equalsIgnoreCase()`) para comparar Strings.

### Pré x pós-incremento (`OperadoresIncrementadores`)
`++x` incrementa **antes** de usar o valor; `x++` usa o valor atual e só **depois** incrementa.
Isso só faz diferença quando o incremento está dentro de uma expressão (como `int r = x++;`).

### Divisão entre inteiros (`Estudos`)
`a / b` com dois `int` descarta a parte decimal (`110 / 20` dá `5`), mesmo guardando o resultado em um `double`.
Para ter `5.5`, pelo menos um dos lados precisa ser `double` antes da conta.

---

<!--
MODELO PARA NOVO ESTUDO (adicione uma linha no ÍNDICE e, se houver algo importante, uma seção abaixo)
≠
### Título do aprendizado (`NomeDaClasse`)
O que eu esperava, o que aconteceu e qual regra/decisão tirei disso.
-->
