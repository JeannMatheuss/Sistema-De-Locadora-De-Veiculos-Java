# 🚗 Projeto Veículo Locadora  

## 📌 Descrição  

Este projeto simula o funcionamento de uma locadora de veículos, permitindo o cálculo do custo do aluguel de um veículo, aplicação de descontos e, futuramente, o cálculo de multas por devolução atrasada.  

## ✨ Funcionalidades  

- 📅 **Cálculo do custo do aluguel:** O sistema calcula o custo total do aluguel com base na quantidade de dias alugados.  
- 💰 **Desconto de 10%:** Se o aluguel for de 7 dias ou mais, um desconto de 10% é aplicado automaticamente.  
- ⚠️ **Cálculo de multas:** *(A ser implementado)* Cálculo de multas por devolução atrasada.  

---

## 🏗️ Estrutura do Projeto  

### 📂 Classes  

#### 🔹 `Veiculo`  

A classe `Veiculo` representa os veículos da locadora e contém métodos para cálculo do custo do aluguel e aplicação de descontos.  

- **Atributos:**  
  - `modelo (String)`: Modelo do veículo.  
  - `valorDiaria (double)`: Valor da diária do aluguel.  

- **Métodos:**  
  - `calcularCusto(int dias)`: Retorna o custo total do aluguel com base nos dias alugados.  
  - `desconto(int dias)`: Aplica um desconto de 10% caso o aluguel seja de 7 dias ou mais.  

#### 🔹 `VeiculoTest`  

A classe `VeiculoTest` é responsável por validar o comportamento da classe `Veiculo` utilizando testes unitários com JUnit.  

- **Testes Implementados:**  
  ✅ Cálculo do custo sem e com desconto.  
  ✅ Testes de cenários extremos, como aluguel de 0 dias ou valores de diária negativos.  

---

## 🛠️ Testes Unitários com JUnit  

O projeto utiliza **JUnit 5** para validar o comportamento da classe `Veiculo`.  

### 🔍 Testes Implementados  

- **Cálculo correto do custo do aluguel sem desconto**  
- **Aplicação do desconto de 10% para aluguéis de 7 dias ou mais**  
- **Testes extremos:**  
  - Aluguel de 0 dias (deve retornar custo zero).  
  - Valor da diária negativo (deve retornar custo zero).  
