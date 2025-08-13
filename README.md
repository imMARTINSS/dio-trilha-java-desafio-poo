# Desafio de POO DIO: Modelando um iPhone

Este projeto é uma solução para o **Desafio de Programação Orientada a Objetos (POO)** proposto pela [Digital Innovation One (DIO)](https://www.dio.me/). O objetivo era modelar e implementar as funcionalidades de um iPhone, aplicando os principais pilares da POO em um cenário prático.

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

---

## 📱 Visão Geral do Projeto

O desafio consistiu em abstrair três papéis principais de um iPhone em componentes de software distintos e coesos:

1.  **Reprodutor Musical**
2.  **Aparelho Telefônico**
3.  **Navegador na Internet**

A classe `Iphone` atua como o dispositivo central, implementando todas essas funcionalidades de forma encapsulada.

---

## ✨ Conceitos Aplicados

Este projeto foi uma oportunidade para praticar e demonstrar os seguintes conceitos fundamentais da POO:

* **Abstração:** As funcionalidades foram abstraídas em interfaces (`MusicPlayer`, `TelephoneDevice`, `InternetBrowser`), definindo "contratos" que a classe principal deve seguir.
* **Encapsulamento:** O estado interno do iPhone, como a música que está tocando, é protegido e acessado apenas através de métodos públicos.
* **Interfaces:** A utilização de interfaces permitiu o desacoplamento do código, tornando-o mais flexível e modular.
* **Polimorfismo:** Embora não explorado em profundidade no `main`, a estrutura permite que o objeto `Iphone` seja tratado como qualquer um de seus tipos de interface (`MusicPlayer`, `TelephoneDevice`, etc.).

---

## 📂 Estrutura do Projeto

Todos os arquivos `.java` estão localizados no diretório raiz do projeto para simplificar a compilação e execução.

* `Iphone.java` (Classe principal que implementa as interfaces)
* `MusicPlayer.java` (Interface)
* `TelephoneDevice.java` (Interface)
* `InternetBrowser.java` (Interface)
* `IphoneCustomException.java` (Exceção customizada)
* `Main.java` (Classe executável)

---

## 🚀 Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/imMARTINSS/dio-trilha-java-desafio-poo.git
    ```
2.  **Navegue até o diretório do projeto.**

3.  **Compile todos os arquivos Java:**
    ```bash
    javac *.java
    ```
4.  **Execute a classe principal:**
    ```bash
    java Main
    ```

---

##  UML - Diagrama de Classes

O diagrama abaixo ilustra a arquitetura do projeto, mostrando a relação entre a classe `Iphone` e as interfaces que ela implementa.

![Diagrama UML do Projeto iPhone](https://github.com/imMARTINSS/dio-desafio-poo/blob/main/UML-dio-poo.png)

---

## 👨‍💻 Autor da Solução

* **Raul Pereira Martins**
    * [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/martinsraull/)
    * [![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/imMARTINSS)
    * [![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/raull__martinss/)
