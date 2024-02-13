package org.example;

/**
 * @author saurabhpuri on 10/02/24
 */

public class DriverClass{


    public static BuilderPatternClass getBuilderPatterObject(){
        return new BuilderPatternClass.BuilderHelper().setAge(10).setName("user1").build();
    }

    public static void main(String[] args){
        System.out.println(getBuilderPatterObject());
    }
}
