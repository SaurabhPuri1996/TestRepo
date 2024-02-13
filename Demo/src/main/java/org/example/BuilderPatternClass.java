package org.example;

/**
 * @author saurabhpuri on 10/02/24
 */

public class BuilderPatternClass {

    private String name;
    private int age;

    private BuilderPatternClass(BuilderHelper builderHelper){
        //initatize
        this.name = builderHelper.name;
        this.age = builderHelper.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static class BuilderHelper{

        private String name;
        private int age;


        public String getName() {
            return name;
        }

        public BuilderHelper setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public BuilderHelper setAge(int age) {
            this.age = age;
            return this;
        }

        public BuilderPatternClass build(){
            BuilderPatternClass builderPatternClass = new BuilderPatternClass(this);
            return builderPatternClass;
        }
    }
}
