![GitHub repo size](https://img.shields.io/github/repo-size/JaimeDevS/api-crud-springboot?style=plastic)
![GitHub](https://img.shields.io/github/license/JaimeDevS/api-crud-springboot?style=plastic)
![GitHub top language](https://img.shields.io/github/languages/top/JaimeDevS/api-crud-springboot?style=plastic)

# Annotation com Java Spring Boot

Exemplo de annotations com Java Spring Boot

![spring](https://github.com/JaimeDevS/spring-boot-docker/blob/master/spring.png) 

## Pré-requisitos

* [Lombok](https://projectlombok.org/setup/maven "Lombok")  - framework para eliminar a verbosidade.
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa "JPA")  - framework que tornar a integração de aplicações Spring com a JPA (Java Persistence API).  
* [Spring Web](https://mvnrepository.com/artifact/org.springframework/spring-web "Spring Web]")  - framework que permite a visualização de dados geográficos armazenados em um servidor remoto.
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html "Docker hub")  - ferramenta para reiniciar automaticamente a aplicação durante o desenvolvimento.
* [MySql Driver](https://spring.io/guides/gs/accessing-data-mysql/ "MySql") - Driver de conxão com o Banco de Dado MySql.
* [JDK](https://www.oracle.com/br/java/technologies/downloads/#java17) - JDK necessário para executar a aplicação.
* [Spring Tools](https://spring.io/tools) - Ferramenta para o desenvolvimento.
* [OBS 1. para melhor aproveitamento consular o repositório api-config-externalizada-spring-boot antes.](https://github.com/JaimeMS/api-config-externalizada-spring-boot)
* OBS 2. Leia o código para melhor entendimento da explicação.

## Começando
- Acesse o link para fazer o download da aplicação pré estruturada, nele já é possível baixar todas as dependências do projeto.
```
https://start.spring.io/
```
## Criando uma Annotation customizada para pegar as configurações do arquivo.properties

- Criar uma Annotation, informar que essa annotation é uma configuration e anotar com as annotations obrigatórias para criar uma annotation

#### EX:

- Anotações obrigatórias para criar uma annotation para informar onde posso usar a annotation, nesse caso posso usar em um tipo. 
```
@Target(ElementType.TYPE)
```
- annotation para fazer a verificação em tempo de execução 
```
@Retention(RetentionPolicy.RUNTIME)
```
- Annotation de configuração que será herdada na classe de configuração 
```
@Configuration
```
- Chamada do arquivo .properties de desenvolvimento 
```
@Profile("development") 
public @interface Development { 
 ...
}
```
