package day36_InheritanceIntro.AnimalTask;

public class Tiger extends Animal{
    //     child         parent

    public void roar(){
        System.out.println(name + " is roaring");
    }

    public void hunt(){
        System.out.println(name + " is hunting.");
    }

}
/*
Tiger extends Animal:
			roar()        */