# Soru 10 - ArrayList'ten turetilen Stack
MyStack, ArrayList'i genisletir ve yigin islemlerini sunar.
`mermaid
classDiagram
  class ArrayList~E~
  class MyStack~E~ {
    +push(E) void
    +pop() E
    +peek() E
    +isEmptyStack() boolean
    +getSize() int
  }
  ArrayList~E~ <|-- MyStack~E~
`
BES string girilir ve pop metoduyle ters sirada yazdirilir.