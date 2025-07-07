# Correção

## Diagrama

- multiplicidades ausentes entre App e MouseHandler, entre MouseHandler e Forma
- a tag <<Classe>> não é padrão UML
- a tag <<Abstract>> representa classes abstratas
  - geralmente classes abstratas possuem métodos abstratos
  - esses são representados pela fonte itálica
  - olhando seu diagrama, vou assumir que nenhum método é abstrato
- se Forma implementa a interface Desenhavel, não é necessário também indicar associação simples entre elas

## Implementação

- polimorfismo não indicado em lugar algum
- a ideia de separar uma classe para lidar como mouse e outra com o teclado é boa
  - infelizmente, o seu MouseHandler lida com os dois :( SRP is sad

## Requisitos funcionais

- [x] Impressão com o mouse
- [x] Seleção de figuras
- [x] Seleção de cores
- [ ] Seleção de modo
- [x] Seleção de tamanho
- [ ] Movimento
- [x] Limpeza
- [x] Processamento

Com a seleção de modo, você muda apenas a cor da borda,
mas vazado é sem cor na área

## Nota

8
