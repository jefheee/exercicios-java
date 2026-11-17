# Exercícios em Java

Repositório dedicado aos exercícios práticos desenvolvidos em Java durante a graduação em Análise e Desenvolvimento de Sistemas (ADS).

## Sobre o Projeto

Os exercícios presentes neste repositório exploram os fundamentos da linguagem Java, incluindo declaração e manipulação de variáveis, entrada e saída de dados com caixas de diálogo (`javax.swing.JOptionPane`), estruturas de controle e lógica de programação.

## Tecnologias Utilizadas

- **Linguagem:** Java (JDK 24)
- **Interface de Entrada/Saída:** `javax.swing.JOptionPane`
- **IDE / Build:** Apache NetBeans (`Ant` via `build.xml`)

## Estrutura do Repositório

```text
exercicios-java/
├── nbproject/          # Configurações do projeto NetBeans
├── src/
│   └── Principal/      # Código-fonte dos exercícios (Exercício4.java a Exercício18.java)
├── build.xml           # Script de build do Apache Ant
├── manifest.mf         # Manifesto da aplicação
└── README.md
```

## Como Executar

### Pelo Apache NetBeans
1. Abra o Apache NetBeans.
2. Vá em **File > Open Project** e selecione a pasta raiz do repositório.
3. No painel de projetos, navegue até `src/Principal`, clique com o botão direito sobre o exercício desejado (ex.: `Exercício4.java`) e selecione **Run File** (`Shift + F6`).

### Pela Linha de Comando
Certifique-se de ter o JDK 24 (ou superior) instalado e configurado no `PATH`.

```bash
# Compilar os arquivos
javac -d build/classes src/Principal/*.java

# Executar um exercício específico (exemplo: Exercício4)
java -cp build/classes Principal.Exercício4
```
