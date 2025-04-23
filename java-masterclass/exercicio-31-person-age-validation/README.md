# Exercício: Person Class and Age Validation

## Descrição

Este exercício consiste em criar uma classe `Person` com os seguintes campos:
- `firstName` (String)
- `lastName` (String)
- `age` (int)

A classe implementa métodos para acessar e modificar esses campos, verificar se a pessoa é adolescente (idade entre 13 e 19), e gerar o nome completo com regras específicas para lidar com campos vazios.

## Código

### Person.java

```java
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (lastName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
        return this;
    }
}
```

### MainExerc31.java

```java
public class MainExerc31 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
```

## Instruções para Execução

1. Salve os arquivos `Person.java` e `MainExerc31.java`.
2. Compile com:
   ```
   javac Person.java MainExerc31.java
   ```
3. Execute com:
   ```
   java MainExerc31
   ```
4. Verifique a saída no console conforme os testes definidos.