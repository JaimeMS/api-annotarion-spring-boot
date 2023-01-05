Exemplo de como criar uma annotation customizada com spring boot
Criando uma Annotation  customizada para pegar as configurações do arquivo.properties

OBS. para melhor aproveitamento consular o repositório api-config-externalizada-spring-boot  antes.

Criar uma Annotation, informar que essa annotation é uma configuration 
e anotar com as annotations obrigatórias para criar uma annotation

EX:

-Anotações obrigatórias para criar uma annotation
@Target(ElementType.TYPE) - annotation para informar onde posso usar a annotation, nesse caso posso usar em um tipo.
@Retention(RetentionPolicy.RUNTIME) - annotation para fazer a verificação em tempo de execução

-Annotation de configuração que será herdada na classe de configuração
@Configuration

-Chamada do arquivo .properties de desenvolvimento 
@Profile("development")
public @interface Development {
}
