# Maratona Java - DevDojo (Virado no Jiraya)

Repositório contendo códigos práticos, exercícios e implementações desenvolvidos ao longo do curso **Maratona Java** do canal [DevDojo](https://www.youtube.com/c/DevDojoBrasil), ministrado por William Suane.

---

## 📚 Conteúdos Abordados

O repositório está estruturado em tópicos progressivos da linguagem Java (do zero ao avançado):

### 1. Fundamentos & Programação Estruturada
- Tipos primitivos, operadores aritméticos, lógicos e relacionais.
- Estruturas condicionais (`if`, `else`, `switch-case`).
- Estruturas de repetição (`while`, `do-while`, `for`, `break`, `continue`).
- Arrays unidimensionais e multidimensionais.

### 2. Programação Orientada a Objetos (POO)
- Classes, atributos, métodos e parâmetros.
- Sobrecarga de métodos e construtores.
- Blocos de inicialização (estáticos e não-estáticos).
- Associação entre classes (agregação e composição).
- Modificador `static` e `final`.
- Enumerações (`enum`) e métodos customizados.
- Herança, polimorfismo e sobrescrita de métodos (`@Override`).
- Classes e métodos abstratos (`abstract`).
- Interfaces e métodos `default`.

### 3. Tratamento de Exceções
- Hierarquia de exceções (`Throwable`, `Exception`, `RuntimeException`, `Error`).
- Blocos `try-catch-finally` e múltiplos catches.
- `try-with-resources` e a interface `AutoCloseable`.
- Criação e boas práticas com exceções customizadas.

### 4. Utilitários, I/O, NIO & Serialização
- Classes Wrapper (`Integer`, `Double`, autoboxing e unboxing).
- Manipulação de Strings (`String`, `StringBuilder`, `StringBuffer` e análise de performance).
- Datas e Horas (`Date`, `Calendar`, `LocalDate`, `LocalTime`, `LocalDateTime`, `Instant`, `Duration`, `Period`, `ChronoUnit`, `TemporalAdjusters`, `ZonedDateTime`).
- Formatação e Internacionalização (`Locale`, `DateFormat`, `SimpleDateFormat`, `DateTimeFormatter`, `NumberFormat`, `ResourceBundle`).
- Expressões Regulares (`Pattern`, `Matcher`, `Scanner`).
- Leitura e Escrita de Arquivos (`File`, `FileWriter`, `FileReader`, `BufferedWriter`, `BufferedReader`).
- Java NIO.2 (`Path`, `Paths`, `Files`, `BasicFileAttributes`, `DosFileAttributes`, `PosixFileAttributes`, `DirectoryStream`, `SimpleFileVisitor`, `PathMatcher`, `ZipOutputStream`).
- Serialização de objetos (`Serializable`, `ObjectOutputStream`, `ObjectInputStream`).

### 5. Coleções & Generics
- `equals()`, `hashCode()`, `Comparable` e `Comparator`.
- `List` (`ArrayList`, `LinkedList`), `BinarySearch`, `Iterator`.
- `Set` (`HashSet`, `LinkedHashSet`, `TreeSet`, `NavigableSet`).
- `Map` (`HashMap`, `LinkedHashMap`, `TreeMap`, `NavigableMap`).
- `Queue` e `PriorityQueue`.
- Generics: classes genéricas, métodos genéricos e Wildcards (`?`, `? extends`, `? super`).

### 6. Programação Funcional & Java Moderno
- Classes Internas (aninhadas, locais e anônimas).
- Parametrização de comportamentos.
- Lambdas e Interfaces Funcionais (`Predicate`, `Consumer`, `Function`, Method References).
- `Optional` e boas práticas contra `NullPointerException`.
- Stream API: `filter`, `map`, `flatMap`, `reduce`, `Collectors`, `groupingBy`, `summarizing` e Parallel Streams.

### 7. Threads & Concorrência (`java.util.concurrent`)
- Ciclo de vida de Threads, prioridades, `yield`, `join`, `synchronized`, Deadlocks e `wait`/`notify`.
- Variáveis atômicas (`AtomicInteger`).
- Locks explícitos (`ReentrantLock`, `ReentrantReadWriteLock`, `Condition`).
- Coleções concorrentes (`CopyOnWriteArrayList`, `ArrayBlockingQueue`, `LinkedTransferQueue`).
- `Executors`, Thread Pools, `ScheduledExecutorService`, `Callable`, `Future` e `CompletableFuture`.

### 8. Padrões de Projeto, JDBC, CRUD & Testes Unitários
- Design Patterns: `Builder`, `Factory`, `Singleton` (Eager, Lazy, Enum) e `DTO`.
- JDBC com MySQL (`ConnectionFactory`, `Statement`, `PreparedStatement`, `CallableStatement`, `JdbcRowSet`, `CachedRowSet`, transações e `Log4j2`).
- Aplicação CRUD completa em camadas (`Repository`, `Service`, `Domain`).
- Testes Unitários com **JUnit 5** (`@Test`, `@BeforeEach`, `@DisplayName`, `Assertions`).

### 9. Revisão & Exercícios Práticos
- Pacote com exercícios práticos de fixação e validação de regras de negócio (`exerciciosrevisão`).

---

## 🛠️ Tecnologias Utilizadas
- **Java (JDK 21)**
- **Apache Maven**
- **JUnit 5**
- **Lombok & Log4j2**
- **MySQL + Docker Compose** (módulos JDBC/CRUD)
- **IntelliJ IDEA**
- **Git & GitHub**
