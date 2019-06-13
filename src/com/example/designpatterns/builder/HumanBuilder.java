package com.example.designpatterns.builder;

public class HumanBuilder {
    private int age;
    private String name;
    private int sex;

    // これはなくてもいいかも
    public HumanBuilder(String name, int age, int sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(final int sex) {
        this.sex = sex;
    }

    public static class Builder {

        private int age;
        private String name;
        private int sex;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder sex(Integer sex) {
            this.sex = sex;
            return this;
        }

        public HumanBuilder build() {
            return new HumanBuilder(this);
        }
    }

    private HumanBuilder(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }


}
