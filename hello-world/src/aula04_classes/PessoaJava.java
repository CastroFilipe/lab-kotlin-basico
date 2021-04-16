package aula04_classes;

import java.util.Objects;

public class PessoaJava {

    private final String name;

    private final Integer age;

    public PessoaJava(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public PessoaKotlin getPessoaKotlin() {
        PessoaKotlin pessoaKotlin = new PessoaKotlin("Filipe Kotlinzeiro", 28);
        return pessoaKotlin;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PessoaJava{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
