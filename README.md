<h1 align="center"> Java Spring Boot</h1>

<h3 align="center">Desafio Back-end Attornatus </h3>

#### Criando uma API REST com banco de dados usando Java e Spring Boot 

Usando Spring boot, crie uma API simples para gerenciar Pessoas com os seguintes casos de uso:      

•	Editar uma pessoa        
•	Buscar todos usuários       
•	Buscar um usuário pelo seu id      
•	Criar endereço para pessoa       
•	Inserir um novo usuário        

### Pré-requisitos

- Lógica de programação   
- Programação orientada a objetos   
- Clean Code
- Ferramentas
  - Spring Initializr
  - IntelliJ IDEA 
  - Postman

### Passos do projeto

- Mapeamento objeto-relacional com JPA
- Configurando o banco de dados H2
- Criando os endpoints da API REST
- Testes

![pronto](https://user-images.githubusercontent.com/88461178/211221761-f1ecc86f-9474-4697-b653-59186edf23fd.jpg)

### Desenvolvimento moderno: relacional -> objeto -> json

![2](https://user-images.githubusercontent.com/88461178/211221719-4af06cc8-1e5c-4958-8630-e550cf08cd34.jpg)

### Trechos de código para copiar

#### Configuração do Maven Resources Plugin

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version>
</plugin>
```

#### Configurações do banco de dados

```
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

#### Script SQL

```sql
INSERT INTO tb_person(name, birth_Date, address) VALUES ('Maria','25-01-1990', 'Belo Horizonte');
INSERT INTO tb_person(name, birth_Date, address) VALUES ('Jose', '30-06-1961', 'São Paulo');



INSERT INTO tb_address(street, zip_Code, number, city) VALUES ('Praca sete', '10002-874','200', 'Belo Horizonte');
INSERT INTO tb_address(street, zip_Code, number, city) VALUES ('Rua um', '30000-145', '001', 'São Paulo');
INSERT INTO tb_address(street, zip_Code, number, city) VALUES ('Rua Tamoios', '78925-963','150', 'Salvador');
INSERT INTO tb_address(street, zip_Code, number, city) VALUES ('Rua cinco', '21150-569', '30', 'Rio de Janeiro');

```


<h3 align="center"> Autora: Artemiza Rocha </h3>   

<div align="center">
  <a href="https://www.linkedin.com/in/artemiza-rocha/a" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a> 
  <a href="https://github.com/Mizarocha" target="_blank"><img src="https://img.shields.io/badge/-GITHUB-%23E4405F?style=for-the-badge&logo=github&logoColor=white" target="_blank"></a>
  </div>

<h4 align="center">Desenvolvido com 💜 </h4>

