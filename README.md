# Projeto school  (README)

## Sobre o teste.

Como pedido para o projeto, utilizei: 

- Java 11, Maven 3+ , Spring Boot, Spring Web, Bean Validation, Spring Data JPA

  

  ##	Os seguintes end-points foram implementados.

- `POST /courses/{code}/enroll` (Esse end-point cadastra um aluno em um curso.)
- `GET /courses` (Esse end-point que não estava funcionando, agora está retornando uma lista de cursos)
- `GET /courses/enroll/report` (Esse end-point mostra o relatório de e-mail de alunos com a quantidade de matrícula.)

OBS  =>  O end-point que retornaria um relatório em Json com os campos "email:" e "quantidade_matriculas:" está aparecendo apenas o resultado da pesquisa e não especificando o que é cada campo.

Segue o exemplo.

```
GET /courses/enroll/report
[
    {
        "alex@alura.com.br",
        10
    },
    {
        "caio@alura.com.br",
        5
    }
]
```

Tentei utilizar vários métodos, desde criar um DTO com esses campos, até tentei fazer algumas projections mas não obtive sucesso, sempre me retornava uma exception do tipo "ConverterNotFoundException".

Nesse teste, consegui aprender bastante, já criei algumas Api's mas nunca utilizei nada parecido como esses end-points pedidos, foi um grande aprendizado e de qualquer forma consegui evoluir em meus códigos.

