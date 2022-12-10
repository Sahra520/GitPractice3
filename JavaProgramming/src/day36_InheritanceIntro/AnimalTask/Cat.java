package day36_InheritanceIntro.AnimalTask;

public class Cat extends Animal{
    //     child         parent

    public void scratch(){
        System.out.println(name + " is scratching.");
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }

}
/*
	Cat extends Animal:
			scratch()
 */