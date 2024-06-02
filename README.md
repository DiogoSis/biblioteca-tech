## API Biblioteca Tech
------------------------

#### Java || Spring || S3

- Armazenamento Statico do JSON na S3
- somente o metodo Get foi aplicado na API

Dependencias utilizadas
 - Spring Boot Dec Tools
   - Ferramenta para facilitar o desenvolvimento em Spring Boot, proporcionando recarregamento automático das mudanças no código e outras melhorias para acelerar o ciclo de desenvolvimento
 - Lombok
   - Biblioteca que reduz a quantidade de código boilerplate (repetitivo) no Java, gerando automaticamente getters, setters, construtores, e outros métodos comuns.
 - Spring Web
   - Módulo do Spring que permite criar aplicações web e serviços RESTful, facilitando o desenvolvimento de APIs.
 - Open Feign
   - HTTP declarativo, usado para chamar serviços HTTP externos de maneira simples, facilitando a comunicação entre microserviços.

#### Exemplo que requisição

``` JSON
   GET /api/books
   Content-Type: application/json

    {
        "title": "Código Limpo: Habilidades Práticas do Agile Software",
        "author": "Robert C. Martin",
        "area": "Engenharia de Software, Qualidade de Código",
        "image": "https://images-na.ssl-images-amazon.com/images/I/51a5d3yZVvL._SX379_BO1,204,203,200_.jpg",
        "publisher": "Alta Books",
        "year_of_publication": "2009",
        "isbn": "978-8576082675"
    }
```

#### Contribuição

1. Fork o projeto
2. Crie uma nova branch (git checkout -b feature/nova-funcionalidade)
3. Faça o commit das suas alterações (git commit -m 'Adiciona nova funcionalidade')
4. Faça o push para a branch (git push origin feature/nova-funcionalidade)
5. Abra um Pull Request


   
   
   