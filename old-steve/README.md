# ⛏️ Projeto Refatoração POO - Velho Steve (Geração Caldeira 2026)

Este repositório contém o projeto desenvolvido durante as aulas de **Programação Orientada a Objetos (POO)** no programa **Geração Caldeira 2026**.

O objetivo principal foi pegar um código Java originalmente escrito de forma **Procedural** e refatorá-lo aplicando as boas práticas e conceitos do paradigma **Orientado a Objetos**.

---

## 📁 Estrutura do Projeto

O projeto foi estruturado seguindo as convenções e padrões do Java:

```text
GC-Java-2026/
└── old-steve/                 
    └── src/                   # Raiz do código-fonte (Sources Root) 
        ├── oldStevePOO.java   # Classe principal contendo a execução (main)    
        └── classes/           # Pacote com os modelos de objetos
            └── Picareta.java  # Definição e comportamentos da classe Picareta
```
## 🎯 Conceitos de POO Aplicados

Durante a refatoração, apliquei e consolidei os seguintes conceitos fundamentais:

### 1. Separação de Responsabilidades e Packages
* **Antes (Procedural):** Todo o código (execução e regras de negócio) estava contido em um único arquivo de forma procedural.
* **Depois (POO):** Isolei o modelo do objeto no pacote `classes`, mantendo a classe principal `oldStevePOO` focada apenas na execução da aplicação.

### 2. Encapsulamento e Estado do Objeto
* **Atributos Privados:** Os dados das picaretas (`material`, `durabilidade`, `forca`) foram definidos como `private`. Isso garante que o estado do objeto só possa ser modificado através dos seus próprios métodos, prevenindo alterações indevidas.
* **Uso da palavra-chave `this`:** Utilizada dentro da classe para referenciar explicitamente os atributos do próprio objeto (evitando ambiguidade com parâmetros locais).

### 3. Construtores
* **Antes:** Para criar e simular picaretas, era necessário criar variáveis soltas para cada atributo (`p1Mat`, `p1Dur`, `p1For`) e passá-las repetidamente como parâmetro para funções auxiliares.
* **Depois:** Implementação de um Construtor `public Picareta(String material, int durabilidade, int forca)`. Agora, o objeto é criado e inicializado diretamente em uma única linha usando a palavra-chave `new`.

### 4. Métodos de Instância
* **Mudança de Paradigma:** No código original, métodos como `minerar` e `repararPicareta` precisavam receber todos os dados da picareta por parâmetro e retornar um novo inteiro para atualizar variáveis soltas.
* **Na POO:** Como o método agora pertence à própria classe `Picareta`, ele lê e altera diretamente os seus próprios atributos internos.
* **Retorno `void`:** Os métodos mudaram para `void`, pois a alteração da durabilidade acontece internamente na própria instância da memória.

### 5. Sobrescrita do Método `toString()` (`@Override`)
* Foi implementado o método `@Override public String toString()` na classe `Picareta`. Isso permite que o Java converta o objeto em uma representação em texto amigável ao imprimi-lo.