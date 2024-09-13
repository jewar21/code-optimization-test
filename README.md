
# Refactorization Quiz: Applying the SDLC Process

## Overview

This quiz is designed to test your ability to refactor code using **professional best practices**. Working in **pairs**, you will refactor provided code by improving its readability, efficiency, and scalability. You will also apply the **Software Development Life Cycle (SDLC)**, using structured phases to enhance the code. Each group will fork the repository, refactor the code, and submit a pull request with their improvements.

---

## Objectives

- Apply concepts from **Unit 1: Data Storage and Control Flow**:
  - Writing variables and constants
  - Arithmetic operators
  - Input/output system
  - Conditional operators
  - Control structures
  - Avoiding magic numbers
  - Lists of data with arrays
  - Basic SDLC principles

---

## SDLC Approach

You must follow the **SDLC process** to refactor the code:

1. **Phase 1: Requirements Analysis** – Understand the original code, identify its weaknesses, and define improvement requirements.
2. **Phase 2: Design** – Plan how to improve the code structure, renaming variables, optimizing logic, and making it more efficient.
3. **Phase 3: Implementation** – Refactor the code following your design plan, ensuring better readability and efficiency.
4. **Phase 4: Testing** – Test the refactored code with multiple inputs to ensure correctness and improvements.
5. **Phase 5: Documentation & Maintenance** – Write clear comments, and submit your final version, ensuring the code is easy to maintain.

---

## Instructions

1. **Repository Forking**:
   - Fork the repository to create a copy in your GitHub account.
   - Clone the repository to your local machine.

2. **Analyze the Code**:
   - Carefully read the provided code.
   - Identify magic numbers, unclear variable names, or inefficient logic.

3. **Refactor the Code**:
   - Improve the variable names, replace magic numbers with constants, and optimize the control structures.
   - Make sure to add comments explaining the logic and changes you made.
   - Apply **arrays** where repetition of variables exists.

4. **Test the Refactored Code**:
   - Run the program with different inputs to validate that the refactored code functions as expected.
   - Ensure the program handles errors gracefully (e.g., invalid input, edge cases).

5. **Submit Your Work**:
   - Once you complete the refactorization, push your changes to your forked repository.
   - Create a pull request (PR) to the original repository, explaining the improvements you made and how you followed the **SDLC** approach.

Documentacion:

quiz realizado el 9/13/2024 por Luis Jose -192239 y Sergio Diaz- 192357

Se hizo reafactorizacion al codigo stogare añadiendo: 
 -2 arrays para guardar tanto los valores de precio como los valores de la cantidad de objetos vendidos
 -Se añadio un for que funcionara para calcular el total de la venta

 Se refactorizo en ageValidation:
  -Se agrego una constante para definir los limites de edad
  -Se añadio un scanner para que el usuario pueda ingresar su edad
  -Un if adicional para los casos en que se digiten valores menores a 0

Se refactorizo en TaxCalculation:
 -Los nombres para TAX_RATE_HIGH, TAX_RATE_LOW y TAX_THRESHOLD añadiendo sus respectivos valores
 -Se creo un array que almacenara el valor de los productos
 -Se reemplazaron todos los valores magicos
